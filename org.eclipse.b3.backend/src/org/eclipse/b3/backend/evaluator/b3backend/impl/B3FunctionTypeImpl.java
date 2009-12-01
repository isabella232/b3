/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;

import java.util.Collection;

import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>B3 Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3FunctionTypeImpl#getFunctionType <em>Function Type</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3FunctionTypeImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3FunctionTypeImpl#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3FunctionTypeImpl#isVarArgs <em>Var Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class B3FunctionTypeImpl extends EObjectImpl implements B3FunctionType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getFunctionType() <em>Function Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionType()
	 * @generated
	 * @ordered
	 */
	protected Type functionType;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Type returnType;

	/**
	 * The cached value of the '{@link #getParameterTypes() <em>Parameter Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> parameterTypes;

	/**
	 * The default value of the '{@link #isVarArgs() <em>Var Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVarArgs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VAR_ARGS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVarArgs() <em>Var Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVarArgs()
	 * @generated
	 * @ordered
	 */
	protected boolean varArgs = VAR_ARGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected B3FunctionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.B3_FUNCTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getFunctionType() {
		if (functionType != null && ((EObject)functionType).eIsProxy()) {
			InternalEObject oldFunctionType = (InternalEObject)functionType;
			functionType = (Type)eResolveProxy(oldFunctionType);
			if (functionType != oldFunctionType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.B3_FUNCTION_TYPE__FUNCTION_TYPE, oldFunctionType, functionType));
			}
		}
		return functionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetFunctionType() {
		return functionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionType(Type newFunctionType) {
		Type oldFunctionType = functionType;
		functionType = newFunctionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.B3_FUNCTION_TYPE__FUNCTION_TYPE, oldFunctionType, functionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * The generated version casts the return type to EObject !
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type getReturnType() {
		if (returnType != null && returnType instanceof EObject && ((EObject)returnType).eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (Type)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.B3_FUNCTION_TYPE__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(Type newReturnType) {
		Type oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.B3_FUNCTION_TYPE__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getParameterTypes() {
		if (parameterTypes == null) {
			parameterTypes = new EObjectResolvingEList<Type>(Type.class, this, B3backendPackage.B3_FUNCTION_TYPE__PARAMETER_TYPES);
		}
		return parameterTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVarArgs() {
		return varArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarArgs(boolean newVarArgs) {
		boolean oldVarArgs = varArgs;
		varArgs = newVarArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.B3_FUNCTION_TYPE__VAR_ARGS, oldVarArgs, varArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type[] getParameterTypesArray() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.B3_FUNCTION_TYPE__FUNCTION_TYPE:
				if (resolve) return getFunctionType();
				return basicGetFunctionType();
			case B3backendPackage.B3_FUNCTION_TYPE__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
			case B3backendPackage.B3_FUNCTION_TYPE__PARAMETER_TYPES:
				return getParameterTypes();
			case B3backendPackage.B3_FUNCTION_TYPE__VAR_ARGS:
				return isVarArgs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case B3backendPackage.B3_FUNCTION_TYPE__FUNCTION_TYPE:
				setFunctionType((Type)newValue);
				return;
			case B3backendPackage.B3_FUNCTION_TYPE__RETURN_TYPE:
				setReturnType((Type)newValue);
				return;
			case B3backendPackage.B3_FUNCTION_TYPE__PARAMETER_TYPES:
				getParameterTypes().clear();
				getParameterTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case B3backendPackage.B3_FUNCTION_TYPE__VAR_ARGS:
				setVarArgs((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case B3backendPackage.B3_FUNCTION_TYPE__FUNCTION_TYPE:
				setFunctionType((Type)null);
				return;
			case B3backendPackage.B3_FUNCTION_TYPE__RETURN_TYPE:
				setReturnType((Type)null);
				return;
			case B3backendPackage.B3_FUNCTION_TYPE__PARAMETER_TYPES:
				getParameterTypes().clear();
				return;
			case B3backendPackage.B3_FUNCTION_TYPE__VAR_ARGS:
				setVarArgs(VAR_ARGS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case B3backendPackage.B3_FUNCTION_TYPE__FUNCTION_TYPE:
				return functionType != null;
			case B3backendPackage.B3_FUNCTION_TYPE__RETURN_TYPE:
				return returnType != null;
			case B3backendPackage.B3_FUNCTION_TYPE__PARAMETER_TYPES:
				return parameterTypes != null && !parameterTypes.isEmpty();
			case B3backendPackage.B3_FUNCTION_TYPE__VAR_ARGS:
				return varArgs != VAR_ARGS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (varArgs: ");
		result.append(varArgs);
		result.append(')');
		return result.toString();
	}

} //B3FunctionTypeImpl