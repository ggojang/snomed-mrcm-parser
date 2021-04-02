package co.infoclinic.snomed.mrcm.parser.generated;
// Generated from ExpressionTemplate.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionTemplateParser}.
 */
public interface ExpressionTemplateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#expressiontemplate}.
	 * @param ctx the parse tree
	 */
	void enterExpressiontemplate(ExpressionTemplateParser.ExpressiontemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#expressiontemplate}.
	 * @param ctx the parse tree
	 */
	void exitExpressiontemplate(ExpressionTemplateParser.ExpressiontemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#subexpression}.
	 * @param ctx the parse tree
	 */
	void enterSubexpression(ExpressionTemplateParser.SubexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#subexpression}.
	 * @param ctx the parse tree
	 */
	void exitSubexpression(ExpressionTemplateParser.SubexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#definitionstatus}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionstatus(ExpressionTemplateParser.DefinitionstatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#definitionstatus}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionstatus(ExpressionTemplateParser.DefinitionstatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#equivalentto}.
	 * @param ctx the parse tree
	 */
	void enterEquivalentto(ExpressionTemplateParser.EquivalenttoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#equivalentto}.
	 * @param ctx the parse tree
	 */
	void exitEquivalentto(ExpressionTemplateParser.EquivalenttoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#subtypeof}.
	 * @param ctx the parse tree
	 */
	void enterSubtypeof(ExpressionTemplateParser.SubtypeofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#subtypeof}.
	 * @param ctx the parse tree
	 */
	void exitSubtypeof(ExpressionTemplateParser.SubtypeofContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#focusconcept}.
	 * @param ctx the parse tree
	 */
	void enterFocusconcept(ExpressionTemplateParser.FocusconceptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#focusconcept}.
	 * @param ctx the parse tree
	 */
	void exitFocusconcept(ExpressionTemplateParser.FocusconceptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#conceptreference}.
	 * @param ctx the parse tree
	 */
	void enterConceptreference(ExpressionTemplateParser.ConceptreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#conceptreference}.
	 * @param ctx the parse tree
	 */
	void exitConceptreference(ExpressionTemplateParser.ConceptreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#conceptid}.
	 * @param ctx the parse tree
	 */
	void enterConceptid(ExpressionTemplateParser.ConceptidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#conceptid}.
	 * @param ctx the parse tree
	 */
	void exitConceptid(ExpressionTemplateParser.ConceptidContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ExpressionTemplateParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ExpressionTemplateParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#refinement}.
	 * @param ctx the parse tree
	 */
	void enterRefinement(ExpressionTemplateParser.RefinementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#refinement}.
	 * @param ctx the parse tree
	 */
	void exitRefinement(ExpressionTemplateParser.RefinementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#attributegroup}.
	 * @param ctx the parse tree
	 */
	void enterAttributegroup(ExpressionTemplateParser.AttributegroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#attributegroup}.
	 * @param ctx the parse tree
	 */
	void exitAttributegroup(ExpressionTemplateParser.AttributegroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#attributeset}.
	 * @param ctx the parse tree
	 */
	void enterAttributeset(ExpressionTemplateParser.AttributesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#attributeset}.
	 * @param ctx the parse tree
	 */
	void exitAttributeset(ExpressionTemplateParser.AttributesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ExpressionTemplateParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ExpressionTemplateParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#attributename}.
	 * @param ctx the parse tree
	 */
	void enterAttributename(ExpressionTemplateParser.AttributenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#attributename}.
	 * @param ctx the parse tree
	 */
	void exitAttributename(ExpressionTemplateParser.AttributenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#attributevalue}.
	 * @param ctx the parse tree
	 */
	void enterAttributevalue(ExpressionTemplateParser.AttributevalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#attributevalue}.
	 * @param ctx the parse tree
	 */
	void exitAttributevalue(ExpressionTemplateParser.AttributevalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#expressionvalue}.
	 * @param ctx the parse tree
	 */
	void enterExpressionvalue(ExpressionTemplateParser.ExpressionvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#expressionvalue}.
	 * @param ctx the parse tree
	 */
	void exitExpressionvalue(ExpressionTemplateParser.ExpressionvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#stringvalue}.
	 * @param ctx the parse tree
	 */
	void enterStringvalue(ExpressionTemplateParser.StringvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#stringvalue}.
	 * @param ctx the parse tree
	 */
	void exitStringvalue(ExpressionTemplateParser.StringvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#numericvalue}.
	 * @param ctx the parse tree
	 */
	void enterNumericvalue(ExpressionTemplateParser.NumericvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#numericvalue}.
	 * @param ctx the parse tree
	 */
	void exitNumericvalue(ExpressionTemplateParser.NumericvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#integervalue}.
	 * @param ctx the parse tree
	 */
	void enterIntegervalue(ExpressionTemplateParser.IntegervalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#integervalue}.
	 * @param ctx the parse tree
	 */
	void exitIntegervalue(ExpressionTemplateParser.IntegervalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#decimalvalue}.
	 * @param ctx the parse tree
	 */
	void enterDecimalvalue(ExpressionTemplateParser.DecimalvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#decimalvalue}.
	 * @param ctx the parse tree
	 */
	void exitDecimalvalue(ExpressionTemplateParser.DecimalvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanvalue(ExpressionTemplateParser.BooleanvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanvalue(ExpressionTemplateParser.BooleanvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#true_1}.
	 * @param ctx the parse tree
	 */
	void enterTrue_1(ExpressionTemplateParser.True_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#true_1}.
	 * @param ctx the parse tree
	 */
	void exitTrue_1(ExpressionTemplateParser.True_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#false_1}.
	 * @param ctx the parse tree
	 */
	void enterFalse_1(ExpressionTemplateParser.False_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#false_1}.
	 * @param ctx the parse tree
	 */
	void exitFalse_1(ExpressionTemplateParser.False_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#sctid}.
	 * @param ctx the parse tree
	 */
	void enterSctid(ExpressionTemplateParser.SctidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#sctid}.
	 * @param ctx the parse tree
	 */
	void exitSctid(ExpressionTemplateParser.SctidContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(ExpressionTemplateParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(ExpressionTemplateParser.WsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#sp}.
	 * @param ctx the parse tree
	 */
	void enterSp(ExpressionTemplateParser.SpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#sp}.
	 * @param ctx the parse tree
	 */
	void exitSp(ExpressionTemplateParser.SpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#htab}.
	 * @param ctx the parse tree
	 */
	void enterHtab(ExpressionTemplateParser.HtabContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#htab}.
	 * @param ctx the parse tree
	 */
	void exitHtab(ExpressionTemplateParser.HtabContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#cr}.
	 * @param ctx the parse tree
	 */
	void enterCr(ExpressionTemplateParser.CrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#cr}.
	 * @param ctx the parse tree
	 */
	void exitCr(ExpressionTemplateParser.CrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#lf}.
	 * @param ctx the parse tree
	 */
	void enterLf(ExpressionTemplateParser.LfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#lf}.
	 * @param ctx the parse tree
	 */
	void exitLf(ExpressionTemplateParser.LfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#qm}.
	 * @param ctx the parse tree
	 */
	void enterQm(ExpressionTemplateParser.QmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#qm}.
	 * @param ctx the parse tree
	 */
	void exitQm(ExpressionTemplateParser.QmContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#bs}.
	 * @param ctx the parse tree
	 */
	void enterBs(ExpressionTemplateParser.BsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#bs}.
	 * @param ctx the parse tree
	 */
	void exitBs(ExpressionTemplateParser.BsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(ExpressionTemplateParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(ExpressionTemplateParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#zero}.
	 * @param ctx the parse tree
	 */
	void enterZero(ExpressionTemplateParser.ZeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#zero}.
	 * @param ctx the parse tree
	 */
	void exitZero(ExpressionTemplateParser.ZeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#digitnonzero}.
	 * @param ctx the parse tree
	 */
	void enterDigitnonzero(ExpressionTemplateParser.DigitnonzeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#digitnonzero}.
	 * @param ctx the parse tree
	 */
	void exitDigitnonzero(ExpressionTemplateParser.DigitnonzeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#nonwsnonpipe}.
	 * @param ctx the parse tree
	 */
	void enterNonwsnonpipe(ExpressionTemplateParser.NonwsnonpipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#nonwsnonpipe}.
	 * @param ctx the parse tree
	 */
	void exitNonwsnonpipe(ExpressionTemplateParser.NonwsnonpipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#anynonescapedchar}.
	 * @param ctx the parse tree
	 */
	void enterAnynonescapedchar(ExpressionTemplateParser.AnynonescapedcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#anynonescapedchar}.
	 * @param ctx the parse tree
	 */
	void exitAnynonescapedchar(ExpressionTemplateParser.AnynonescapedcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#escapedchar}.
	 * @param ctx the parse tree
	 */
	void enterEscapedchar(ExpressionTemplateParser.EscapedcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#escapedchar}.
	 * @param ctx the parse tree
	 */
	void exitEscapedchar(ExpressionTemplateParser.EscapedcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#utf8_2}.
	 * @param ctx the parse tree
	 */
	void enterUtf8_2(ExpressionTemplateParser.Utf8_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#utf8_2}.
	 * @param ctx the parse tree
	 */
	void exitUtf8_2(ExpressionTemplateParser.Utf8_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#utf8_3}.
	 * @param ctx the parse tree
	 */
	void enterUtf8_3(ExpressionTemplateParser.Utf8_3Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#utf8_3}.
	 * @param ctx the parse tree
	 */
	void exitUtf8_3(ExpressionTemplateParser.Utf8_3Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#utf8_4}.
	 * @param ctx the parse tree
	 */
	void enterUtf8_4(ExpressionTemplateParser.Utf8_4Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#utf8_4}.
	 * @param ctx the parse tree
	 */
	void exitUtf8_4(ExpressionTemplateParser.Utf8_4Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#utf8_tail}.
	 * @param ctx the parse tree
	 */
	void enterUtf8_tail(ExpressionTemplateParser.Utf8_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#utf8_tail}.
	 * @param ctx the parse tree
	 */
	void exitUtf8_tail(ExpressionTemplateParser.Utf8_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#templateslot}.
	 * @param ctx the parse tree
	 */
	void enterTemplateslot(ExpressionTemplateParser.TemplateslotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#templateslot}.
	 * @param ctx the parse tree
	 */
	void exitTemplateslot(ExpressionTemplateParser.TemplateslotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#templatereplacementslot}.
	 * @param ctx the parse tree
	 */
	void enterTemplatereplacementslot(ExpressionTemplateParser.TemplatereplacementslotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#templatereplacementslot}.
	 * @param ctx the parse tree
	 */
	void exitTemplatereplacementslot(ExpressionTemplateParser.TemplatereplacementslotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#conceptreplacementslot}.
	 * @param ctx the parse tree
	 */
	void enterConceptreplacementslot(ExpressionTemplateParser.ConceptreplacementslotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#conceptreplacementslot}.
	 * @param ctx the parse tree
	 */
	void exitConceptreplacementslot(ExpressionTemplateParser.ConceptreplacementslotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#expressionreplacementslot}.
	 * @param ctx the parse tree
	 */
	void enterExpressionreplacementslot(ExpressionTemplateParser.ExpressionreplacementslotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#expressionreplacementslot}.
	 * @param ctx the parse tree
	 */
	void exitExpressionreplacementslot(ExpressionTemplateParser.ExpressionreplacementslotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#tokenreplacementslot}.
	 * @param ctx the parse tree
	 */
	void enterTokenreplacementslot(ExpressionTemplateParser.TokenreplacementslotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#tokenreplacementslot}.
	 * @param ctx the parse tree
	 */
	void exitTokenreplacementslot(ExpressionTemplateParser.TokenreplacementslotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#concretevaluereplacementslot}.
	 * @param ctx the parse tree
	 */
	void enterConcretevaluereplacementslot(ExpressionTemplateParser.ConcretevaluereplacementslotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#concretevaluereplacementslot}.
	 * @param ctx the parse tree
	 */
	void exitConcretevaluereplacementslot(ExpressionTemplateParser.ConcretevaluereplacementslotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#conceptreplacement}.
	 * @param ctx the parse tree
	 */
	void enterConceptreplacement(ExpressionTemplateParser.ConceptreplacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#conceptreplacement}.
	 * @param ctx the parse tree
	 */
	void exitConceptreplacement(ExpressionTemplateParser.ConceptreplacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#expressionreplacement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionreplacement(ExpressionTemplateParser.ExpressionreplacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#expressionreplacement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionreplacement(ExpressionTemplateParser.ExpressionreplacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#tokenreplacement}.
	 * @param ctx the parse tree
	 */
	void enterTokenreplacement(ExpressionTemplateParser.TokenreplacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#tokenreplacement}.
	 * @param ctx the parse tree
	 */
	void exitTokenreplacement(ExpressionTemplateParser.TokenreplacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#concretevaluereplacement}.
	 * @param ctx the parse tree
	 */
	void enterConcretevaluereplacement(ExpressionTemplateParser.ConcretevaluereplacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#concretevaluereplacement}.
	 * @param ctx the parse tree
	 */
	void exitConcretevaluereplacement(ExpressionTemplateParser.ConcretevaluereplacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#stringreplacement}.
	 * @param ctx the parse tree
	 */
	void enterStringreplacement(ExpressionTemplateParser.StringreplacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#stringreplacement}.
	 * @param ctx the parse tree
	 */
	void exitStringreplacement(ExpressionTemplateParser.StringreplacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#integerreplacement}.
	 * @param ctx the parse tree
	 */
	void enterIntegerreplacement(ExpressionTemplateParser.IntegerreplacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#integerreplacement}.
	 * @param ctx the parse tree
	 */
	void exitIntegerreplacement(ExpressionTemplateParser.IntegerreplacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#decimalreplacement}.
	 * @param ctx the parse tree
	 */
	void enterDecimalreplacement(ExpressionTemplateParser.DecimalreplacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#decimalreplacement}.
	 * @param ctx the parse tree
	 */
	void exitDecimalreplacement(ExpressionTemplateParser.DecimalreplacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#booleanreplacement}.
	 * @param ctx the parse tree
	 */
	void enterBooleanreplacement(ExpressionTemplateParser.BooleanreplacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#booleanreplacement}.
	 * @param ctx the parse tree
	 */
	void exitBooleanreplacement(ExpressionTemplateParser.BooleanreplacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slottokenset}.
	 * @param ctx the parse tree
	 */
	void enterSlottokenset(ExpressionTemplateParser.SlottokensetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slottokenset}.
	 * @param ctx the parse tree
	 */
	void exitSlottokenset(ExpressionTemplateParser.SlottokensetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotstringset}.
	 * @param ctx the parse tree
	 */
	void enterSlotstringset(ExpressionTemplateParser.SlotstringsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotstringset}.
	 * @param ctx the parse tree
	 */
	void exitSlotstringset(ExpressionTemplateParser.SlotstringsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotstringvalue}.
	 * @param ctx the parse tree
	 */
	void enterSlotstringvalue(ExpressionTemplateParser.SlotstringvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotstringvalue}.
	 * @param ctx the parse tree
	 */
	void exitSlotstringvalue(ExpressionTemplateParser.SlotstringvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotintegerset}.
	 * @param ctx the parse tree
	 */
	void enterSlotintegerset(ExpressionTemplateParser.SlotintegersetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotintegerset}.
	 * @param ctx the parse tree
	 */
	void exitSlotintegerset(ExpressionTemplateParser.SlotintegersetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotdecimalset}.
	 * @param ctx the parse tree
	 */
	void enterSlotdecimalset(ExpressionTemplateParser.SlotdecimalsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotdecimalset}.
	 * @param ctx the parse tree
	 */
	void exitSlotdecimalset(ExpressionTemplateParser.SlotdecimalsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotbooleanset}.
	 * @param ctx the parse tree
	 */
	void enterSlotbooleanset(ExpressionTemplateParser.SlotbooleansetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotbooleanset}.
	 * @param ctx the parse tree
	 */
	void exitSlotbooleanset(ExpressionTemplateParser.SlotbooleansetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotbooleanvalue}.
	 * @param ctx the parse tree
	 */
	void enterSlotbooleanvalue(ExpressionTemplateParser.SlotbooleanvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotbooleanvalue}.
	 * @param ctx the parse tree
	 */
	void exitSlotbooleanvalue(ExpressionTemplateParser.SlotbooleanvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotintegerrange}.
	 * @param ctx the parse tree
	 */
	void enterSlotintegerrange(ExpressionTemplateParser.SlotintegerrangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotintegerrange}.
	 * @param ctx the parse tree
	 */
	void exitSlotintegerrange(ExpressionTemplateParser.SlotintegerrangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotintegerminimum}.
	 * @param ctx the parse tree
	 */
	void enterSlotintegerminimum(ExpressionTemplateParser.SlotintegerminimumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotintegerminimum}.
	 * @param ctx the parse tree
	 */
	void exitSlotintegerminimum(ExpressionTemplateParser.SlotintegerminimumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotintegermaximum}.
	 * @param ctx the parse tree
	 */
	void enterSlotintegermaximum(ExpressionTemplateParser.SlotintegermaximumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotintegermaximum}.
	 * @param ctx the parse tree
	 */
	void exitSlotintegermaximum(ExpressionTemplateParser.SlotintegermaximumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotintegervalue}.
	 * @param ctx the parse tree
	 */
	void enterSlotintegervalue(ExpressionTemplateParser.SlotintegervalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotintegervalue}.
	 * @param ctx the parse tree
	 */
	void exitSlotintegervalue(ExpressionTemplateParser.SlotintegervalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotdecimalrange}.
	 * @param ctx the parse tree
	 */
	void enterSlotdecimalrange(ExpressionTemplateParser.SlotdecimalrangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotdecimalrange}.
	 * @param ctx the parse tree
	 */
	void exitSlotdecimalrange(ExpressionTemplateParser.SlotdecimalrangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotdecimalminimum}.
	 * @param ctx the parse tree
	 */
	void enterSlotdecimalminimum(ExpressionTemplateParser.SlotdecimalminimumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotdecimalminimum}.
	 * @param ctx the parse tree
	 */
	void exitSlotdecimalminimum(ExpressionTemplateParser.SlotdecimalminimumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotdecimalmaximum}.
	 * @param ctx the parse tree
	 */
	void enterSlotdecimalmaximum(ExpressionTemplateParser.SlotdecimalmaximumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotdecimalmaximum}.
	 * @param ctx the parse tree
	 */
	void exitSlotdecimalmaximum(ExpressionTemplateParser.SlotdecimalmaximumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotdecimalvalue}.
	 * @param ctx the parse tree
	 */
	void enterSlotdecimalvalue(ExpressionTemplateParser.SlotdecimalvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotdecimalvalue}.
	 * @param ctx the parse tree
	 */
	void exitSlotdecimalvalue(ExpressionTemplateParser.SlotdecimalvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#exclusiveminimum}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveminimum(ExpressionTemplateParser.ExclusiveminimumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#exclusiveminimum}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveminimum(ExpressionTemplateParser.ExclusiveminimumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#exclusivemaximum}.
	 * @param ctx the parse tree
	 */
	void enterExclusivemaximum(ExpressionTemplateParser.ExclusivemaximumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#exclusivemaximum}.
	 * @param ctx the parse tree
	 */
	void exitExclusivemaximum(ExpressionTemplateParser.ExclusivemaximumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotname}.
	 * @param ctx the parse tree
	 */
	void enterSlotname(ExpressionTemplateParser.SlotnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotname}.
	 * @param ctx the parse tree
	 */
	void exitSlotname(ExpressionTemplateParser.SlotnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slottoken}.
	 * @param ctx the parse tree
	 */
	void enterSlottoken(ExpressionTemplateParser.SlottokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slottoken}.
	 * @param ctx the parse tree
	 */
	void exitSlottoken(ExpressionTemplateParser.SlottokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#nonquotestringvalue}.
	 * @param ctx the parse tree
	 */
	void enterNonquotestringvalue(ExpressionTemplateParser.NonquotestringvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#nonquotestringvalue}.
	 * @param ctx the parse tree
	 */
	void exitNonquotestringvalue(ExpressionTemplateParser.NonquotestringvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#templateinformationslot}.
	 * @param ctx the parse tree
	 */
	void enterTemplateinformationslot(ExpressionTemplateParser.TemplateinformationslotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#templateinformationslot}.
	 * @param ctx the parse tree
	 */
	void exitTemplateinformationslot(ExpressionTemplateParser.TemplateinformationslotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotinformation}.
	 * @param ctx the parse tree
	 */
	void enterSlotinformation(ExpressionTemplateParser.SlotinformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotinformation}.
	 * @param ctx the parse tree
	 */
	void exitSlotinformation(ExpressionTemplateParser.SlotinformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void enterSlotexpressionconstraint(ExpressionTemplateParser.SlotexpressionconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void exitSlotexpressionconstraint(ExpressionTemplateParser.SlotexpressionconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotrefinedexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void enterSlotrefinedexpressionconstraint(ExpressionTemplateParser.SlotrefinedexpressionconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotrefinedexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void exitSlotrefinedexpressionconstraint(ExpressionTemplateParser.SlotrefinedexpressionconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotcompoundexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void enterSlotcompoundexpressionconstraint(ExpressionTemplateParser.SlotcompoundexpressionconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotcompoundexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void exitSlotcompoundexpressionconstraint(ExpressionTemplateParser.SlotcompoundexpressionconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotconjunctionexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void enterSlotconjunctionexpressionconstraint(ExpressionTemplateParser.SlotconjunctionexpressionconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotconjunctionexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void exitSlotconjunctionexpressionconstraint(ExpressionTemplateParser.SlotconjunctionexpressionconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotdisjunctionexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void enterSlotdisjunctionexpressionconstraint(ExpressionTemplateParser.SlotdisjunctionexpressionconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotdisjunctionexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void exitSlotdisjunctionexpressionconstraint(ExpressionTemplateParser.SlotdisjunctionexpressionconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotexclusionexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void enterSlotexclusionexpressionconstraint(ExpressionTemplateParser.SlotexclusionexpressionconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotexclusionexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void exitSlotexclusionexpressionconstraint(ExpressionTemplateParser.SlotexclusionexpressionconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotdottedexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void enterSlotdottedexpressionconstraint(ExpressionTemplateParser.SlotdottedexpressionconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotdottedexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void exitSlotdottedexpressionconstraint(ExpressionTemplateParser.SlotdottedexpressionconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotdottedexpressionattribute}.
	 * @param ctx the parse tree
	 */
	void enterSlotdottedexpressionattribute(ExpressionTemplateParser.SlotdottedexpressionattributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotdottedexpressionattribute}.
	 * @param ctx the parse tree
	 */
	void exitSlotdottedexpressionattribute(ExpressionTemplateParser.SlotdottedexpressionattributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotsubexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void enterSlotsubexpressionconstraint(ExpressionTemplateParser.SlotsubexpressionconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotsubexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void exitSlotsubexpressionconstraint(ExpressionTemplateParser.SlotsubexpressionconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#sloteclfocusconcept}.
	 * @param ctx the parse tree
	 */
	void enterSloteclfocusconcept(ExpressionTemplateParser.SloteclfocusconceptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#sloteclfocusconcept}.
	 * @param ctx the parse tree
	 */
	void exitSloteclfocusconcept(ExpressionTemplateParser.SloteclfocusconceptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(ExpressionTemplateParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(ExpressionTemplateParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#memberof}.
	 * @param ctx the parse tree
	 */
	void enterMemberof(ExpressionTemplateParser.MemberofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#memberof}.
	 * @param ctx the parse tree
	 */
	void exitMemberof(ExpressionTemplateParser.MemberofContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#sloteclconceptreference}.
	 * @param ctx the parse tree
	 */
	void enterSloteclconceptreference(ExpressionTemplateParser.SloteclconceptreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#sloteclconceptreference}.
	 * @param ctx the parse tree
	 */
	void exitSloteclconceptreference(ExpressionTemplateParser.SloteclconceptreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(ExpressionTemplateParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(ExpressionTemplateParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#constraintoperator}.
	 * @param ctx the parse tree
	 */
	void enterConstraintoperator(ExpressionTemplateParser.ConstraintoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#constraintoperator}.
	 * @param ctx the parse tree
	 */
	void exitConstraintoperator(ExpressionTemplateParser.ConstraintoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#descendantof}.
	 * @param ctx the parse tree
	 */
	void enterDescendantof(ExpressionTemplateParser.DescendantofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#descendantof}.
	 * @param ctx the parse tree
	 */
	void exitDescendantof(ExpressionTemplateParser.DescendantofContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#descendantorselfof}.
	 * @param ctx the parse tree
	 */
	void enterDescendantorselfof(ExpressionTemplateParser.DescendantorselfofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#descendantorselfof}.
	 * @param ctx the parse tree
	 */
	void exitDescendantorselfof(ExpressionTemplateParser.DescendantorselfofContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#childof}.
	 * @param ctx the parse tree
	 */
	void enterChildof(ExpressionTemplateParser.ChildofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#childof}.
	 * @param ctx the parse tree
	 */
	void exitChildof(ExpressionTemplateParser.ChildofContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#ancestorof}.
	 * @param ctx the parse tree
	 */
	void enterAncestorof(ExpressionTemplateParser.AncestorofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#ancestorof}.
	 * @param ctx the parse tree
	 */
	void exitAncestorof(ExpressionTemplateParser.AncestorofContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#ancestororselfof}.
	 * @param ctx the parse tree
	 */
	void enterAncestororselfof(ExpressionTemplateParser.AncestororselfofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#ancestororselfof}.
	 * @param ctx the parse tree
	 */
	void exitAncestororselfof(ExpressionTemplateParser.AncestororselfofContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#parentof}.
	 * @param ctx the parse tree
	 */
	void enterParentof(ExpressionTemplateParser.ParentofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#parentof}.
	 * @param ctx the parse tree
	 */
	void exitParentof(ExpressionTemplateParser.ParentofContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(ExpressionTemplateParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(ExpressionTemplateParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(ExpressionTemplateParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(ExpressionTemplateParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#exclusion}.
	 * @param ctx the parse tree
	 */
	void enterExclusion(ExpressionTemplateParser.ExclusionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#exclusion}.
	 * @param ctx the parse tree
	 */
	void exitExclusion(ExpressionTemplateParser.ExclusionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#sloteclrefinement}.
	 * @param ctx the parse tree
	 */
	void enterSloteclrefinement(ExpressionTemplateParser.SloteclrefinementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#sloteclrefinement}.
	 * @param ctx the parse tree
	 */
	void exitSloteclrefinement(ExpressionTemplateParser.SloteclrefinementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotconjunctionrefinementset}.
	 * @param ctx the parse tree
	 */
	void enterSlotconjunctionrefinementset(ExpressionTemplateParser.SlotconjunctionrefinementsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotconjunctionrefinementset}.
	 * @param ctx the parse tree
	 */
	void exitSlotconjunctionrefinementset(ExpressionTemplateParser.SlotconjunctionrefinementsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotdisjunctionrefinementset}.
	 * @param ctx the parse tree
	 */
	void enterSlotdisjunctionrefinementset(ExpressionTemplateParser.SlotdisjunctionrefinementsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotdisjunctionrefinementset}.
	 * @param ctx the parse tree
	 */
	void exitSlotdisjunctionrefinementset(ExpressionTemplateParser.SlotdisjunctionrefinementsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotsubrefinement}.
	 * @param ctx the parse tree
	 */
	void enterSlotsubrefinement(ExpressionTemplateParser.SlotsubrefinementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotsubrefinement}.
	 * @param ctx the parse tree
	 */
	void exitSlotsubrefinement(ExpressionTemplateParser.SlotsubrefinementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#sloteclattributeset}.
	 * @param ctx the parse tree
	 */
	void enterSloteclattributeset(ExpressionTemplateParser.SloteclattributesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#sloteclattributeset}.
	 * @param ctx the parse tree
	 */
	void exitSloteclattributeset(ExpressionTemplateParser.SloteclattributesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotconjunctionattributeset}.
	 * @param ctx the parse tree
	 */
	void enterSlotconjunctionattributeset(ExpressionTemplateParser.SlotconjunctionattributesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotconjunctionattributeset}.
	 * @param ctx the parse tree
	 */
	void exitSlotconjunctionattributeset(ExpressionTemplateParser.SlotconjunctionattributesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotdisjunctionattributeset}.
	 * @param ctx the parse tree
	 */
	void enterSlotdisjunctionattributeset(ExpressionTemplateParser.SlotdisjunctionattributesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotdisjunctionattributeset}.
	 * @param ctx the parse tree
	 */
	void exitSlotdisjunctionattributeset(ExpressionTemplateParser.SlotdisjunctionattributesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#slotsubattributeset}.
	 * @param ctx the parse tree
	 */
	void enterSlotsubattributeset(ExpressionTemplateParser.SlotsubattributesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#slotsubattributeset}.
	 * @param ctx the parse tree
	 */
	void exitSlotsubattributeset(ExpressionTemplateParser.SlotsubattributesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#sloteclattributegroup}.
	 * @param ctx the parse tree
	 */
	void enterSloteclattributegroup(ExpressionTemplateParser.SloteclattributegroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#sloteclattributegroup}.
	 * @param ctx the parse tree
	 */
	void exitSloteclattributegroup(ExpressionTemplateParser.SloteclattributegroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#sloteclattribute}.
	 * @param ctx the parse tree
	 */
	void enterSloteclattribute(ExpressionTemplateParser.SloteclattributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#sloteclattribute}.
	 * @param ctx the parse tree
	 */
	void exitSloteclattribute(ExpressionTemplateParser.SloteclattributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#cardinality}.
	 * @param ctx the parse tree
	 */
	void enterCardinality(ExpressionTemplateParser.CardinalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#cardinality}.
	 * @param ctx the parse tree
	 */
	void exitCardinality(ExpressionTemplateParser.CardinalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#minvalue}.
	 * @param ctx the parse tree
	 */
	void enterMinvalue(ExpressionTemplateParser.MinvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#minvalue}.
	 * @param ctx the parse tree
	 */
	void exitMinvalue(ExpressionTemplateParser.MinvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(ExpressionTemplateParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(ExpressionTemplateParser.ToContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#maxvalue}.
	 * @param ctx the parse tree
	 */
	void enterMaxvalue(ExpressionTemplateParser.MaxvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#maxvalue}.
	 * @param ctx the parse tree
	 */
	void exitMaxvalue(ExpressionTemplateParser.MaxvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#many}.
	 * @param ctx the parse tree
	 */
	void enterMany(ExpressionTemplateParser.ManyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#many}.
	 * @param ctx the parse tree
	 */
	void exitMany(ExpressionTemplateParser.ManyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#reverseflag}.
	 * @param ctx the parse tree
	 */
	void enterReverseflag(ExpressionTemplateParser.ReverseflagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#reverseflag}.
	 * @param ctx the parse tree
	 */
	void exitReverseflag(ExpressionTemplateParser.ReverseflagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#sloteclattributename}.
	 * @param ctx the parse tree
	 */
	void enterSloteclattributename(ExpressionTemplateParser.SloteclattributenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#sloteclattributename}.
	 * @param ctx the parse tree
	 */
	void exitSloteclattributename(ExpressionTemplateParser.SloteclattributenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#expressioncomparisonoperator}.
	 * @param ctx the parse tree
	 */
	void enterExpressioncomparisonoperator(ExpressionTemplateParser.ExpressioncomparisonoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#expressioncomparisonoperator}.
	 * @param ctx the parse tree
	 */
	void exitExpressioncomparisonoperator(ExpressionTemplateParser.ExpressioncomparisonoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#numericcomparisonoperator}.
	 * @param ctx the parse tree
	 */
	void enterNumericcomparisonoperator(ExpressionTemplateParser.NumericcomparisonoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#numericcomparisonoperator}.
	 * @param ctx the parse tree
	 */
	void exitNumericcomparisonoperator(ExpressionTemplateParser.NumericcomparisonoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#stringcomparisonoperator}.
	 * @param ctx the parse tree
	 */
	void enterStringcomparisonoperator(ExpressionTemplateParser.StringcomparisonoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#stringcomparisonoperator}.
	 * @param ctx the parse tree
	 */
	void exitStringcomparisonoperator(ExpressionTemplateParser.StringcomparisonoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#booleancomparisonoperator}.
	 * @param ctx the parse tree
	 */
	void enterBooleancomparisonoperator(ExpressionTemplateParser.BooleancomparisonoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#booleancomparisonoperator}.
	 * @param ctx the parse tree
	 */
	void exitBooleancomparisonoperator(ExpressionTemplateParser.BooleancomparisonoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#nonnegativeintegervalue}.
	 * @param ctx the parse tree
	 */
	void enterNonnegativeintegervalue(ExpressionTemplateParser.NonnegativeintegervalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#nonnegativeintegervalue}.
	 * @param ctx the parse tree
	 */
	void exitNonnegativeintegervalue(ExpressionTemplateParser.NonnegativeintegervalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#mws}.
	 * @param ctx the parse tree
	 */
	void enterMws(ExpressionTemplateParser.MwsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#mws}.
	 * @param ctx the parse tree
	 */
	void exitMws(ExpressionTemplateParser.MwsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(ExpressionTemplateParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(ExpressionTemplateParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#nonstarchar}.
	 * @param ctx the parse tree
	 */
	void enterNonstarchar(ExpressionTemplateParser.NonstarcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#nonstarchar}.
	 * @param ctx the parse tree
	 */
	void exitNonstarchar(ExpressionTemplateParser.NonstarcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#starwithnonfslash}.
	 * @param ctx the parse tree
	 */
	void enterStarwithnonfslash(ExpressionTemplateParser.StarwithnonfslashContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#starwithnonfslash}.
	 * @param ctx the parse tree
	 */
	void exitStarwithnonfslash(ExpressionTemplateParser.StarwithnonfslashContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionTemplateParser#nonfslash}.
	 * @param ctx the parse tree
	 */
	void enterNonfslash(ExpressionTemplateParser.NonfslashContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTemplateParser#nonfslash}.
	 * @param ctx the parse tree
	 */
	void exitNonfslash(ExpressionTemplateParser.NonfslashContext ctx);
}