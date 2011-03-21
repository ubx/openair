
package www.ubx.ch;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class OpenAirStandaloneSetup extends OpenAirStandaloneSetupGenerated{

	public static void doSetup() {
		new OpenAirStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

