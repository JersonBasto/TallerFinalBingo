package com.tallerfinal.bingo.bingoServices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tallerfinal.bingo.dao.bingoDao;
import com.tallerfinal.bingo.dao.filaGDao;
import com.tallerfinal.bingo.dao.filaIDao;
import com.tallerfinal.bingo.dao.filaNDao;
import com.tallerfinal.bingo.dao.filaoDao;
import com.tallerfinal.bingo.dao.fileBDao;
import com.tallerfinal.bingo.domain.bingoD;
import com.tallerfinal.bingo.domain.filebD;
import com.tallerfinal.bingo.domain.filegD;
import com.tallerfinal.bingo.domain.fileiD;
import com.tallerfinal.bingo.domain.filenD;
import com.tallerfinal.bingo.domain.fileoD;

@Service
public class Services implements IServices {

    /**
     * Se inyecta el repositorio del bingo
     * 
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */

    @Autowired
    private bingoDao bingoDao;

    /**
     * Se inyecta el repositorio del Fila B
     * 
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */

    @Autowired
    private fileBDao fileBDao;

    /**
     * Se inyecta el repositorio del Fila I
     * 
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */

    @Autowired
    private filaIDao filaIDao;
    /**
     * Se inyecta el repositorio del Fila N
     * 
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */

    @Autowired
    private filaNDao filaNDao;
    /**
     * Se inyecta el repositorio del Fila G
     * 
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */

    @Autowired
    private filaGDao filaGDao;
    /**
     * Se inyecta el repositorio del Fila O
     * 
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */

    @Autowired
    private filaoDao filaoDao;

    /**
     * Devuelva una lista con lso bingos
     * 
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Override
    @Transactional(readOnly = true)
    public List<bingoD> list() {
        return (List<bingoD>) bingoDao.findAll();
    }

    /**
     * Crea el bingo
     * 
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Override
    @Transactional
    public bingoD createBingo(bingoD bingo) {
        return bingoDao.save(bingo);
    }

    /**
     * Crea la Fila B
     * 
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */

    @Override
    @Transactional
    public filebD createFileB(filebD fileB) {
        return fileBDao.save(fileB);
    }

    /**
     * Crea la Fila I
     * 
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Override
    @Transactional
    public fileiD createFileI(fileiD fileB) {
        return filaIDao.save(fileB);
    }

    /**
     * Crea la Fila N
     * 
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Override
    @Transactional
    public filenD createFileN(filenD fileB) {
        return filaNDao.save(fileB);
    }

    /**
     * Crea la Fila G
     * 
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Override
    @Transactional
    public filegD createFileG(filegD fileB) {
        return filaGDao.save(fileB);
    }

    /**
     * Crea la Fila O
     * 
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Override
    @Transactional
    public fileoD createFileO(fileoD fileB) {
        return filaoDao.save(fileB);
    }

    /**
     * Reemplazo del valor b0
     * 
     * @param id Id de la tabla Fila B
     * @param b0 valor de B0 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateB0(Long id, Integer b0) {
        fileBDao.updateB0(id, b0);
    }

    /**
     * Reemplazo del valor b1
     * 
     * @param id Id de la tabla Fila B
     * @param b0 valor de B1 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateB1(Long id, Integer b0) {
        fileBDao.updateB1(id, b0);
    }

    /**
     * Reemplazo del valor b2
     * 
     * @param id Id de la tabla Fila B
     * @param b0 valor de B2 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateB2(Long id, Integer b0) {
        fileBDao.updateB2(id, b0);
    }

    /**
     * Reemplazo del valor b3
     * 
     * @param id Id de la tabla Fila B
     * @param b0 valor de B3 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateB3(Long id, Integer b0) {
        fileBDao.updateB3(id, b0);
    }

    /**
     * Reemplazo del valor b4
     * 
     * @param id Id de la tabla Fila B
     * @param b0 valor de B4 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateB4(Long id, Integer b0) {
        fileBDao.updateB4(id, b0);
    }

    /**
     * Reemplazo del valor i0
     * 
     * @param id Id de la tabla Fila I
     * @param i0 valor de I0 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateI0(Long id, Integer i0) {
        filaIDao.updateI0(id, i0);
    }

    /**
     * Reemplazo del valor i1
     * 
     * @param id Id de la tabla Fila I
     * @param i1 valor de I1 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateI1(Long id, Integer i1) {
        filaIDao.updateI1(id, i1);
    }

    /**
     * Reemplazo del valor i2
     * 
     * @param id Id de la tabla Fila I
     * @param i2 valor de I2 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateI2(Long id, Integer i2) {
        filaIDao.updateI2(id, i2);
    }

    /**
     * Reemplazo del valor i3
     * 
     * @param id Id de la tabla Fila I
     * @param i3 valor de I3 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateI3(Long id, Integer i3) {
        filaIDao.updateI3(id, i3);
    }

    /**
     * Reemplazo del valor i4
     * 
     * @param id Id de la tabla Fila I
     * @param i4 valor de I4 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateI4(Long id, Integer i4) {
        filaIDao.updateI4(id, i4);
    }

    /**
     * Reemplazo del valor n0
     * 
     * @param id Id de la tabla Fila N
     * @param n0 valor de N0 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateN0(Long id, Integer n0) {
        filaNDao.updateN0(id, n0);
    }

    /**
     * Reemplazo del valor n1
     * 
     * @param id Id de la tabla Fila N
     * @param n1 valor de N1 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateN1(Long id, Integer n1) {
        filaNDao.updateN1(id, n1);
    }

    /**
     * Reemplazo del valor n3
     * 
     * @param id Id de la tabla Fila N
     * @param n3 valor de N3 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */

