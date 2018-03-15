package ex.aaronfae.ch2.prepost;

public class BeanWayService {

    public BeanWayService() {
        super();
        System.out.println(this.getClass().getName() + "构造函数..");
    }

    public void init() {
        System.out.println(this.getClass().getName() + "init...");
    }

    public void destroy() {
        System.out.println(this.getClass().getName() + "destroy...");
    }
}
