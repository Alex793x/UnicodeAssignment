package com.example.unicodeopgave.unicode.repository;

import com.example.unicodeopgave.unicode.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnicodeRepository extends JpaRepository<Unicode, Integer> {

}
