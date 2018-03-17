package ex.aaronfae.ch3.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@WiselyConfiguration
public class AnnotationConfig {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
    }
}
