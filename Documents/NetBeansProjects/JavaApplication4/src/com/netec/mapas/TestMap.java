/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.mapas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Java
 */
public class TestMap {
    public static void main(String[] args) {
    Map<Integer,String> mapa = new HashMap<Integer,String>();
        mapa.put(1,"ID");
        mapa.put(2,"NOMBRE");
        mapa.put(3,"EDAD");
        System.out.println("Tamaño"+mapa.size());
        for (Map.Entry<Integer, String> e : mapa.entrySet()) {
            System.out.println("Llave:"+e.getKey()+"\tValor:"+e.getValue());
        }
    }
}
