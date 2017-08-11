/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.lamdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Java
 */
public class OrdenarSinLamda {
    public static void main(String[] args) {
        List<Persona> clientes = new ArrayList<Persona>();
        clientes.add(new Persona("Pepe"));
        clientes.add(new Persona("Zuri"));
        clientes.add(new Persona("Mike"));
        clientes.add(new Persona("Tory"));
        clientes.add(new Persona("Raul"));
        /*
        Collections.sort(clientes,
            new Comparator<Persona>(){
            @Override
                public int compare(Persona p1,Persona p2){
                    return p1.nombre.compareTo(p2.nombre);
                }
            }
        );
        */
         Collections.sort(clientes, (Persona p1, Persona p2) -> p1.nombre.compareTo(p2.nombre));
       
        
        for (Persona cliente : clientes) {
            System.out.println(cliente);
        }
    }
        
    }
}
