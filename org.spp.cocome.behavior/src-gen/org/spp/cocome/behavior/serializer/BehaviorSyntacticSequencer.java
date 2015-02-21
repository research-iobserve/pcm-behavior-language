package org.spp.cocome.behavior.serializer;

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
import org.spp.cocome.behavior.services.BehaviorGrammarAccess;

@SuppressWarnings("all")
public class BehaviorSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BehaviorGrammarAccess grammarAccess;
	protected AbstractElementAlias match_PropertyCall___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q;
	protected AbstractElementAlias match_VariableCall___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BehaviorGrammarAccess) access;
		match_PropertyCall___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPropertyCallAccess().getLeftSquareBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getPropertyCallAccess().getRightSquareBracketKeyword_1_2()));
		match_VariableCall___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVariableCallAccess().getLeftSquareBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getVariableCallAccess().getRightSquareBracketKeyword_1_2()));
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
			if(match_PropertyCall___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q.equals(syntax))
				emit_PropertyCall___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VariableCall___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q.equals(syntax))
				emit_VariableCall___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('[' ']')?
	 */
	protected void emit_PropertyCall___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' ']')?
	 */
	protected void emit_VariableCall___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
