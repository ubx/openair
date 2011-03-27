package www.ubx.ch.ui.validation;

import org.antlr.runtime.MismatchedTokenException;
import org.eclipse.xtext.parser.antlr.SyntaxErrorMessage;
import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider;

public class OpenAirSyntaxErrorMessageProvider extends SyntaxErrorMessageProvider {

	public final static String INVALID_AIRSPACE_NAME = "INVALID_AIRSPACE_NAME";

	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage(IParserErrorContext context) {
		if (context.getRecognitionException() instanceof MismatchedTokenException) {
			MismatchedTokenException mm = (MismatchedTokenException) context.getRecognitionException();
			if (mm.expecting == 5) {
				// TODO - find a better solution
				return new SyntaxErrorMessage(context.getDefaultMessage(), INVALID_AIRSPACE_NAME);
			}
		}
		// TODO Auto-generated method stub
		return super.getSyntaxErrorMessage(context);
	}

}
