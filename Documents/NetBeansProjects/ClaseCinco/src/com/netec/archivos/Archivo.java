package com.netec.archivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Java\\miArchivo.txt");
        try{
            if (!file.exists()) {
                if(file.createNewFile()){
                    System.out.println("El archivo se creao Correctamente!!");
                }else{
                    System.out.println("No se pudo creaar.");            
                }
            } else {
                System.out.println("Ya esta creado!!");
            }

            FileWriter fw = new FileWriter(file);
            fw.flush();
            fw.close();

            FileReader fr = new FileReader(file);
            fr.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        

    }
    
    
}
