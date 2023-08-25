package com.example.unicodeopgave.unicode.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Unicode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, name = "`character`")
    private char character;

    @Column(nullable = false)
    private int unicode;

    @Column(nullable = false)
    private String description;
}
