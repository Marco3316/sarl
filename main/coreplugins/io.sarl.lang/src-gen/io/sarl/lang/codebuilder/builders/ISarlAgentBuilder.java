/*
 * $Id$
 *
 * File is automatically generated by the Xtext language generator.
 * Do not change it.
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
package io.sarl.lang.codebuilder.builders;

import io.sarl.lang.sarl.SarlAgent;
import io.sarl.lang.sarl.SarlScript;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.xbase.lib.Pure;

/** Builder of a Sarl SarlAgent.
 */
@SuppressWarnings("all")
public interface ISarlAgentBuilder {

	/** Find the reference to the type with the given name.
	 * @param typeName the fully qualified name of the type
	 * @return the type reference.
	 */
	JvmParameterizedTypeReference newTypeRef(String typeName);

	/** Find the reference to the type with the given name.
	 * @param context the context for the type reference use
	 * @param typeName the fully qualified name of the type
	 * @return the type reference.
	 */
	JvmParameterizedTypeReference newTypeRef(Notifier context, String typeName);

	/** Replies the context for type resolution.
	 * @return the context or {@code null} if the Ecore object is the context.
	 */
	IJvmTypeProvider getTypeResolutionContext();

	/** Dispose the resource.
	 */
	void dispose();

	/** Initialize the Ecore element when inside a script.
	 */
	void eInit(SarlScript script, String name, IJvmTypeProvider context);

	/** Replies the generated SarlAgent.
	 */
	@Pure
	SarlAgent getSarlAgent();

	/** Replies the resource to which the SarlAgent is attached.
	 */
	@Pure
	Resource eResource();

	/** Change the documentation of the element.
	 *
	 * <p>The documentation will be displayed just before the element.
	 *
	 * @param doc the documentation.
	 */
	void setDocumentation(String doc);

	/** Change the super type.
	 * @param superType the qualified name of the super type,
	 *     or {@code null} if the default type.
	 */
	void setExtends(String superType);

	/** Add a modifier.
	 * @param modifier the modifier to add.
	 */
	void addModifier(String modifier);

	/** Create a SarlConstructor.
	 * @return the builder.
	 */
	ISarlConstructorBuilder addSarlConstructor();

	/** Create a SarlBehaviorUnit.
	 * @param name the type of the SarlBehaviorUnit.
	 * @return the builder.
	 */
	ISarlBehaviorUnitBuilder addSarlBehaviorUnit(String name);

	/** Create a SarlField.
	 * @param name the name of the SarlField.
	 * @return the builder.
	 */
	ISarlFieldBuilder addVarSarlField(String name);

	/** Create a SarlField.
	 * @param name the name of the SarlField.
	 * @return the builder.
	 */
	ISarlFieldBuilder addValSarlField(String name);

	/** Create a SarlField.	 *
	 * <p>This function is equivalent to {@link #addVarSarlField}.
	 * @param name the name of the SarlField.
	 * @return the builder.
	 */
	ISarlFieldBuilder addSarlField(String name);

	/** Create a SarlAction.
	 * @param name the name of the SarlAction.
	 * @return the builder.
	 */
	ISarlActionBuilder addDefSarlAction(String name);

	/** Create a SarlAction.
	 * @param name the name of the SarlAction.
	 * @return the builder.
	 */
	ISarlActionBuilder addOverrideSarlAction(String name);

	/** Create a SarlAction.	 *
	 * <p>This function is equivalent to {@link #addDefSarlAction}.
	 * @param name the name of the SarlAction.
	 * @return the builder.
	 */
	ISarlActionBuilder addSarlAction(String name);

	/** Create a SarlClass.
	 * @param name the name of the SarlClass.
	 * @return the builder.
	 */
	ISarlClassBuilder addSarlClass(String name);

	/** Create a SarlInterface.
	 * @param name the name of the SarlInterface.
	 * @return the builder.
	 */
	ISarlInterfaceBuilder addSarlInterface(String name);

	/** Create a SarlEnumeration.
	 * @param name the name of the SarlEnumeration.
	 * @return the builder.
	 */
	ISarlEnumerationBuilder addSarlEnumeration(String name);

	/** Create a SarlAnnotationType.
	 * @param name the name of the SarlAnnotationType.
	 * @return the builder.
	 */
	ISarlAnnotationTypeBuilder addSarlAnnotationType(String name);

	/** Create a SarlCapacityUses.
	 * @param name the types referenced by the SarlCapacityUses.
	 */
	void addSarlCapacityUses(String... name);

	/** Create a SarlRequiredCapacity.
	 * @param name the types referenced by the SarlRequiredCapacity.
	 */
	void addSarlRequiredCapacity(String... name);

}

