/*
 * duplicated
 * 
 * Evaluation Procedure
 * Surgical Procedure
 * Administration of substance via specific route 
 * Finding with explicit context
 * Procedure with explicit context
 * 
 */


package co.infoclinic.snomed.mrcm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.infoclinic.snomed.mrcm.parser.generated.ExpressionTemplateBaseListener;
import co.infoclinic.snomed.mrcm.parser.generated.ExpressionTemplateLexer;
import co.infoclinic.snomed.mrcm.parser.generated.ExpressionTemplateParser;

public class Parser {
	
	//private static final Logger logger = LoggerFactory.getLogger(Parser.class);
	
	static int index = 0;
	static List<String> mrcmFocusConceptID = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		List<String> mrcmList = new ArrayList<String>(); 
		String fileName = "";
		
		if (args.length == 1) {
			fileName = args[0];
		} else {
			System.out.println("snomed-mrcm-parser v1.0");
			System.out.println("Usage : java -jar snomed-mrcm-parser.jar <mrcm txt file>");
			return;
		}

		//String fileName = "resources/der2_sssssssRefset_MRCMDomainSnapshot_INT_20210131.txt";
        //File file = new File(fileName);
        //FileInputStream fis = null;
        
        try {
        	BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            // Open the input file stream
        	String line = "";
        	line = reader.readLine(); //first line
        	while((line = reader.readLine()) != null){
        		String array[] = line.split("\t");
                //배열에서 리스트 반환
        		if (array[2].equals("1")) { // inactive
        			mrcmFocusConceptID.add(array[5]); //referencedComponentId
        			mrcmList.add(array[10]); // precoordination domain template
        			//System.out.println(mrcmList.size() + " " + array[5] + " " + array[10]);
        		}
        	}
        	
        	reader.close();
	        	//fis = new FileInputStream(file);
	
        	for (String mrcm : mrcmList) {
	            // Create a CharStream that reads from standard input
	            ANTLRInputStream input = new ANTLRInputStream(mrcm);
	
	            final ExpressionTemplateLexer lexer = new ExpressionTemplateLexer(input);
	            final CommonTokenStream tokens = new CommonTokenStream(lexer);
	            final ExpressionTemplateParser parser = new ExpressionTemplateParser(tokens);
	            final List<RecognitionException> exceptions = new ArrayList<>();
	    		parser.setErrorHandler(getErrorHandler(exceptions));
	    		
	            // Begin parsing at rule prog
	            //ParseTree tree = parser.prog();
	
	            // Close the input file
	            //fis.close();
	            
	            ParserRuleContext tree;
	    		try {
	    			tree = parser.expressiontemplate();
	    		} catch (Exception e) {
	    			throw new IOException("Failed to parse template", e);
	    		}
	
	            final ParseTreeWalker walker = new ParseTreeWalker();
	            final ExpressionTemplateListener listener = new ExpressionTemplateListener();
	    		walker.walk(listener, tree);
	
	    		if (!exceptions.isEmpty()) {
	    			// Throw the first exception we have
	    			throw exceptions.iterator().next();
	    		}
	    		index += 1;
        	}
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
		
	}
	
	protected static final class ExpressionTemplateListener extends ExpressionTemplateBaseListener {
		private String domainName, domainID;
		private String attributeName, attributeID;
		
		
		@Override
		public void enterFocusconcept(ExpressionTemplateParser.FocusconceptContext ctx) {
			for (ExpressionTemplateParser.ConceptreferenceContext conceptRef : ctx.conceptreference()) {
				//System.out.println(index + " " + mrcmFocusConceptID.get(index));
				String tmpID = mrcmFocusConceptID.get(index);
				if (conceptRef.conceptreplacementslot().conceptreplacement().slotexpressionconstraint().slotsubexpressionconstraint() != null) {
					domainID = conceptRef.conceptreplacementslot().conceptreplacement().slotexpressionconstraint().slotsubexpressionconstraint().sloteclfocusconcept().sloteclconceptreference().conceptid().getText();
					if (tmpID.equals("386053000")) {
						domainID = tmpID;
						domainName = "Evaluation procedure (procedure)";
					} else if (tmpID.equals("387713003")) {
						domainID = tmpID;
						domainName = "Surgical procedure (procedure)";
					} else if (tmpID.equals("433590000")) {
						domainID = tmpID;
						domainName = "Administration of substance via specific route (procedure)";
					} else {
						domainName = conceptRef.conceptreplacementslot().conceptreplacement().slotexpressionconstraint().slotsubexpressionconstraint().sloteclfocusconcept().sloteclconceptreference().term().getText();
				//System.out.println(conceptRef.conceptid().getText() + "\t" + conceptRef.term().getText()); // yu
					}
				} else if (tmpID.equals("129125009")) {
					domainID = tmpID;
					domainName = "Procedure with explicit context (situation)";
				} else if (tmpID.equals("413350009")) {
					domainID = tmpID;
					domainName = "Finding with explicit context (situation)";
				}
			}
		}
		
