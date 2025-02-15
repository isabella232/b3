/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.build.impl;

import java.net.URI;

import org.eclipse.b3.backend.core.exceptions.B3InternalError;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralAny;
import org.eclipse.b3.backend.evaluator.b3backend.BRegularExpression;
import org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.PathGroup;
import org.eclipse.b3.build.PathGroupPredicate;
import org.eclipse.b3.build.PathVector;
import org.eclipse.b3.build.core.iterators.PathIterator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Group Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.PathGroupPredicateImpl#getPathVector <em>Path Vector</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.PathGroupPredicateImpl#getPathPattern <em>Path Pattern</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PathGroupPredicateImpl extends BExpressionImpl implements PathGroupPredicate {
	/**
	 * The cached value of the '{@link #getPathVector() <em>Path Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPathVector()
	 * @generated
	 * @ordered
	 */
	protected PathVector pathVector;

	/**
	 * The cached value of the '{@link #getPathPattern() <em>Path Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPathPattern()
	 * @generated
	 * @ordered
	 */
	protected BExpression pathPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PathGroupPredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPathPattern(BExpression newPathPattern, NotificationChain msgs) {
		BExpression oldPathPattern = pathPattern;
		pathPattern = newPathPattern;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN, oldPathPattern,
				newPathPattern);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPathVector(PathVector newPathVector, NotificationChain msgs) {
		PathVector oldPathVector = pathVector;
		pathVector = newPathVector;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR, oldPathVector, newPathVector);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR:
				return getPathVector();
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN:
				return getPathPattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR:
				return basicSetPathVector(null, msgs);
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN:
				return basicSetPathPattern(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR:
				return pathVector != null;
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN:
				return pathPattern != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR:
				setPathVector((PathVector) newValue);
				return;
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN:
				setPathPattern((BExpression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR:
				setPathVector((PathVector) null);
				return;
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN:
				setPathPattern((BExpression) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getPathPattern() {
		return pathPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PathVector getPathVector() {
		return pathVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean removeMatching(PathGroup pathGroup) {
		if(pathPattern == null && pathVector == null)
			throw new B3InternalError("PathGroupPredicate has neither pattern nor path vector");

		// optimize for "remove all" (no need to iterate, just delete everything)
		if(pathPattern != null && pathPattern instanceof BLiteralAny) {
			if(pathGroup.getPathVectors().size() == 0)
				return false; // already empty
			pathGroup.getPathVectors().clear();
			return true;
		}

		// iterate over output paths, match and remove
		PathIterator pitor = new PathIterator(pathGroup);
		boolean modified = false;

		NEXTPATH: while(pitor.hasNext()) {
			URI p = pitor.next();
			// strategy choice - either apply a pattern on each path, or match each against paths from a path vector

			// choice 1 - match against a path vector
			if(pathPattern == null) {
				PathIterator mItor = new PathIterator(getPathVector());
				while(mItor.hasNext()) {
					if(mItor.next().equals(p)) {
						modified = true;
						pitor.remove();
						continue NEXTPATH;
					}
				}
			}
			else {
				// choice 2 - compare against a regexp (wildcard already optimized)
				BExpression expr = getPathPattern();
				if(expr instanceof BRegularExpression) {
					if(((BRegularExpression) expr).getPattern().matcher(p.toString()).matches()) {
						pitor.remove();
						modified = true;
					}
				}
			}
		}
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPathPattern(BExpression newPathPattern) {
		if(newPathPattern != pathPattern) {
			NotificationChain msgs = null;
			if(pathPattern != null)
				msgs = ((InternalEObject) pathPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN, null, msgs);
			if(newPathPattern != null)
				msgs = ((InternalEObject) newPathPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN, null, msgs);
			msgs = basicSetPathPattern(newPathPattern, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN, newPathPattern,
				newPathPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPathVector(PathVector newPathVector) {
		if(newPathVector != pathVector) {
			NotificationChain msgs = null;
			if(pathVector != null)
				msgs = ((InternalEObject) pathVector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR, null, msgs);
			if(newPathVector != null)
				msgs = ((InternalEObject) newPathVector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR, null, msgs);
			msgs = basicSetPathVector(newPathVector, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR, newPathVector, newPathVector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.PATH_GROUP_PREDICATE;
	}

} // PathGroupPredicateImpl
