/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.archivos;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Java
 */
public class MiDirectorio {
    public static void main(String[] args) {
        File file = new File("Venta_2017-08-10");
        File dir = new File("C:\\Users\\Java\\LineaBlanca");
        try {
            dir.mkdir();
            dir.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(MiDirectorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
