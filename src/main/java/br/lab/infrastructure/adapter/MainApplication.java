package br.lab.infrastructure.adapter;

import br.lab.application.ApplicationServiceRegistry;
import br.lab.application.OrderApplicationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Service;

@SpringBootApplication(scanBasePackages = {"br.lab.www","br.lab.application"})
public class MainApplication {
	public static void main(String[] args) {
		var anApplication = new ApplicationServiceRegistry();
		ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);
		anApplication.setApplicationContext(context);
	}

}
