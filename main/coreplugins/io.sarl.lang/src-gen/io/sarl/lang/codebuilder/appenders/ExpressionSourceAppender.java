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
package io.sarl.lang.codebuilder.appenders;

import io.sarl.lang.codebuilder.builders.IExpressionBuilder;
import java.io.IOException;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.compiler.ISourceAppender;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;

/** Builder of a Sarl XExpression.
 */
@SuppressWarnings("all")
public class ExpressionSourceAppender extends AbstractSourceAppender implements IExpressionBuilder {

	private final IExpressionBuilder builder;

	public ExpressionSourceAppender(IExpressionBuilder builder) {
		this.builder = builder;
	}

	public void build(ISourceAppender appender) throws IOException {
		build(this.builder.getXExpression(), appender);
	}

	/** Find the reference to the type with the given name.
	 * @param typeName the fully qualified name of the type
	 * @return the type reference.
	 */
	public JvmParameterizedTypeReference newTypeRef(String typeName) {
		return this.builder.newTypeRef(typeName);
	}

	/** Find the reference to the type with the given name.
	 * @param context the context for the type reference use
	 * @param typeName the fully qualified name of the type
	 * @return the type reference.
	 */
	public JvmParameterizedTypeReference newTypeRef(Notifier context, String typeName) {
		return this.builder.newTypeRef(context, typeName);
	}

	public IJvmTypeProvider getTypeResolutionContext() {
		return this.builder.getTypeResolutionContext();
	}

	/** Initialize the expression.
	 * @param context the context of the expressions.
	 * @param setter the object that permits to assign the expression to the context.
	 */
	public void eInit(EObject context, Procedure1<? super XExpression> setter, IJvmTypeProvider typeContext) {
		this.builder.eInit(context, setter, typeContext);
	}

	/** Replies the last created expression.
	 *
	 * @return the last created expression.
	 */
	@Pure
	public XExpression getXExpression() {
		return this.builder.getXExpression();
	}

	/** Replies the resource to which the XExpression is attached.
	 */
	@Pure
	public Resource eResource() {
		return getXExpression().eResource();
	}

	/** Change the expression in the container.
	 *
	 * @param expression the textual representation of the expression.
	 */
	public void setExpression(String expression) {
		this.builder.setExpression(expression);
	}

	/** Change the expression in the container.
	 *
	 * @param expression the expression.
	 */
	public void setXExpression(XExpression expression) {
		this.builder.setXExpression(expression);
	}


	/** Replies the XExpression for the default value associated to the given type.
	 * @param type the type for which the default value should be determined.
	 * @return the default value.
	 */
	@Pure
	public XExpression getDefaultXExpressionForType(String type) {
		return this.builder.getDefaultXExpressionForType(type);
	}

	/** Replies the default value for the given type.
	 * @param type the type for which the default value should be determined.
	 * @return the default value.
	 */
	@Pure
	public String getDefaultValueForType(String type) {
		return this.builder.getDefaultValueForType(type);
	}

	/** Change the documentation of the element.
	 *
	 * <p>The documentation will be displayed just before the element.
	 *
	 * @param doc the documentation.
	 */
	public void setDocumentation(String doc) {
		this.builder.setDocumentation(doc);
	}

	@Override
	@Pure
	public String toString() {
		return this.builder.toString();
	}

	/** Create a reference to "this" object or to the current type.
	 *
	 * @return the reference.
	 */
	public XFeatureCall createReferenceToThis() {
		return this.builder.createReferenceToThis();
	}

	/** Create a reference to "super" object or to the super type.
	 *
	 * @return the reference.
	 */
	public XFeatureCall createReferenceToSuper() {
		return this.builder.createReferenceToSuper();

	}

	/** Dispose the resource.
	 */
	public void dispose() {
		this.builder.dispose();
	}

}

