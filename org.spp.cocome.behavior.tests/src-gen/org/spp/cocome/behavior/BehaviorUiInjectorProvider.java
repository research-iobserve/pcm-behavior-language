/*
* generated by Xtext
*/
package org.spp.cocome.behavior;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class BehaviorUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.spp.cocome.behavior.ui.internal.BehaviorActivator.getInstance().getInjector("org.spp.cocome.behavior.Behavior");
	}
	
}
