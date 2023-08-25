package com.example.unicodeopgave.config;

import com.example.unicodeopgave.unicode.model.Unicode;
import com.example.unicodeopgave.unicode.service.UnicodeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    // Field injection
    private final UnicodeService unicodeService;

    //Constructor for field injection
    public InitData(UnicodeService unicodeService) {
        this.unicodeService = unicodeService;
    }


    @Override
    public void run(String... args) throws Exception {
        Set<Unicode> setOfUnicodes = new HashSet<>();
        for (int i = Character.MIN_VALUE; i < Character.MAX_VALUE; i++) {
            Unicode unicode = new Unicode();
            unicode.setUnicode(i);
            unicode.setDescription("Unicode is " + i);
            unicode.setCharacter((char) i);
            setOfUnicodes.add(unicode);
        }

        System.out.printf("Saved %d unicodes%n", setOfUnicodes.size());
        unicodeService.saveAll(setOfUnicodes);
    }
}
