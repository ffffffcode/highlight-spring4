package ex.aaronfae.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {

    public void add() {
        System.out.println(this.getClass().getName() + " add...");
    }
}
