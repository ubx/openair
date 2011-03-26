package www.ubx.ch.ui.quickfix;

import javax.swing.text.BadLocationException;

import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import www.ubx.ch.validation.OpenAirJavaValidator;

public class OpenAirQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(OpenAirJavaValidator.INVALID_AIRSPACE_NAME)
	public void capitalizeNamexx(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", new IModification() {
			public void apply(IModificationContext context) throws BadLocationException {
				IXtextDocument xtextDocument = context.getXtextDocument();
				try {
					String firstLetter = xtextDocument.get(issue.getOffset(), 1);
					xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
				} catch (org.eclipse.jface.text.BadLocationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

}
