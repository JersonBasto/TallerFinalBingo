package com.tallerfinal.bingo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tallerfinal.bingo.bingoServices.Services;
import com.tallerfinal.bingo.domain.bingoD;
import com.tallerfinal.bingo.domain.filebD;
import com.tallerfinal.bingo.domain.filegD;
import com.tallerfinal.bingo.domain.fileiD;
import com.tallerfinal.bingo.domain.filenD;
import com.tallerfinal.bingo.domain.fileoD;

/**
 * Controlador de bingo
 * 
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */
@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE,
        RequestMethod.PATCH })
public class bingoC {
    /**
     * Se inserta los servicios
     */
    @Autowired
    private Services Services;

    /**
     * Envia mensaje de bienvenida
     * 
     * @return Retorna un String de Bienvenida
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @GetMapping(path = "/")
    public String welcome() {
        return "Bienvenido al BackEnd Spring Boot de bingo";
    }

    /**
     * Obtiene una lista de todos los bingos que se encuentrane en la base de datos
     * 
     * @return Una lista de objetos de la clase bingoD
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @GetMapping(path = "/bingos")
    public List<bingoD> list() {
        var bingos = Services.list();
        return bingos;
    }

    /**
     * Crea un tarjeton de bingo, con las filas aletorias
     * 
     * @param bingo Recibe un objeto de la clase bingoD con el paramentro idSocket
     * @return Un objeto de la clase bingoD
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @PostMapping(path = "/createBingo")
    public ResponseEntity<bingoD> createBingo(@RequestBody bingoD bingo) {
        System.out.println(bingo);
        Services.createBingo(bingo);
        filebD fileB = new filebD();
        fileiD fileI = new fileiD();
        filenD fileN = new filenD();
        filegD fileG = new filegD();
        fileoD fileO = new fileoD();
        fileB.setBingo(bingo);
        fileI.setBingo(bingo);
        fileN.setBingo(bingo);
        fileG.setBingo(bingo);
        fileO.setBingo(bingo);
        Services.createFileB(fileB);
        Services.createFileI(fileI);
        Services.createFileN(fileN);
        Services.createFileG(fileG);
        Services.createFileO(fileO);
        List<Integer> randomNumbersB = new ArrayList<>();
        for (int x = 0; x < 5; x++) {
            while (randomNumbersB.size() < 5) {
                int b0 = (int) (Math.random() * 15 + 1);
                if (!randomNumbersB.contains(b0)) {
                    randomNumbersB.add(b0);
                }
            }
        }
        Services.updateB0(fileB.getId(), randomNumbersB.get(0));
        Services.updateB1(fileB.getId(), randomNumbersB.get(1));
        Services.updateB2(fileB.getId(), randomNumbersB.get(2));
        Services.updateB3(fileB.getId(), randomNumbersB.get(3));
        Services.updateB4(fileB.getId(), randomNumbersB.get(4));

        List<Integer> randomNumbersI = new ArrayList<>();
        for (int x = 0; x < 5; x++) {
            while (randomNumbersI.size() < 5) {
                int b0 = (int) (Math.random() * (30 - 15 + 1) + 15);
                if (!randomNumbersI.contains(b0)) {
                    randomNumbersI.add(b0);
                }
            }
        }
        Services.updateI0(fileI.getId(), randomNumbersI.get(0));
        Services.updateI1(fileI.getId(), randomNumbersI.get(1));
        Services.updateI2(fileI.getId(), randomNumbersI.get(2));
        Services.updateI3(fileI.getId(), randomNumbersI.get(3));
        Services.updateI4(fileI.getId(), randomNumbersI.get(4));

        List<Integer> randomNumbersN = new ArrayList<>();
        for (int x = 0; x < 5; x++) {
            while (randomNumbersN.size() < 5) {
                int b0 = (int) (Math.random() * (45 - 31 + 1) + 31);
                if (!randomNumbersN.contains(b0)) {
                    randomNumbersN.add(b0);
                }
            }
        }
        Services.updateN0(fileN.getId(), randomNumbersN.get(0));
        Services.updateN1(fileN.getId(), randomNumbersN.get(1));
        Services.updateN3(fileN.getId(), randomNumbersN.get(2));
        Services.updateN4(fileN.getId(), randomNumbersN.get(3));

        List<Integer> randomNumberG = new ArrayList<>();
        for (int x = 0; x < 5; x++) {
            while (randomNumberG.size() < 5) {
                int b0 = (int) (Math.random() * (60 - 46 + 1) + 46);
                if (!randomNumberG.contains(b0)) {
                    randomNumberG.add(b0);
                }
            }
        }
        Services.updateG0(fileG.getId(), randomNumberG.get(0));
        Services.updateG1(fileG.getId(), randomNumberG.get(1));
        Services.updateG2(fileG.getId(), randomNumberG.get(2));
        Services.updateG3(fileG.getId(), randomNumberG.get(3));
        Services.updateG4(fileG.getId(), randomNumberG.get(4));

        List<Integer> randomNumbersO = new ArrayList<>();
        for (int x = 0; x < 5; x++) {
            while (randomNumbersO.size() < 5) {
                int b0 = (int) (Math.random() * (75 - 61 + 1) + 61);
                if (!randomNumbersO.contains(b0)) {
                    randomNumbersO.add(b0);
                }
            }
        }
        Services.updateO0(fileO.getId(), randomNumbersO.get(0));
        Services.updateO1(fileO.getId(), randomNumbersO.get(1));
        Services.updateO2(fileO.getId(), randomNumbersO.get(2));
        Services.updateO3(fileO.getId(), randomNumbersO.get(3));
        Services.updateO4(fileO.getId(), randomNumbersO.get(4));

        System.out.println(bingo);

        return new ResponseEntity<>(bingo, HttpStatus.OK);
    }

    /**
     * Encuentra el bingo por id
     * 
     * @param id Recibe el id del bingo a biscar
     * @return Un objeto de la clase bingoD
     * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
     */
    @GetMapping(path = "/getbingo/{id}")
    public Optional<bingoD> bingoById(@PathVariable("id") Long id) {
        var bingoId = Services.findBingo(id);
        return bingoId;
    }

