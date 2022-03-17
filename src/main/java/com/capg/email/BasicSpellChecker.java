package com.capg.email;

import org.springframework.stereotype.Component;

@Component("basic")
public class BasicSpellChecker implements SpellChecker {
    @Override
    public void checkSpelling(String message) {
        if(!message.isEmpty()) {
            System.out.println("Spelling check performed by "+getClass().getSimpleName()+"\nEmail message: "+message);
        } else
            throw new RuntimeException("Sorry, Email can't be empty.");
    }
}
