/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Java
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        try{
            int a=5;
            int b=0; //0;
            int division = a/b; //Exception in thread "main" java.lang.ArithmeticException: / by zero
            
            String[] nombres ={"PepeLalo","Angelo","Ruso"};
            for (int i = 0; i <=3 ; i++) {
                System.out.println("nombres:"+nombres[i]);
            }
        
        }catch(ArithmeticException | IndexOutOfBoundsException ex){ //Mutlticatch para java7 en adelante
            if(ex instanceof RuntimeException ){
                System.out.println("RuntimeException");
                ex.printStackTrace();
            }else {
                    ex.printStackTrace();
            }
        
        /*}catch(ArithmeticException e){
            e.printStackTrace();
            //System.out.println(e.getMessage());
            System.out.println("Programa Fallo.");
        }catch(IndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Programa Fallo.");
        }catch(Exception e){ // Tiene mas precedencia.
            e.printStackTrace();
            System.out.println("Exception inesperada.");
        */
        }finally{ // Siempre se ejecuta idependiente de las exceptiones , maxima precedencia 
            System.out.println("Bloque Finally.");
            System.out.println("Recursos Cerrados.");
        }
        System.out.println("Continua flujo de programa.");
    }
    
}
