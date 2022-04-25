package com.example;

import javax.persistence.*;

@Entity
public class PrintFile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
