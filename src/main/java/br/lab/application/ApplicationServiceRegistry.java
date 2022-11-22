package br.lab.application;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationServiceRegistry implements ApplicationContextAware {

    private static ApplicationContext context;

    public static OrderApplicationService orderApplicationService() {
        return (OrderApplicationService) context.getBean("orderApplicationService");
    }

    @Override
    public void setApplicationContext(ApplicationContext anAcontext) throws BeansException {

        if (ApplicationServiceRegistry.context == null) {
            ApplicationServiceRegistry.context = anAcontext;
        }
    }
}
