/*
* generated by Xtext
*/
package org.eclipse.b3.parser.antlr;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

import com.google.inject.Inject;

import org.eclipse.b3.services.BeeLangGrammarAccess;

public class BeeLangParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private BeeLangGrammarAccess grammarAccess;
	
	@Override
	protected IParseResult parse(String ruleName, CharStream in) {
		TokenSource tokenSource = createLexer(in);
		XtextTokenStream tokenStream = createTokenStream(tokenSource);
		tokenStream.setInitialHiddenTokens();
		org.eclipse.b3.parser.antlr.internal.InternalBeeLangParser parser = createParser(tokenStream);
		parser.setTokenTypeMap(getTokenDefProvider().getTokenDefMap());
		parser.setSyntaxErrorProvider(getSyntaxErrorProvider());
		parser.setUnorderedGroupHelper(getUnorderedGroupHelper().get());
		try {
			if(ruleName != null)
				return parser.parse(ruleName);
			return parser.parse();
		} catch (Exception re) {
			throw new ParseException(re.getMessage(),re);
		}
	}
	
	protected org.eclipse.b3.parser.antlr.internal.InternalBeeLangParser createParser(XtextTokenStream stream) {
		return new org.eclipse.b3.parser.antlr.internal.InternalBeeLangParser(stream, getElementFactory(), getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "BeeModel";
	}
	
	public BeeLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BeeLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}