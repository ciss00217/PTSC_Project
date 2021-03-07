package tw.com.ptsc.common.config;

import org.springframework.boot.autoconfigure.mustache.MustacheEnvironmentCollector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.samskivert.mustache.Mustache;

//import com.samskivert.mustache.Mustache;

/**
 * MustacheConfig
 */
@Configuration
public class MustacheConfig {
	
	/**
	 * we need to configure MustacheViewResolver instead of Spring's InternalResourceViewResolver:
	 * 
	 * @param templateLoader
	 * @param environment
	 * @return
	 */
	@Bean
    public Mustache.Compiler mustacheCompiler(Mustache.TemplateLoader templateLoader, Environment environment) {

        MustacheEnvironmentCollector collector = new MustacheEnvironmentCollector();
        collector.setEnvironment(environment);

        return Mustache.compiler()
          .defaultValue("Some Default Value")
          .withLoader(templateLoader)
          .withCollector(collector);

    }
}
