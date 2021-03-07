package tw.com.ptsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mustache.MustacheEnvironmentCollector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import com.samskivert.mustache.Mustache;


@SpringBootApplication
@ComponentScan(basePackages = {"tw.com.ptsc"})
public class PtscProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PtscProjectApplication.class, args);
	}
	
}
