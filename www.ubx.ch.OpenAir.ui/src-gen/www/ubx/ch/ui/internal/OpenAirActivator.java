
/*
 * generated by Xtext
 */
package www.ubx.ch.ui.internal;

import org.apache.log4j.Logger;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;

import java.util.Map;
import java.util.HashMap;

/**
 * Generated
 */
public class OpenAirActivator extends AbstractUIPlugin {

	private Map<String,Injector> injectors = new HashMap<String,Injector>();
	private static OpenAirActivator INSTANCE;

	public Injector getInjector(String languageName) {
		return injectors.get(languageName);
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		try {
			
			injectors.put("www.ubx.ch.OpenAir", Guice.createInjector(
				Modules.override(Modules.override(getRuntimeModule("www.ubx.ch.OpenAir")).with(getUiModule("www.ubx.ch.OpenAir"))).with(getSharedStateModule())
			));
			
		} catch (Exception e) {
			Logger.getLogger(getClass()).error(e.getMessage(), e);
			throw e;
		}
	}
	
	public static OpenAirActivator getInstance() {
		return INSTANCE;
	}
	
	protected Module getRuntimeModule(String grammar) {
		
		if ("www.ubx.ch.OpenAir".equals(grammar)) {
		  return new www.ubx.ch.OpenAirRuntimeModule();
		}
		
		throw new IllegalArgumentException(grammar);
	}
	protected Module getUiModule(String grammar) {
		
		if ("www.ubx.ch.OpenAir".equals(grammar)) {
		  return new www.ubx.ch.ui.OpenAirUiModule(this);
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new org.eclipse.xtext.ui.shared.SharedStateModule();
	}
	
}