/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 *
 * @author Java
 */
 public class test {
    public static void main(String argv[]){
List<String> names = Arrays.asList("Volha", "Ivan", "John", "Mike", "Alex");
String name = names.stream()
    .filter(s -> {
        //System.out.println("filtering " + s);
        return s.length() == 4;
    }).map(s -> {
        //System.out.println("uppercasing " + s);
        return s.toUpperCase();
    }).findFirst().get();
 
System.out.println(name);

    }      
 }
