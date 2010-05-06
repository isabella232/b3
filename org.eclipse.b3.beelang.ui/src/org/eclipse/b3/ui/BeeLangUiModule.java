/*
 * generated by Xtext
 */
package org.eclipse.b3.ui;

import org.eclipse.b3.coloring.BeeLangHighlightConfiguration;
import org.eclipse.b3.coloring.BeeLangSemanticHighlightingCalculator;
import org.eclipse.b3.coloring.BeeLangTokenToAttributeIdMapper;
import org.eclipse.b3.outline.BeeLangOutlineNodeAdapterFactory;
import org.eclipse.b3.ui.contentassist.BeeLangAutoEditStrategy;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.outline.actions.IContentOutlineNodeAdapterFactory;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.AbstractAntlrTokenToAttributeIdMapper;

/**
 * Use this class to register components to be used within the IDE.
 */
public class BeeLangUiModule extends org.eclipse.b3.ui.AbstractBeeLangUiModule {
	public BeeLangUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends org.eclipse.jface.text.IAutoEditStrategy> bindIAutoEditStrategy() {
		return BeeLangAutoEditStrategy.class;
	}

	// To get nodes in outline view adapted for the purpose of attaching menus
	@Override
	public Class<? extends IContentOutlineNodeAdapterFactory> bindIContentOutlineNodeAdapterFactory() {
		return BeeLangOutlineNodeAdapterFactory.class;
	}

	public Class<? extends IHighlightingConfiguration> bindILexicalHighlightingConfiguration() {
		return BeeLangHighlightConfiguration.class;
	}

	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return BeeLangSemanticHighlightingCalculator.class;
	}

	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindTokenToAttributeIdMapper() {
		return BeeLangTokenToAttributeIdMapper.class;
	}

}