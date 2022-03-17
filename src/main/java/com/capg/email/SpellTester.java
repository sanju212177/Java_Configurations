package com.capg.email;
import com.capg.email.AppConfig;
import com.capg.email.EmailClient;
import com.example.demo.DemoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class SpellTester implements CommandLineRunner {
    @Autowired
    EmailClient emailClient;
    public static void main(String[] args){
        /*For XML
        ApplicationContext container = new ClassPathXmlApplicationContext("email.xml");
        EmailClient emailClient = container.getBean("advancespellchecker", EmailClient.class);
        emailClient.sendMail("Hello");*/

        /*//For Java based
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
        //EmailClient emailClient = container.getBean(EmailClient.class);
        EmailClient emailClient = (EmailClient) container.getBean("emailClient");
        emailClient.sendMail("hello");
        ((ConfigurableApplicationContext)container).close();*/
        SpringApplication.run(SpellTester.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        emailClient.sendMail("Hello");
    }
}
