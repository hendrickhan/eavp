/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.xtext

import com.google.inject.Binder
import org.eclipse.xtext.parser.antlr.LexerBindings
import com.google.inject.name.Names
import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.parser.antlr.Lexer

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class IGESRuntimeModule extends AbstractIGESRuntimeModule {
	
		override public void configureRuntimeLexer(Binder binder) {
		binder.bind(Lexer)
			.annotatedWith(Names.named(LexerBindings.RUNTIME))
			.to(CustomIGESLexer);
	}
	
	override public Class<? extends IValueConverterService> bindIValueConverterService() {
		return IGESTerminalConverters;
	}
}
