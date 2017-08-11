/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.streams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Java
 */
public class StreamsApp {
    private List<String> lista;
    private List<String> numeros;
    
    public StreamsApp(){
        lista = new ArrayList<>();
        lista.add("Pepe");
        lista.add("Lulu");
        lista.add("Lorna");
        lista.add("Irma");
        lista.add("Zuri");
        lista.add("Toña");
    }
    
    public void filtrar(){
        lista.stream().filter(x-> x.startsWith("L")).forEach(System.out::println);
    }
    public void ordenar(){
        lista.stream().sorted((x,y)-> y.compareTo(x)).forEach(System.out::println);
    }
    public static void main(String[] args) {
        StreamsApp sapp =new StreamsApp();
        System.out.println("FILTRADO::");
        sapp.filtrar();
        
        System.out.println("\nOREDENAMIENTO::");
        
        sapp.ordenar();
    }
            
}