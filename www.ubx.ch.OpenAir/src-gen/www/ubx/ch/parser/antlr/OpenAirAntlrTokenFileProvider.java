/*
* generated by Xtext
*/
package www.ubx.ch.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class OpenAirAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("www/ubx/ch/parser/antlr/internal/InternalOpenAir.tokens");
	}
}
