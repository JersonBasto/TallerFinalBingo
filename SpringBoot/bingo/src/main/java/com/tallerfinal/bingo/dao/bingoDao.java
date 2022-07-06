package com.tallerfinal.bingo.dao;

import org.springframework.data.repository.CrudRepository;

import com.tallerfinal.bingo.domain.bingoD;

/**
 * Se coloca la clase con la tabla que se va a manejar
 * 
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */

public interface bingoDao extends CrudRepository<bingoD,Long> {
    
}