		/*
		@Override
		public void enterFocusconcept(ExpressionTemplateParser.FocusconceptContext ctx) {
			domainID = ctx.conceptreference().conceptreplacement().slotexpressionconstraint().slotsubexpressionconstraint().sloteclfocusconcept().sloteclconceptreference().conceptid().getText();
			domainName = ctx.conceptreplacement().slotexpressionconstraint().slotsubexpressionconstraint().sloteclfocusconcept().sloteclconceptreference().term().getText();
			System.out.println( domainID + "\t" + domainName);
		*/
		@Override
		public void enterAttribute(ExpressionTemplateParser.AttributeContext ctx) {
			
			//setSlotInfo(currentAttribute, ctx.templateremoveslot());
			final ExpressionTemplateParser.AttributenameContext attributeNameConceptReference = ctx.attributename();
			
			if (attributeNameConceptReference.conceptreference().conceptid() != null) {
				attributeID = attributeNameConceptReference.conceptreference().conceptid().getText();
				attributeName = attributeNameConceptReference.conceptreference().term().getText() + " " + "(attribute)";
				//System.out.println(" " + typeConceptReference.conceptreference().conceptid().getText() + " " + typeConceptReference.conceptreference().term().getText()); // yu
				//System.out.println(attributeID + "\t" + attributeName);
				
				final ExpressionTemplateParser.AttributevalueContext attributeValue = ctx.attributevalue();
				
				if (attributeValue.expressionvalue() != null) {
					final ExpressionTemplateParser.ExpressionvalueContext expressionvalue = attributeValue.expressionvalue();
					if (expressionvalue.conceptreference().conceptreplacementslot().conceptreplacement().slotexpressionconstraint().slotsubexpressionconstraint() != null) {
						//final ExpressionTemplateParser.ConceptreferenceContext conceptreference = expressionvalue.conceptreference();
						//System.out.println("! " + expressionvalue.conceptreference().conceptreplacementslot().conceptreplacement().slotexpressionconstraint().slotsubexpressionconstraint().sloteclfocusconcept().sloteclconceptreference().conceptid().getText());
						
						//if (conceptreference.conceptid() != null) {
							
						//	final ExpressionTemplateParser.ConceptidContext conceptid = conceptreference.conceptid();
						//	final ExpressionTemplateParser.TermContext term = conceptreference.term();
							System.out.println(
									attributeID
								+ "\t" + attributeName 
								+ "\t" + domainID 
								+ "\t" + domainName 
								+ "\t" + expressionvalue.conceptreference().conceptreplacementslot().conceptreplacement().slotexpressionconstraint().slotsubexpressionconstraint().sloteclfocusconcept().sloteclconceptreference().conceptid().getText() 
								+ "\t" + expressionvalue.conceptreference().conceptreplacementslot().conceptreplacement().slotexpressionconstraint().slotsubexpressionconstraint().sloteclfocusconcept().sloteclconceptreference().term().getText() ); 
						//}
					} else if (expressionvalue.conceptreference().conceptreplacementslot().conceptreplacement().slotexpressionconstraint().slotcompoundexpressionconstraint() != null) {
						//System.out.println("!! " + expressionvalue.conceptreference().conceptreplacementslot().conceptreplacement().slotexpressionconstraint().slotcompoundexpressionconstraint().getText());							
									for (ExpressionTemplateParser.SlotsubexpressionconstraintContext slotSubExpressionConstraint 
											: expressionvalue.conceptreference().conceptreplacementslot().conceptreplacement().slotexpressionconstraint().slotcompoundexpressionconstraint().slotdisjunctionexpressionconstraint().slotsubexpressionconstraint()) {
										System.out.println(
											attributeID 
											+ "\t" + attributeName 
											+ "\t" + domainID 
											+ "\t" + domainName 
											+ "\t" + slotSubExpressionConstraint.sloteclfocusconcept().sloteclconceptreference().conceptid().getText() 
											+ "\t" + slotSubExpressionConstraint.sloteclfocusconcept().sloteclconceptreference().term().getText() );
									}
					} 
				}
			}
		}
	}
	
	private static ANTLRErrorStrategy getErrorHandler(final List<RecognitionException> exceptions) {
		return new ANTLRErrorStrategy() {
			@Override
			public void reset(org.antlr.v4.runtime.Parser recognizer) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Token recoverInline(org.antlr.v4.runtime.Parser recognizer) throws RecognitionException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void recover(org.antlr.v4.runtime.Parser recognizer, RecognitionException e)
					throws RecognitionException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void sync(org.antlr.v4.runtime.Parser recognizer) throws RecognitionException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean inErrorRecoveryMode(org.antlr.v4.runtime.Parser recognizer) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void reportMatch(org.antlr.v4.runtime.Parser recognizer) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void reportError(org.antlr.v4.runtime.Parser recognizer, RecognitionException e) {
				// TODO Auto-generated method stub
				//logger.info("Parsing error.", e);
				exceptions.add(e);
			}
		};
	}

}
