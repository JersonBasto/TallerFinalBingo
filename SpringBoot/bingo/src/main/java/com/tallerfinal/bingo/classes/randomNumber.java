package com.tallerfinal.bingo.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class randomNumber {
    public List<Integer> random(Integer min,Integer max){
        List<Integer> matriz = new ArrayList<>();
        List<Integer> random = new ArrayList<>();
        for(int x=min;x<=max;x++){
            matriz.add(x);
        }
        Collections.shuffle(matriz);
        for(int x=0; x<5;x++){
            random.add(matriz.get(x));
        }
        return random;
    }
}
