package com.tallerfinal.bingo.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tallerfinal.bingo.domain.filegD;

/**
 * Se coloca la clase con la tabla que se va a manejar
 * 
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */

public interface filaGDao extends CrudRepository<filegD, Long> {

    /**
     * Se actualiza para actualiza la posicion G0 con un numero aleatorio
     * 
     * @param id Id de la tabla FilaG a actualizar
     * @param g0 Posicion g0 del bingo
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Modifying
    @Query("update filegD filag set filag.g0=:g0 where filag.id=:id")
    public void updateG0(@Param(value = "id") Long id, @Param(value = "g0") Integer g0);

    /**
     * Se actualiza para actualiza la posicion G1 con un numero aleatorio
     * 
     * @param id Id de la tabla FilaG a actualizar
     * @param g1 Posicion g1 del bingo
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Modifying
    @Query("update filegD filag set filag.g1=:g1 where filag.id=:id")
    public void updateG1(@Param(value = "id") Long id, @Param(value = "g1") Integer g1);

    /**
     * Se actualiza para actualiza la posicion G2 con un numero aleatorio
     * 
     * @param id Id de la tabla FilaG a actualizar
     * @param g2 Posicion g2 del bingo
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Modifying
    @Query("update filegD filag set filag.g2=:g2 where filag.id=:id")
    public void updateG2(@Param(value = "id") Long id, @Param(value = "g2") Integer g2);

    /**
     * Se actualiza para actualiza la posicion G3 con un numero aleatorio
     * 
     * @param id Id de la tabla FilaG a actualizar
     * @param g3 Posicion g3 del bingo
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Modifying
    @Query("update filegD filag set filag.g3=:g3 where filag.id=:id")
    public void updateG3(@Param(value = "id") Long id, @Param(value = "g3") Integer g3);

    /**
     * Se actualiza para actualiza la posicion G4 con un numero aleatorio
     * 
     * @param id Id de la tabla FilaG a actualizar
     * @param g4 Posicion g4 del bingo
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Modifying
    @Query("update filegD filag set filag.g4=:g4 where filag.id=:id")
    public void updateG4(@Param(value = "id") Long id, @Param(value = "g4") Integer g4);
}
