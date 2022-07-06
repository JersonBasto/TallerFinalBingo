package com.tallerfinal.bingo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * Tabla bingo
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */

@Data
@Entity
@Table(name = "bingo")
public class bingoD implements Serializable {

    /**
     * Variable usada para manejar el tema del identificador de la tupla (consecutivo)
     */
    private static final long serialVersionUID = 1L;

    /**
     * Identificador del bingo
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bingo")
    private Long id;
    /**
     * id del socket
     */

    @Column(name = "id_socket")
    private String idSocket;

    /**
     * relacion entre Bingo y la Tabla de la fila B
     */

    @OneToMany(targetEntity = filebD.class, mappedBy = "bingo", cascade = CascadeType.ALL)
    private List<filebD> filaB = new ArrayList<>();

    /**
     * relacion entre Bingo y la Tabla de la fila I
     */

    @OneToMany(targetEntity = fileiD.class, mappedBy = "bingo", cascade = CascadeType.ALL)
    private List<fileiD> filaI = new ArrayList<>();

    /**
     * relacion entre Bingo y la Tabla de la fila N
     */

    @OneToMany(targetEntity = filenD.class, mappedBy = "bingo", cascade = CascadeType.ALL)
    private List<filenD> filaN = new ArrayList<>();

    /**
     * relacion entre Bingo y la Tabla de la fila G
     */

    @OneToMany(targetEntity = filegD.class, mappedBy = "bingo", cascade = CascadeType.ALL)
    private List<filegD> filaG = new ArrayList<>();
    
    /**
     * relacion entre Bingo y la Tabla de la fila O
     */

    @OneToMany(targetEntity = fileoD.class, mappedBy = "bingo", cascade = CascadeType.ALL)
    private List<fileoD> filaO = new ArrayList<>();
}
