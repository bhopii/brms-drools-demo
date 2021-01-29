package com.abhi.brms.drools.demo.configuration;

import java.io.InputStream;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abhi.brms.drools.demo.services.DroolsService;
import com.abhi.brms.drools.demo.services.DroolsServiceImpl;

@Configuration
public class RulesConfiguration {
	private static final String drlFile = "rules/PROMO_CALC_RULE.drl";

	@Bean
	public KieContainer kieContainer() {

		KieServices kieServices = KieServices.Factory.get();

		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		kieFileSystem.write("src/main/resources/" + drlFile,
				ResourceFactory.newInputStreamResource(getFileFromResourceAsStream(drlFile)));
		KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
		kieBuilder.buildAll();
		KieModule kieModule = kieBuilder.getKieModule();

		return kieServices.newKieContainer(kieModule.getReleaseId());
	}

	@Bean
	public DroolsService droolsService() {
		return new DroolsServiceImpl();
	}

	// get a file from the resources folder
	// works everywhere, IDEA, unit test and JAR file.
	private InputStream getFileFromResourceAsStream(String fileName) {

		// The class loader that loaded the class
		ClassLoader classLoader = getClass().getClassLoader();
		InputStream inputStream = classLoader.getResourceAsStream(fileName);

		// the stream holding the file content
		if (inputStream == null) {
			throw new IllegalArgumentException("file not found! " + fileName);
		} else {
			return inputStream;
		}

	}
}
