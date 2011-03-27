/*
 * generated by Xtext
 */
package www.ubx.ch.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider;
import org.eclipse.xtext.ui.editor.outline.transformer.ISemanticModelTransformer;

import www.ubx.ch.ui.outline.OpenAirTransformer;
import www.ubx.ch.ui.validation.OpenAirSyntaxErrorMessageProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class OpenAirUiModule extends www.ubx.ch.ui.AbstractOpenAirUiModule {
	public OpenAirUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends ISemanticModelTransformer> bindISemanticModelTransformer() {
		return OpenAirTransformer.class;
	}

	public Class<? extends ISyntaxErrorMessageProvider> bindISyntaxErrorMessageProvider() {
		return OpenAirSyntaxErrorMessageProvider.class;
	}

}
