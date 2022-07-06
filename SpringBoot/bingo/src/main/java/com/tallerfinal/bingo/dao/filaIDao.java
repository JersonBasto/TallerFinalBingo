package com.tallerfinal.bingo.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tallerfinal.bingo.domain.fileiD;

/**
 * Se coloca la clase con la tabla que se va a manejar
 * 
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */

public interface filaIDao extends CrudRepository<fileiD, Long> {
        /**
         * Se actualiza para actualiza la posicion I0 con un numero aleatorio
         * 
         * @param id Id de la tabla FilaI a actualizar
         * @param i0 Posicion I0 del bingo
         * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
         */
        @Modifying
        @Query("update fileiD filai set filai.i0=:i0 where filai.id=:id")
        public void updateI0(
                        @Param(value = "id") Long id,
                        @Param(value = "i0") Integer i0);

        /**
         * Se actualiza para actualiza la posicion I1 con un numero aleatorio
         * 
         * @param id Id de la tabla FilaI a actualizar
         * @param i1 Posicion I1 del bingo
         * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
         */
        @Modifying
        @Query("update fileiD filai set filai.i1=:i1 where filai.id=:id")
        public void updateI1(
                        @Param(value = "id") Long id,
                        @Param(value = "i1") Integer i1);
        /**
         * Se actualiza para actualiza la posicion I2 con un numero aleatorio
         * 
         * @param id Id de la tabla FilaI a actualizar
         * @param i2 Posicion I2 del bingo
         * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
         */
        @Modifying
        @Query("update fileiD filai set filai.i2=:i2 where filai.id=:id")
        public void updateI2(
                        @Param(value = "id") Long id,
                        @Param(value = "i2") Integer i2);
        /**
         * Se actualiza para actualiza la posicion I3 con un numero aleatorio
         * 
         * @param id Id de la tabla FilaI a actualizar
         * @param i1 Posicion I3 del bingo
         * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
         */
        @Modifying
        @Query("update fileiD filai set filai.i3=:i3 where filai.id=:id")
        public void updateI3(
                        @Param(value = "id") Long id,
                        @Param(value = "i3") Integer i3);
        /**
         * Se actualiza para actualiza la posicion I4 con un numero aleatorio
         * 
         * @param id Id de la tabla FilaI a actualizar
         * @param i1 Posicion I4 del bingo
         * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
         */
        @Modifying
        @Query("update fileiD filai set filai.i4=:i4 where filai.id=:id")
        public void updateI4(
                        @Param(value = "id") Long id,
                        @Param(value = "i4") Integer i4);
}
