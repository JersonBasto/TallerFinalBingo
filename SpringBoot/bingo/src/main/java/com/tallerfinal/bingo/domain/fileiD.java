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
 * Tabla FilaI
 * 
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */

@Data
@Entity
@Table(name="filai")
public class fileiD implements Serializable {

     /**
     * Variable usada para manejar el tema del identificador de la tupla
     * (consecutivo)
     */
    
    private static final long serialVersionUID = 1L;

    /**
     * Identificador de la filaI
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="fila_id")
    private Long id;

    /**
     * Fila I posicion I0
     */

    @Column(name="fila_i0")
    private Integer i0;

    /**
     * Fila I posicion I1
     */

    @Column(name="fila_i1")
    private Integer i1;

    /**
     * Fila I posicion I2
     */

    @Column(name="fila_i2")
    private Integer i2;

    /**
     * Fila I posicion I3
     */

    @Column(name="fila_i3")
    private Integer i3;

    /**
     * Fila I posicion I4
     */

    @Column(name="fila_i4")
    private Integer i4;

    /**
     * Relacion entre el bingo y la Fila I
     */

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = bingoD.class, optional = false)
    @JoinColumn(name="fila_idbingo")
    @JsonBackReference
    private bingoD bingo;
}
