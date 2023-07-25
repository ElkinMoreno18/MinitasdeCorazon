package com.keycode.minitasdecorazon.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Entity
@Table(name = "proceso_desminado")
@Getter
@Setter
public class DesminadoProcess {

    @Serial
    private static final long serialVersionUID = -7560482857466474045L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ubicacion;

    private String region;

    private String tipoDesminado;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private User usuario;


}
