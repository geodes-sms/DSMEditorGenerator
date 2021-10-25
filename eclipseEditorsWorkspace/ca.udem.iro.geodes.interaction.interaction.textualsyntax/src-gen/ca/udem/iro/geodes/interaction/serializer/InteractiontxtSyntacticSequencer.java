/*
 * generated by Xtext 2.19.0
 */
package ca.udem.iro.geodes.interaction.serializer;

import ca.udem.iro.geodes.interaction.services.InteractiontxtGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class InteractiontxtSyntacticSequencer extends AbstractSyntacticSequencer {

	protected InteractiontxtGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AOElement___ValueKeyword_4_0_EqualsSignKeyword_4_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (InteractiontxtGrammarAccess) access;
		match_AOElement___ValueKeyword_4_0_EqualsSignKeyword_4_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAOElementAccess().getValueKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getAOElementAccess().getEqualsSignKeyword_4_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AOElement___ValueKeyword_4_0_EqualsSignKeyword_4_1__q.equals(syntax))
				emit_AOElement___ValueKeyword_4_0_EqualsSignKeyword_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('value' '=')?
	 *
	 * This ambiguous syntax occurs at:
	 *     operation=EString '{' (ambiguity) '}' (rule end)
	 */
	protected void emit_AOElement___ValueKeyword_4_0_EqualsSignKeyword_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}