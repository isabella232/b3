/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.p2view;

import org.eclipse.b3.aggregator.ChildrenProvider;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Fragments</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.p2view.Fragments#getFragments <em>Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getFragments()
 * @model
 * @generated
 */
public interface Fragments extends ChildrenProvider<Fragment> {
	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.p2view.Fragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Fragments</em>' reference list.
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getFragments_Fragments()
	 * @model
	 * @generated
	 */
	EList<Fragment> getFragments();

} // Fragments
