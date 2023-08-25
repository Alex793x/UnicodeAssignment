package com.example.unicodeopgave.unicode.service;

import com.example.unicodeopgave.unicode.model.Unicode;
import com.example.unicodeopgave.unicode.repository.UnicodeRepository;
import org.springframework.stereotype.Service;

@Service
public class UnicodeService {

    private final UnicodeRepository unicodeRepository;

    // Constructor
    public UnicodeService(UnicodeRepository unicodeRepository) {
        this.unicodeRepository = unicodeRepository;
    }

    // Methods

    // Save a Unicode character with optional description and name
    public void saveUnicode(int unicodeValue, String description, char character) {
        Unicode unicode = new Unicode();
        unicode.setUnicode(unicodeValue);
        unicode.setDescription(description);
        unicode.setCharacter(character);
        unicodeRepository.save(unicode);
    }

    // Fetch a Unicode character by its integer representation
    public Unicode getUnicodeByInt(int i) {
        char c = (char) i;
        return unicodeRepository.findById((int) c).orElse(null);
    }

    // Fetch a Unicode character by the character itself
    public Unicode getUnicodeByChar(Character c) {
        return unicodeRepository.findById((int) c).orElse(null);
    }

    public void saveAll(Iterable<Unicode> unicodes) {
        unicodeRepository.saveAll(unicodes);
    }
}
