package ex.aaronfae.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

    @AnnotationForAspect(name = "这是一个被切入的Annotation")
    public void add() {
        System.out.println("被AnnotationForAspect注解修饰的方法：" + this.getClass().getName() + " add...");
    }
}
