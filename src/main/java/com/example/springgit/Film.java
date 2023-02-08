package com.example.springgit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Film {

    @Id
    @GeneratedValue
    private Long id;
}
