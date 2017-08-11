package bean;
 
public class Abc {
 public static int index_val = 10;
}
 
package com;
import static bean.Abc.index_val;
 
public class Test1 {
    
    public static void main(String... args) {
             System.out.println(index_val);
    }
}