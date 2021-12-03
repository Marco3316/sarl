package io.sarl.lang.web.resource;

import org.eclipse.xtext.web.server.generator.DefaultContentTypeProvider;
import org.eclipse.xtext.web.server.generator.GeneratorService;

public class SARLContentTypeProvider extends DefaultContentTypeProvider {
	
	@Override
	public String getContentType(String fileName) {
		if (GeneratorService.DEFAULT_ARTIFACT.equals(fileName))
			return "text/html";
		return super.getContentType(fileName);
	}

}
