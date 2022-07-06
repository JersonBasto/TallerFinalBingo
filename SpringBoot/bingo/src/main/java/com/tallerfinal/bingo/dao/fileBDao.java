package com.tallerfinal.bingo.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tallerfinal.bingo.domain.filebD;

/**
 * Se coloca la clase con la tabla que se va a manejar
 * 
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */

public interface fileBDao extends CrudRepository<filebD, Long> {

        /**
         * Se actualiza para actualiza la posicion B0 con un numero aleatorio
         * 
         * @param id Id de la tabla FilaB a actualizar
         * @param b0 Posicion B0 del bingo
         * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
         */
        @Modifying
        @Query("update filebD filab set filab.b0=:b0 where filab.id=:id")
        public void updateB0(
                        @Param(value = "id") Long id,
                        @Param(value = "b0") Integer b0);
        /**
         * Se actualiza para actualiza la posicion B1 con un numero aleatorio
         * 
         * @param id Id de la tabla FilaB a actualizar
         * @param b1 Posicion B1 del bingo
         * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
         */
        @Modifying
        @Query("update filebD filab set filab.b1=:b1 where filab.id=:id")
        public void updateB1(
                        @Param(value = "id") Long id,
                        @Param(value = "b1") Integer b0);
        /**
         * Se actualiza para actualiza la posicion B2 con un numero aleatorio
         * 
         * @param id Id de la tabla FilaB a actualizar
         * @param b2 Posicion B2 del bingo
         * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
         */
        @Modifying
        @Query("update filebD filab set filab.b2=:b2 where filab.id=:id")
        public void updateB2(
                        @Param(value = "id") Long id,
                        @Param(value = "b2") Integer b0);
        /**
         * Se actualiza para actualiza la posicion B3 con un numero aleatorio
         * 
         * @param id Id de la tabla FilaB a actualizar
         * @param b3 Posicion B3 del bingo
         * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
         */
        @Modifying
        @Query("update filebD filab set filab.b3=:b3 where filab.id=:id")
        public void updateB3(
                        @Param(value = "id") Long id,
                        @Param(value = "b3") Integer b0);
        /**
         * Se actualiza para actualiza la posicion B4 con un numero aleatorio
         * 
         * @param id Id de la tabla FilaB a actualizar
         * @param b4 Posicion B4 del bingo
         * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
         */
        @Modifying
        @Query("update filebD filab set filab.b4=:b4 where filab.id=:id")
        public void updateB4(
                        @Param(value = "id") Long id,
                        @Param(value = "b4") Integer b0);
}
