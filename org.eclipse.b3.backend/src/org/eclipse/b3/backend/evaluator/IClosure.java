/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;

/**
 * Defines the behavior for an object that has a closure.
 * 
 */
public interface IClosure {
	BExecutionContext getClosure();
}
