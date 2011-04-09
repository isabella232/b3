/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */
package org.eclipse.b3.aggregator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Receiver</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @see org.eclipse.b3.aggregator.AggregatorPackage#getLinkReceiver()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LinkReceiver {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model required="true" sourceRequired="true"
	 * @generated
	 */
	boolean acceptsSource(LinkSource source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	EList<LinkSource> getLinkedSources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model sourceRequired="true"
	 * @generated
	 */
	void linkSource(LinkSource source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model sourceRequired="true"
	 * @generated
	 */
	void unlinkSource(LinkSource source);

} // LinkReceiver