/*******************************************************************************
 * Copyright (c) 2004, 2006
 * Thomas Hallgren, Kenneth Olwing, Mitch Sonies
 * Pontus Rydin, Nils Unden, Peer Torngren
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the individual
 * copyright holders listed above, as Initial Contributors under such license.
 * The text of such license is available at www.eclipse.org.
 *******************************************************************************/

package org.eclipse.b3.util;

import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * @author filip.hrbek@cloudsmith.com
 */
public abstract class ExceptionUtils {
	public static IStatus createStatus(String message, Object... args) {
		return createStatus(null, message, args);
	}

	public static IStatus createStatus(Throwable cause) {
		return (cause instanceof CoreException)
				? ((CoreException) cause).getStatus()
				: new Status(IStatus.ERROR, B3Util.getPluginID(), IStatus.OK, cause.getMessage(), cause);
	}

	public static IStatus createStatus(Throwable cause, String message, Object... args) {
		if(args.length > 0)
			message = String.format(message, args);
		return new Status(IStatus.ERROR, B3Util.getPluginID(), IStatus.OK, message, cause);
	}

	public static void deeplyPrint(Throwable e, PrintStream strm, boolean stackTrace) {
		deeplyPrint(e, strm, stackTrace, 0);
	}

	public static CoreException fromMessage(String message, Object... args) {
		return fromMessage(null, message, args);
	}

	public static CoreException fromMessage(Throwable cause, String message, Object... args) {
		CoreException ce = new CoreException(createStatus(cause, message, args));
		if(cause != null)
			ce.initCause(cause);
		return ce;
	}

	public static Throwable unwind(Throwable t) {
		for(;;) {
			Class<?> tc = t.getClass();

			// We don't use instanceof operator since we want
			// the explicit class, not subclasses.
			//
			if(tc != RuntimeException.class && tc != InvocationTargetException.class && tc != SAXException.class &&
					tc != IOException.class)
				break;

			Throwable cause = t.getCause();
			if(cause == null)
				break;

			String msg = t.getMessage();
			if(msg != null && !msg.equals(cause.toString()))
				break;

			t = cause;
		}
		return t;
	}

	public static CoreException unwindCoreException(CoreException exception) {
		IStatus status = exception.getStatus();
		while(status != null && status.getException() instanceof CoreException) {
			exception = (CoreException) status.getException();
			status = exception.getStatus();
		}
		return exception;
	}

	public static CoreException wrap(IStatus status) {
		CoreException e = new CoreException(status);
		Throwable t = status.getException();
		if(t != null)
			e.initCause(t);
		return e;
	}

	public static CoreException wrap(Throwable t) {
		t = unwind(t);
		if(t instanceof CoreException)
			return unwindCoreException((CoreException) t);

		if(t instanceof OperationCanceledException || t instanceof InterruptedException)
			return new CoreException(Status.CANCEL_STATUS);

		String msg = t.toString();
		if(t instanceof SAXParseException) {
			SAXParseException se = (SAXParseException) t;
			StringBuffer bld = new StringBuffer(msg);
			bld.append(": "); //$NON-NLS-1$
			bld.append(se.getSystemId());
			bld.append(" at line: "); //$NON-NLS-1$
			bld.append(se.getLineNumber());
			bld.append(" column: "); //$NON-NLS-1$
			bld.append(se.getColumnNumber());
			msg = bld.toString();
		}
		return fromMessage(t, msg);
	}

	private static void appendLevelString(PrintStream strm, int level) {
		if(level > 0) {
			strm.print("[0"); //$NON-NLS-1$
			for(int idx = 1; idx < level; ++idx) {
				strm.print('.');
				strm.print(level);
			}
			strm.print(']');
		}
	}

	private static void deeplyPrint(CoreException ce, PrintStream strm, boolean stackTrace, int level) {
		appendLevelString(strm, level);
		if(stackTrace)
			ce.printStackTrace(strm);
		deeplyPrint(ce.getStatus(), strm, stackTrace, level);
	}

	private static void deeplyPrint(IStatus status, PrintStream strm, boolean stackTrace, int level) {
		appendLevelString(strm, level);
		String msg = status.getMessage();
		strm.println(msg);
		Throwable cause = status.getException();
		if(cause != null) {
			strm.print("Caused by: "); //$NON-NLS-1$
			if(stackTrace || !(msg.equals(cause.getMessage()) || msg.equals(cause.toString())))
				deeplyPrint(cause, strm, stackTrace, level);
		}

		if(status.isMultiStatus()) {
			IStatus[] children = status.getChildren();
			for(int i = 0; i < children.length; i++)
				deeplyPrint(children[i], strm, stackTrace, level + 1);
		}
	}

	private static void deeplyPrint(Throwable t, PrintStream strm, boolean stackTrace, int level) {
		if(t instanceof CoreException)
			deeplyPrint((CoreException) t, strm, stackTrace, level);
		else {
			appendLevelString(strm, level);
			if(stackTrace)
				t.printStackTrace(strm);
			else {
				strm.println(t.toString());
				Throwable cause = t.getCause();
				if(cause != null) {
					strm.print("Caused by: "); //$NON-NLS-1$
					deeplyPrint(cause, strm, stackTrace, level);
				}
			}
		}
	}
}
