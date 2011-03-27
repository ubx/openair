package www.ubx.ch.ui.quickfix;

import javax.swing.text.BadLocationException;

import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import www.ubx.ch.ui.validation.OpenAirSyntaxErrorMessageProvider;

public class OpenAirQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(OpenAirSyntaxErrorMessageProvider.INVALID_AIRSPACE_NAME)
	public void capitalizeNamexx(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Add airspace name in quotes", "Add airspace name in quotes.", null, new IModification() {
			public void apply(IModificationContext context) throws BadLocationException {
				IXtextDocument xtextDocument = context.getXtextDocument();
				try {
					String asName = xtextDocument.get(issue.getOffset(), issue.getLength());
					xtextDocument.replace(issue.getOffset(), issue.getLength(), "'" + asName + "'");
				} catch (org.eclipse.jface.text.BadLocationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

}
