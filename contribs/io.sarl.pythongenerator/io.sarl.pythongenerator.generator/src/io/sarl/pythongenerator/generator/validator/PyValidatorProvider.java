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

package io.sarl.pythongenerator.generator.validator;

import java.util.Collections;
import java.util.List;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import org.eclipse.emf.ecore.resource.Resource;

import io.sarl.lang.extralanguage.validator.AbstractExtraLanguageValidator;
import io.sarl.lang.extralanguage.validator.IExtraLanguageValidatorProvider;

/** The provider of a validator from SARL to the Python language.
 *
 * @author $Author: sgalland$
 * @version $FullVersion$
 * @mavengroupid $GroupId$
 * @mavenartifactid $ArtifactId$
 * @since 0.6
 */
@Singleton
public class PyValidatorProvider implements IExtraLanguageValidatorProvider {

	@Inject
	private Injector injector;

	@Override
	public List<AbstractExtraLanguageValidator> getValidators(Resource resource) {
		final PyValidator validator = this.injector.getInstance(PyValidator.class);
		return Collections.singletonList(validator);
	}

}
