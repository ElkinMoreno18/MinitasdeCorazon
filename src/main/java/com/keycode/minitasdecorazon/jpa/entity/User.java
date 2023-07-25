package com.keycode.minitasdecorazon.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class User {

    @Serial
    private static final long serialVersionUID = 592673973778994431L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String email;

    private String password;

    private String role;

}
