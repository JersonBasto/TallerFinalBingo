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
 * Tabla FilaO
 * 
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */

@Data
@Entity
@Table(name="filao")
public class fileoD implements Serializable{

    /**
     * Variable usada para manejar el tema del identificador de la tupla
     * (consecutivo)
     */
    
    private static final long serialVersionUID=1L;

    /**
     * Identificador de la filaO
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="fila_id")
    private Long id;

    /**
     * Fila O posicion O0
     */

    @Column(name="fila_o0")
    private Integer o0;

    /**
     * Fila O posicion O1
     */

    @Column(name="fila_o1")
    private Integer o1;

    /**
     * Fila O posicion O2
     */

    @Column(name="fila_o2")
    private Integer o2;

    /**
     * Fila O posicion O3
     */

    @Column(name="fila_o3")
    private Integer o3;

    /**
     * Fila O posicion O4
     */

    @Column(name="fila_o4")
    private Integer o4;

    /**
     * Relacion entre el bingo y Fila O
     */

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = bingoD.class,optional = false)
    @JoinColumn(name="fila_idbingo")
    @JsonBackReference
    private bingoD bingo;
}
