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

package io.sarl.lang.ui.highlighting;

import org.eclipse.xtend.ide.common.highlighting.XtendHighlightingStyles;

/**
 * Highlighting styles for SARL.
 *
 * @author $Author: sgalland$
 * @version $FullVersion$
 * @mavengroupid $GroupId$
 * @mavenartifactid $ArtifactId$
 * @since 0.8
 */
@SuppressWarnings("checkstyle:interfaceistype")
public interface SARLHighlightingStyles extends XtendHighlightingStyles {

	/** Style for a call to a capacity's method.
	 */
	String CAPACITY_METHOD_INVOCATION = "sarl.capacity.method.invocation"; //$NON-NLS-1$

	/** Style for an asynchronous call to a method.
	 * @since 0.12
	 */
	String ASYNCHRONOUS_METHOD_INVOCATION = "sarl.asynchronous.method.invocation"; //$NON-NLS-1$

}
