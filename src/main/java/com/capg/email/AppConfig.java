package com.capg.email;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan(basePackages = "com.capg.email")

public class AppConfig {

    //@Bean
    //public BasicSpellChecker getBasicSpellChecker() {
    //    return new BasicSpellChecker();
    //}

    //@Bean
    //public AdvanceSpellChecker getAdvanceSpellChecker() {
    //    return new AdvanceSpellChecker();
    //}
    //@Bean(initMethod = "init",destroyMethod = "destroy")
    //public EmailClient getEmailClient() {
    //    EmailClient ec = new EmailClient();
    //    ec.setSpellChecker(getAdvanceSpellChecker());
    //    return ec;
    //}
}
