package com.example.unicodeopgave.unicode.controller;

import com.example.unicodeopgave.unicode.service.UnicodeService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UnicodeController {

    private final UnicodeService unicodeService;

    // Constructor
    public UnicodeController(UnicodeService unicodeService) {
        this.unicodeService = unicodeService;
    }

    // Mappings

    @GetMapping("/unicode/int-to-char/{i}")
    public String unicodeToChar(@PathVariable int i) {
        return "Unicode=" + i + " char=" + (char) i;
    }

    @GetMapping("/unicode/char-to-int/{c}")
    public String charToUnicode(@PathVariable char c) {
        return "Char=" + c + " Unicode=" + (int) c;
    }

    @PostMapping("/unicode/save/{unicodeToSave}")
    public void saveUnicode(@PathVariable Character unicodeToSave) {
        unicodeService.saveUnicode(unicodeToSave, "Unicode is " + unicodeToSave, unicodeToSave);
    }
}
