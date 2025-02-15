/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.core.runtime;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.emf.ecore.EClass;

import com.google.inject.Provider;

/**
 * A Guice Provider making it possible to bind to creation of model based classes
 * in the B3Backend model.
 * 
 * @param <T>
 */
public class B3BackendModelProvider<T> implements Provider<T> {
	static <T> Provider<T> create(Class<T> type, EClass eclass) {
		return new B3BackendModelProvider<T>(type, eclass);
	}

	final Class<T> type;

	final EClass eclass;

	public B3BackendModelProvider(Class<T> type, EClass eclass) {
		this.type = type;
		this.eclass = eclass;
	}

	public T get() {
		return type.cast(B3backendFactory.eINSTANCE.create(eclass));
	}
}
