/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Java
 */
public class NewClass {
    public static void main(String[] args) {
        
    }
    
}
private public class Test {  
2.  enum Month { JAN, FEB, MAR };
3.  public static void main(String [] args) {
4.      Month m1 = Month.JAN;
5.      Month m2 = Month.JAN;
6.      Month m3 = Month.FEB;
7.      System.out.println(m1 == m2);
8.      System.out.println(m1.equals(m2));
9.      System.out.println(m1 == m3);
10.     System.out.println(m1.equals(m3));
11. }
12. }