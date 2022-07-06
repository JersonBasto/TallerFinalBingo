package com.tallerfinal.bingo.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tallerfinal.bingo.domain.filenD;

/**
 * Se coloca la clase con la tabla que se va a manejar
 * 
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */

public interface filaNDao extends CrudRepository<filenD, Long> {

        /**
         * Se actualiza para actualiza la posicion N0 con un numero aleatorio
         * 
         * @param id Id de la tabla FilaN a actualizar
         * @param n0 Posicion N0 del bingo
         * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
         */
        @Modifying
        @Query("update filenD filan set filan.n0 =:n0 where filan.id=:id")
        public void updateN0(
                        @Param(value = "id") Long id,
                        @Param(value = "n0") Integer n0);

        /**
         * Se actualiza para actualiza la posicion N1 con un numero aleatorio
         * 
         * @param id Id de la tabla FilaN a actualizar
         * @param n1 Posicion N1 del bingo
         * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
         */

        @Modifying
        @Query("update filenD filan set filan.n1 =:n1 where filan.id=:id")
        public void updateN1(
                        @Param(value = "id") Long id,
                        @Param(value = "n1") Integer n1);

        /**
         * Se actualiza para actualiza la posicion N2 con un numero aleatorio
         * 
         * @param id Id de la tabla FilaN a actualizar
         * @param n2 Posicion N2 del bingo
         * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
         */

        @Modifying
        @Query("update filenD filan set filan.n3 =:n3 where filan.id=:id")
        public void updateN3(
                        @Param(value = "id") Long id,
                        @Param(value = "n3") Integer n3);

        @Modifying
        @Query("update filenD filan set filan.n4 =:n4 where filan.id=:id")
        public void updateN4(
                        @Param(value = "id") Long id,
                        @Param(value = "n4") Integer n4);
}
