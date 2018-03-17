package ex.aaronfae.ch3.conditional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为：" + listService.showListCommand());
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public LinuxListService linuxListService() {
        return new LinuxListService();
    }

    @Bean
    @Conditional(WindowsCondition.class)
    public WindowsListService windowsListService() {
        return new WindowsListService();
    }
}
