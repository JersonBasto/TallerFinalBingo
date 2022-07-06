package com.tallerfinal.bingo.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

/**
 * Tabla FilaB
 * 
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */

@Data
@Entity
@Table(name = "filab")
public class filebD implements Serializable {

    /**
     * Variable usada para manejar el tema del identificador de la tupla
     * (consecutivo)
     */
    private static final long serialVersionUID = 1L;

    /**
     * Identificador de la filaB
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fila_id")
    private Long id;

    /**
     * Fila B posicion B0
     */

    @Column(name = "fila_b0")
    private Integer b0;

    /**
     * Fila B posicion B1
     */

    @Column(name = "fila_b1")
    private Integer b1;

    /**
     * Fila B posicion B2
     */

    @Column(name = "fila_b2")
    private Integer b2;

    /**
     * Fila B posicion B3
     */

    @Column(name = "fila_b3")
    private Integer b3;

    /**
     * Fila B posicion B4
     */

    @Column(name = "fila_b4")
    private Integer b4;

    /**
     * Relacion entre bingo y la FilaB
     */

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = bingoD.class, optional = false)
    @JoinColumn(name = "fila_idbingo")
    @JsonBackReference
    private bingoD bingo;
}
