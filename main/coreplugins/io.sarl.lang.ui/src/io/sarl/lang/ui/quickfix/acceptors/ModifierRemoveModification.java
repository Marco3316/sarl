/*
 * $Id$
 *
 * SARL is an general-purpose agent programming language.
 * More details on http://www.sarl.io
 *
 * Copyright (C) 2014-2021 the original authors or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.sarl.lang.ui.quickfix.acceptors;

import java.text.MessageFormat;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jdt.internal.ui.text.correction.IProposalRelevance;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import io.sarl.lang.ui.quickfix.SARLQuickfixProvider;

/**
 * Remove a modifier.
 *
 * @author $Author: sgalland$
 * @version $FullVersion$
 * @mavengroupid $GroupId$
 * @mavenartifactid $ArtifactId$
 * @since 0.12
 */
public final class ModifierRemoveModification extends SARLSemanticModification {

	private final String modifier;

	/** Constructor.
	 * @param modifier the modifier to remove.
	 */
	private ModifierRemoveModification(String modifier) {
		this.modifier = modifier;
	}

	/** Create the quick fix if needed.
	 *
	 * <p>No user data.
	 *
	 * @param provider the quick fix provider.
	 * @param issue the issue to fix.
	 * @param acceptor the quick fix acceptor.
	 * @param modifier the modifier to remove.
	 */
	public static void accept(SARLQuickfixProvider provider, Issue issue, IssueResolutionAcceptor acceptor, String modifier) {
		final ModifierRemoveModification modification = new ModifierRemoveModification(modifier);
		modification.setIssue(issue);
		modification.setTools(provider);
		acceptor.accept(issue,
				MessageFormat.format(Messages.SARLQuickfixProvider_18, modifier),
				MessageFormat.format(Messages.SARLQuickfixProvider_19, modifier),
				JavaPluginImages.IMG_CORRECTION_REMOVE,
				modification,
				IProposalRelevance.REMOVE_INVALID_MODIFIERS);
	}

	@Override
	public void apply(EObject element, IModificationContext context) throws Exception {
		if (element instanceof XtendMember) {
			((XtendMember) element).getModifiers().remove(this.modifier);
		}
	}

}
