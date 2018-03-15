package ex.aaronfae.ch2.spel;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

import java.io.IOException;

@Configuration
@ComponentScan
@PropertySource("classpath:test.properties")
public class SpelConfig {

    @Value("I love u~")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{T(java.lang.Math).random()*100.0}")
    private Double randomNum;

    @Value("#{demoService.another}")
    private String fromAnother;

    @Value("classpath:test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testURL;

    @Value("${author}")
    private String authorName;

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpelConfig.class);
        SpelConfig spelConfig = context.getBean(SpelConfig.class);
        spelConfig.print();
    }

    public void print() {
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(randomNum);
        System.out.println(fromAnother);
        try {
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testURL.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(authorName);
    }


}
