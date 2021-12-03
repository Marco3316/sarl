package io.sarl.lang.web.resource;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.model.IWebResourceSetProvider;
import org.eclipse.xtext.xbase.lib.Pair;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class SARLResourceSetProvider implements IWebResourceSetProvider {
	
	public static final String MULTI_RESOURCE_PREFIX = "multi-resource";
		
	@Inject 
	private Provider<ResourceSet> provider;
	
	@Override
	public ResourceSet get(String resourceId, IServiceContext serviceContext) {
		if (resourceId != null && resourceId.startsWith(MULTI_RESOURCE_PREFIX)) {
			int pathEnd = Math.max(resourceId.indexOf('/'), MULTI_RESOURCE_PREFIX.length());
			return serviceContext.getSession().get(Pair.of(ResourceSet.class, resourceId.substring(0, pathEnd)), ()->provider.get());
		} else
			return provider.get();
	}


}
