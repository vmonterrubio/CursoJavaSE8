/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.statictest;

import com.netec.util.Herramientas;
import java.util.Date;

/**
 *
 * @author Java
 */
public class TestStatic {
    
    public static Boolean[] switches = new Boolean[5];
    
    // Bloques  estatico anonimos
    static {
        System.out.println(" ... Metodo estatico antes que man()..");
        for(int i=0; i < 5; i++){
            switches[i] = true;
        }
    }
    
    public static void main(String[] args) {
        Herramientas herr = new Herramientas();
        Date fecha = herr.getFecha("09/08/2017");
        System.out.println("Fecha Hoy:"+fecha);
        System.out.println("Fecha Hoy metodo estatico :"+Herramientas.getFechaStatic("09/08/2017"));
        switches[1]=false; //si se permite porque la variable es estatica en la clase 
        switches[4]=false;
        int i=0;
        for (Boolean swt:switches) {
            System.out.println("Switches["+i+"]="+swt);
            i++;
        }
    }
}
