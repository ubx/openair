
/*
 * generated by Xtext
 */
 
package www.ubx.ch.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class OpenAirExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return www.ubx.ch.ui.internal.OpenAirActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return www.ubx.ch.ui.internal.OpenAirActivator.getInstance().getInjector("www.ubx.ch.OpenAir");
	}
	
}