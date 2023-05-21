package com.example.chatmsgr.model;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

@Entity
public class Message {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;



}
