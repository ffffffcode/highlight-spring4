package ex.aaronfae.ch2.prepost;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class PrePostConfig {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean("jsr250WayService")
    public JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
