/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.peracion;

/**
 *
 * @author Java
 */
import com.netec.operaciones.Operaciones;
import org.junit.Assert;
import org.junit.Test;
public class TestOp {

@Test    
    public void TestSuma() {
        Operaciones op = new Operaciones();
        int resultado=op.sumar(5, 4);
        Assert.assertEquals(9, resultado);
    }

@Test
    public void TestResta() {
        Operaciones op = new Operaciones();
        int resultado=op.restar(5, 4);
        Assert.assertEquals(9, resultado);
    }
    
}
