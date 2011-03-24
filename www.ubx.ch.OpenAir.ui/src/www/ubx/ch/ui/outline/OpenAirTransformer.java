/*
 * generated by Xtext
 */
package www.ubx.ch.ui.outline;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.ContentOutlineNode;
import org.eclipse.xtext.ui.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;

import www.ubx.ch.openAir.Airspace;
import www.ubx.ch.openAir.AsName;
import www.ubx.ch.openAir.OpenAir;

/**
 * customization of the default outline structure
 * 
 */
public class OpenAirTransformer extends AbstractDeclarativeSemanticModelTransformer {

	/**
	 * This method will be called by naming convention: <br>
	 * - method name must be createNode <br>
	 * - first param: subclass of EObject <br>
	 * - second param: ContentOutlineNode
	 */
	public ContentOutlineNode createNode(OpenAir semanticNode, ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(semanticNode, parentNode);
		node.setLabel("special " + node.getLabel());
		return node;
	}

	public ContentOutlineNode createNode(Airspace semanticNode, ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(semanticNode, parentNode);
		node.setLabel("special " + node.getLabel());
		return node;
	}

	public ContentOutlineNode createNode(AsName semanticNode, ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(semanticNode, parentNode);
		node.setLabel("special " + node.getLabel());
		return node;
	}

	/**
	 * This method will be called by naming convention: <br>
	 * - method name must be getChildren <br>
	 * - first param: subclass of EObject
	 */
	public List<EObject> getChildren(OpenAir attribute) {
		return attribute.eContents();
	}

	public List<EObject> getChildren(AsName attribute) {
		return attribute.eContents();
	}

}
