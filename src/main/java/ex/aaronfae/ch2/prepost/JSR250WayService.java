package ex.aaronfae.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

    public JSR250WayService() {
        super();
        System.out.println(this.getClass().getName() + "构造函数..");
    }

    @PostConstruct
    public void init() {
        System.out.println(this.getClass().getName() + "init...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(this.getClass().getName() + "destroy...");
    }
}
