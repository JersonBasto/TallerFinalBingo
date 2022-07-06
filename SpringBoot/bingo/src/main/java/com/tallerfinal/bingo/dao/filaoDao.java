package com.tallerfinal.bingo.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tallerfinal.bingo.domain.fileoD;

/**
 * Se coloca la clase con la tabla que se va a manejar
 * 
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */

public interface filaoDao extends CrudRepository<fileoD, Long> {
    /**
     * Se actualiza para actualiza la posicion O0 con un numero aleatorio
     * 
     * @param id Id de la tabla FilaO a actualizar
     * @param o0 Posicion O0 del bingo
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Modifying
    @Query("update fileoD filao set filao.o0=:o0 where filao.id=:id")
    public void updateO0(@Param(value = "id") Long id, @Param(value = "o0") Integer o0);

    /**
     * Se actualiza para actualiza la posicion O1 con un numero aleatorio
     * 
     * @param id Id de la tabla FilaO a actualizar
     * @param o1 Posicion O1 del bingo
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */

    @Modifying
    @Query("update fileoD filao set filao.o1=:o1 where filao.id=:id")
    public void updateO1(@Param(value = "id") Long id, @Param(value = "o1") Integer o1);

    /**
     * Se actualiza para actualiza la posicion O2 con un numero aleatorio
     * 
     * @param id Id de la tabla FilaO a actualizar
     * @param o2 Posicion O2 del bingo
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */

    @Modifying
    @Query("update fileoD filao set filao.o2=:o2 where filao.id=:id")
    public void updateO2(@Param(value = "id") Long id, @Param(value = "o2") Integer o2);

    /**
     * Se actualiza para actualiza la posicion O3 con un numero aleatorio
     * 
     * @param id Id de la tabla FilaO a actualizar
     * @param o3 Posicion O3 del bingo
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */

    @Modifying
    @Query("update fileoD filao set filao.o3=:o3 where filao.id=:id")
    public void updateO3(@Param(value = "id") Long id, @Param(value = "o3") Integer o3);

    /**
     * Se actualiza para actualiza la posicion O4 con un numero aleatorio
     * 
     * @param id Id de la tabla FilaO a actualizar
     * @param o4 Posicion O4 del bingo
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */

    @Modifying
    @Query("update fileoD filao set filao.o4=:o4 where filao.id=:id")
    public void updateO4(@Param(value = "id") Long id, @Param(value = "o4") Integer o4);
}
