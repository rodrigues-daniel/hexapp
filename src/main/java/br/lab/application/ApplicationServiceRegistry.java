package br.lab.application;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class ApplicationServiceRegistry implements ApplicationContextAware {

    private static ApplicationContext context;

    public static OrderApplicationService orderApplicationService() {
        return context.getBean(OrderApplicationService.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext anAcontext) throws BeansException {

        if (ApplicationServiceRegistry.context == null) {
            ApplicationServiceRegistry.context = anAcontext;
        }
    }
}
