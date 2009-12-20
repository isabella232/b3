/**
 * 
 */
package org.eclipse.b3.backend.evaluator;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3ImmutableTypeException;
import org.eclipse.b3.backend.core.LValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EcoreFeatureLValue implements LValue {
	EStructuralFeature name;
	EObject lhs;
	public EcoreFeatureLValue(EObject lhs, EStructuralFeature featureName)
	{ this.lhs = lhs; this.name = featureName; }
	
	public Object get() throws B3EngineException {
		return lhs.eGet(name);
	}

	public boolean isSettable() /*throws B3EngineException*/ {
		return true;
	}

	public Object set(Object value) throws B3EngineException {
		lhs.eSet(name, value);
		return value;
	}

	public Type getDeclaredType() throws B3EngineException {
		return name.getEType().getInstanceClass();
	}
	public void setDeclaredType(Type t) throws B3EngineException {
		throw new B3ImmutableTypeException(lhs, name.getEType().getInstanceClass(), t);
	}

	public boolean isGetable() /*throws B3EngineException */{
		return true;
	}

}