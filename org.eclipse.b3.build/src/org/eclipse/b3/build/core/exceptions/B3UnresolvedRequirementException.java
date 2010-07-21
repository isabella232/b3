package org.eclipse.b3.build.core.exceptions;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.IBuilder;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.osgi.util.NLS;

public class B3UnresolvedRequirementException extends B3EngineException {

	private static final long serialVersionUID = 1L;

	public B3UnresolvedRequirementException(BuildUnit unit, IBuilder builder, RequiredCapability requiredCapability) {
		super(NLS.bind(
			"Unresolved requirement in {0}::{1}. Requirement on namespace={2}, name={3}, range={4} not resolved.",
			new Object[] {
					unit.getName(), builder.getName(), requiredCapability.getNameSpace(), requiredCapability.getName(),
					requiredCapability.getVersionRange() }));
	}

	public B3UnresolvedRequirementException(BuildUnit unit, IBuilder builder, RequiredCapability requiredCapability,
			IStatus problem) {
		super(NLS.bind(
			"Unresolved requirement in {0}::{1}. Requirement on namespace={2}, name={3}, range={4} not resolved.",
			new Object[] {
					unit.getName(), builder.getName(), requiredCapability.getNameSpace(), requiredCapability.getName(),
					requiredCapability.getVersionRange() }), problem != null
				? problem.getException()
				: null);
	}

}