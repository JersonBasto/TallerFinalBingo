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
 * Tabla FilaG
 * 
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */

@Data
@Entity
@Table(name = "filag")
public class filegD implements Serializable {

    /**
     * Variable usada para manejar el tema del identificador de la tupla
     * (consecutivo)
     */

    private static final long serialVersionUID = 1L;

    /**
     * Identificador de la filaG
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fila_id")
    private Long id;

    /**
     * Fila G posicion G0
     */

    @Column(name = "fila_g0")
    private Integer g0;

    /**
     * Fila G posicion G1
     */

    @Column(name = "fila_g1")
    private Integer g1;

    /**
     * Fila G posicion G2
     */

    @Column(name = "fila_g2")
    private Integer g2;

    /**
     * Fila G posicion G3
     */

    @Column(name = "fila_g3")
    private Integer g3;

    /**
     * Fila G posicion G4
     */

    @Column(name = "fila_g4")
    private Integer g4;

    /**
     * Relacion entre bingo y la fila G
     */

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = bingoD.class, optional = false)
    @JoinColumn(name = "fila_idbingo")
    @JsonBackReference
    private bingoD bingo;
}
