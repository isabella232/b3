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
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.BuildUnitRepository;
import org.eclipse.b3.build.build.EffectiveRequirementFacade;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Unit Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class BuildUnitRepositoryImpl extends EObjectImpl implements BuildUnitRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildUnitRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BUILD_UNIT_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public abstract BuildUnit resolve(BExecutionContext ctx, RequiredCapability requiredCapability) throws Throwable;

	/**
	 * <!-- begin-user-doc -->
	 * Default implementation that takes context and requirement from the effective requirement facade
	 * and calls {@link BuildUnitRepositoryImpl #resolve(BExecutionContext, RequiredCapability) }.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public BuildUnit resolve(EffectiveRequirementFacade effectiveRequirement) throws Throwable {
		return resolve(effectiveRequirement.getContext(), effectiveRequirement.getRequirement());
	}

} // BuildUnitRepositoryImpl