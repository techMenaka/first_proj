package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * Created by Menaka on 8/1/16.
 */
@SpringBootApplication
public class HelloApplication {

   public static void main(String[] args) {
        //ApplicationContext ctx = SpringApplication.run(HelloApplication.class, args);
        ApplicationContext ctx= new AnnotationConfigApplicationContext(HelloApplication.class);
        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

  /*  public static void main(String[] args) {
        try {
            ApplicationContext cntx = new AnnotationConfigApplicationContext(HelloApplication.class);
//hit the url http://localhost:8080/helloExample
        } catch (Exception e) {
            e.printStackTrace();
        }


    }*/

    //<editor-fold desc="Description">
    String sting = "SELECT * FROM tale";
    //</editor-fold>

}