    /***
     * Comparacion entre el bingo de FrontEnd y BackEnd para determinar si gano o no
     * 
     * @param bingo Recibe un bingo que se obtiene desde el FrontEnd para realizar
     *              la comparacion con el bingo de la base de datos
     * @param id    Id del bingo a buscar
     * @return Booleano que determina si la persona gano o no le BINGO
     */
    @PostMapping(path = "/newBingo/{id}")
    public Boolean newBingo(@RequestBody bingoD bingo, @PathVariable("id") Long id) {
        var bingoId = Services.findBingo(id);
        System.out.println(bingoId.get().getFilaB().get(0).getB0());
        System.out.println(bingo.getFilaB().get(0).getB0());
        Boolean str = false;
        if (bingoId.get().getFilaB().get(0).getB0() == bingo.getFilaB().get(0).getB0()) {
            if (bingoId.get().getFilaI().get(0).getI1() == bingo.getFilaI().get(0).getI1()) {
                if (bingoId.get().getFilaG().get(0).getG3() == bingo.getFilaG().get(0).getG3()) {
                    if (bingoId.get().getFilaO().get(0).getO4() == bingo.getFilaO().get(0).getO4()) {
                        str = true;
                    }
                }
            }
        }
        if (bingoId.get().getFilaB().get(0).getB4() == bingo.getFilaB().get(0).getB4()) {
            if (bingoId.get().getFilaI().get(0).getI3() == bingo.getFilaI().get(0).getI3()) {
                if (bingoId.get().getFilaG().get(0).getG1() == bingo.getFilaG().get(0).getG1()) {
                    if (bingoId.get().getFilaO().get(0).getO0() == bingo.getFilaO().get(0).getO0()) {
                        str = true;
                    }
                }
            }
        }
        if (bingoId.get().getFilaB().get(0).getB4() == bingo.getFilaB().get(0).getB4()) {
            if (bingoId.get().getFilaB().get(0).getB3() == bingo.getFilaB().get(0).getB3()) {
                if (bingoId.get().getFilaB().get(0).getB2() == bingo.getFilaB().get(0).getB2()) {
                    if (bingoId.get().getFilaB().get(0).getB1() == bingo.getFilaB().get(0).getB1()) {
                        if (bingoId.get().getFilaB().get(0).getB0() == bingo.getFilaB().get(0).getB0()) {
                            str = true;
                        }
                    }
                }
            }
        }
        if (bingoId.get().getFilaI().get(0).getI4() == bingo.getFilaI().get(0).getI4()) {
            if (bingoId.get().getFilaI().get(0).getI3() == bingo.getFilaI().get(0).getI3()) {
                if (bingoId.get().getFilaI().get(0).getI2() == bingo.getFilaI().get(0).getI2()) {
                    if (bingoId.get().getFilaI().get(0).getI1() == bingo.getFilaI().get(0).getI1()) {
                        if (bingoId.get().getFilaI().get(0).getI0() == bingo.getFilaI().get(0).getI0()) {
                            str = true;
                        }
                    }
                }
            }
        }
        if (bingoId.get().getFilaN().get(0).getN4() == bingo.getFilaN().get(0).getN4()) {
            if (bingoId.get().getFilaN().get(0).getN3() == bingo.getFilaN().get(0).getN3()) {
                if (bingoId.get().getFilaN().get(0).getN1() == bingo.getFilaN().get(0).getN1()) {
                    if (bingoId.get().getFilaN().get(0).getN0() == bingo.getFilaN().get(0).getN0()) {
                        str = true;
                    }
                }
            }
        }
        if (bingoId.get().getFilaO().get(0).getO4() == bingo.getFilaO().get(0).getO4()) {
            if (bingoId.get().getFilaO().get(0).getO3() == bingo.getFilaO().get(0).getO3()) {
                if (bingoId.get().getFilaO().get(0).getO2() == bingo.getFilaO().get(0).getO2()) {
                    if (bingoId.get().getFilaO().get(0).getO1() == bingo.getFilaO().get(0).getO1()) {
                        if (bingoId.get().getFilaO().get(0).getO0() == bingo.getFilaO().get(0).getO0()) {
                            str = true;
                        }
                    }
                }
            }
        }
        if (bingoId.get().getFilaG().get(0).getG4() == bingo.getFilaG().get(0).getG4()) {
            if (bingoId.get().getFilaG().get(0).getG3() == bingo.getFilaG().get(0).getG3()) {
                if (bingoId.get().getFilaG().get(0).getG2() == bingo.getFilaG().get(0).getG2()) {
                    if (bingoId.get().getFilaG().get(0).getG1() == bingo.getFilaG().get(0).getG1()) {
                        if (bingoId.get().getFilaG().get(0).getG0() == bingo.getFilaG().get(0).getG0()) {
                            str = true;
                        }
                    }
                }
            }
        }
        return str;
    }
}
