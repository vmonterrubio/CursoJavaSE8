/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.netec.operaciones.Operaciones;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Java
 */
public class testOperaciones {
@Test    
    public void testOperaciones() {
        Operaciones op = new Operaciones();
        int resultado=op.sumar(5, 4);
        Assert.assertEquals(10, resultado);
    }
    
    // @Test
    // public void hello() {}
}
