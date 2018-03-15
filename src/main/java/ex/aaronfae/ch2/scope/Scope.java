package ex.aaronfae.ch2.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Scope {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Scope.class);
        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
        System.out.println("p1是否等于p2:" + p1.equals(p2));
        System.out.println("s1是否等于s2:" + s1.equals(s2));
    }
}
