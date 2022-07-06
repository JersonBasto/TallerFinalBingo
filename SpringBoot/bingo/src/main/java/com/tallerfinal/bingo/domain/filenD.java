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
 * Tabla FilaN
 * 
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */

@Data
@Entity
@Table(name = "filan")
public class filenD implements Serializable {

     /**
     * Variable usada para manejar el tema del identificador de la tupla
     * (consecutivo)
     */

    private static final long serialVersionUID = 1L;

    /**
     * Identificador de la filaN
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fila_id")
    private Long id;

    /**
     * Fila N posicion N0
     */

    @Column(name = "fila_n0")
    private Integer n0;

    /**
     * Fila N posicion N1
     */

    @Column(name = "fila_n1")
    private Integer n1;

    /**
     * Fila N posicion N3
     */

    @Column(name = "fila_n3")
    private Integer n3;

    /**
     * Fila N posicion N4
     */

    @Column(name = "fila_n4")
    private Integer n4;

    /**
     * Relacion entre el bingo y la Fila N
     */

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = bingoD.class, optional = false)
    @JoinColumn(name="fila_idbingo")
    @JsonBackReference
    private bingoD bingo;
}