    @Transactional
    public void updateN3(Long id, Integer n3) {
        filaNDao.updateN3(id, n3);
    }

    /**
     * Reemplazo del valor n4
     * 
     * @param id Id de la tabla Fila N
     * @param n4 valor de N4 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateN4(Long id, Integer n4) {
        filaNDao.updateN4(id, n4);
    }

    /**
     * Reemplazo del valor g0
     * 
     * @param id Id de la tabla Fila G
     * @param g0 valor de G0 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateG0(Long id, Integer g0) {
        filaGDao.updateG0(id, g0);
    }

    /**
     * Reemplazo del valor g1
     * 
     * @param id Id de la tabla Fila G
     * @param g1 valor de G1 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateG1(Long id, Integer g1) {
        filaGDao.updateG1(id, g1);
    }

    /**
     * Reemplazo del valor g2
     * 
     * @param id Id de la tabla Fila G
     * @param g2 valor de G2 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateG2(Long id, Integer g2) {
        filaGDao.updateG2(id, g2);
    }

    /**
     * Reemplazo del valor g3
     * 
     * @param id Id de la tabla Fila G
     * @param g3 valor de G3 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateG3(Long id, Integer g3) {
        filaGDao.updateG3(id, g3);
    }

    /**
     * Reemplazo del valor g4
     * 
     * @param id Id de la tabla Fila G
     * @param g0 valor de G4 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateG4(Long id, Integer g4) {
        filaGDao.updateG4(id, g4);
    }

    /**
     * Reemplazo del valor o1
     * 
     * @param id Id de la tabla Fila O
     * @param g0 valor de O1 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @Transactional
    public void updateO1(Long id, Integer g0) {
        filaoDao.updateO1(id, g0);
    }

    /**
     * Reemplazo del valor o2
     * 
     * @param id Id de la tabla Fila O
     * @param g0 valor de O2 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */

    @Transactional
    public void updateO2(Long id, Integer g0) {
        filaoDao.updateO2(id, g0);
    }

    /**
     * Reemplazo del valor o3
     * 
     * @param id Id de la tabla Fila O
     * @param g0 valor de O3 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */

    @Transactional
    public void updateO3(Long id, Integer g0) {
        filaoDao.updateO3(id, g0);
    }

    /**
     * Reemplazo del valor o4
     * 
     * @param id Id de la tabla Fila O
     * @param g0 valor de O4 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */

    @Transactional
    public void updateO4(Long id, Integer g0) {
        filaoDao.updateO4(id, g0);
    }

    /**
     * Reemplazo del valor o0
     * 
     * @param id Id de la tabla Fila O
     * @param g0 valor de O0 a usar
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */

    @Transactional
    public void updateO0(Long id, Integer g0) {
        filaoDao.updateO0(id, g0);
    }
    /**
     * Encuentra el bingo por id
     * 
     * @param id Recibe el id para buscar el bingo
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     * @retunr Retorna un objeto de clase bingoD
     */
    @Transactional
    public Optional<bingoD> findBingo(Long id) {
        Optional<bingoD> bingof = bingoDao.findById(id);
        return bingof;
    }
}
