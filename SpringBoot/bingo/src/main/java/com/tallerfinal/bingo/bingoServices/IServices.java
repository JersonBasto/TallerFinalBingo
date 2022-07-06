package com.tallerfinal.bingo.bingoServices;

import java.util.List;
import java.util.Optional;

import com.tallerfinal.bingo.domain.bingoD;
import com.tallerfinal.bingo.domain.filebD;
import com.tallerfinal.bingo.domain.filegD;
import com.tallerfinal.bingo.domain.fileiD;
import com.tallerfinal.bingo.domain.filenD;
import com.tallerfinal.bingo.domain.fileoD;
/**
 * Interface para el servicio Bingo
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */

public interface IServices {
    /**
     * Crea una lista de bingo
     * 
     * @return Una lista de todos los bingos en la base de datos
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    public List<bingoD> list();
    /***
     * Crear bingo
     * 
     * @param bingo Recibe un objeto de clase bingoD.
     * @return Un objeto de la clase bingoD
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    public bingoD createBingo(bingoD bingo);
    /***
     * Crea la fila B del bingo
     * 
     * @param fileB Recibe un objeto de la clase filebD
     * @return Un objeto de la clase filebD
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    public filebD createFileB(filebD fileB);
    /***
     * Crea la fila I del bingo
     * 
     * @param fileI Recibe un objeto de la clase fileiD
     * @return Un objeto de la clase fileiD
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    public fileiD createFileI(fileiD fileI);
    /***
     * Crea la fila N del bingo
     * 
     * @param fileN Recibe un objeto de la clase filenD
     * @return Un objeto de la clase filenD
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    public filenD createFileN(filenD fileN);
    /***
     * Crea la fila G del bingo
     * 
     * @param fileG Recibe un objeto de la clase filegD
     * @return Un objeto de la clase filegD
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    public filegD createFileG(filegD fileG);
    /***
     * Crea la fila O del bingo
     * 
     * @param fileO Recibe un objeto de la clase fileoD
     * @return Un objeto de la clase fileoD
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    public fileoD createFileO(fileoD fileO);
    /**
     * Busca un bingo por el id
     * 
     * @param id Identificador del bingo
     * @return un objeto de la clase bingoD
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    public Optional<bingoD> findBingo(Long id);
}
