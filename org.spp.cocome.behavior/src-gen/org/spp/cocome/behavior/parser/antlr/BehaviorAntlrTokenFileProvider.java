/*
 * generated by Xtext
 */
package org.spp.cocome.behavior.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BehaviorAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.tokens");
	}
}
