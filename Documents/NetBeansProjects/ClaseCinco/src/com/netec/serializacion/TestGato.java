/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.serializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Java
 */
public class TestGato {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Benito","Angora");

        Gato gato2 = new Gato("DonGato","Callejero");
        
        File file = new File("C:\\Users\\Java\\testSer.txt");
        try {
            FileOutputStream fs = new FileOutputStream(file);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(gato1);
            os.writeObject(gato2);
            os.close();
            
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Gato g = (Gato) ois.readObject();
            System.out.println(g);
            g = (Gato) ois.readObject();
            System.out.println(g);            
            ois.close();
            
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(TestGato.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    private static FileOutputStream FileOutputStream(String testSerser) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
