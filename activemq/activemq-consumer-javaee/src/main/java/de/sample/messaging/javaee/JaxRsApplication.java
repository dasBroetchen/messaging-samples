package de.sample.messaging.javaee;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

@OpenAPIDefinition(
		  info = @Info(
		    version = "1",
		    title = "Customer Consumer API"
		  )
		)
		@ApplicationPath("api/v1")
		public class JaxRsApplication extends Application {
		}
