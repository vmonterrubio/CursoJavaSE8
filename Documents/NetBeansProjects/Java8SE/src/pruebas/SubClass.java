/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Java
 */
public class SubClass extends SuperClass{
 
    public int doIt(String str, Integer... data) 
    {
        String signature = "(String, Integer[])";
        System.out.println("Overridden: " + str + " " + signature);
        return 0;
    }
    
    public static void main(String... args)
    {
        SuperClass sb = new SubClass();
        sb.doIt("hello", 3);
    }
    
}