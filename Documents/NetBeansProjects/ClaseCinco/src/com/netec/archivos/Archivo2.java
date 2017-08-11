/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Java
 */
public class Archivo2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Java\\miArchivo.txt");
        
        try {
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(file);
            pw.println("Producto: Lavadora.");
            pw.println("Precio: 1000.00");
            pw.flush();
            pw.close();
            
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String l1 = br.readLine();
            String l2 = br.readLine();
            System.out.println(l1);
            System.out.println(l2);
// ServiceMix.
        } catch (IOException ex) {
            Logger.getLogger(Archivo2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
