package com.capg.email;
import org.apache.commons.logging.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import javax.annotation.*;
@Configuration
@Component("emailClient")
public class EmailClient {
    /* For XML
    private SpellChecker spellChecker;

    public EmailClient() {
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void sendMail(String message){
        spellChecker.checkSpelling(message);
    }*/
    //For java based config
    public static final Log log= LogFactory.getLog(EmailClient.class);
    private SpellChecker spellChecker;

    public EmailClient() {
    }

    public EmailClient(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void sendMail(String message){
        spellChecker.checkSpelling(message);
    }
    @Autowired
    @Qualifier("advance")
    public void setSpellChecker(SpellChecker spellChecker){
        this.spellChecker=spellChecker;
        log.info("inside setSpellChecker");
    }
    @PostConstruct
    public void init(){
        System.out.println("inside init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("inside destroy method");
    }

}
