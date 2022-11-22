package br.lab.infrastructure.adapter;

import br.lab.application.ApplicationServiceRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.lab.www"})
public class MainApplication {
	public static void main(String[] args) {
		var anApplication = new ApplicationServiceRegistry();
		ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);
		anApplication.setApplicationContext(context);
	}

}
