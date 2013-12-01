/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import modelo.Divisa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class MultiplicacionTest {

    public MultiplicacionTest() {
    }

    @Test
    public void testMultiplication() {
        assertEquals("Multiplication", 6, 3 * 2);
    }

    @Test
    public void testSumar() throws Exception {
        System.out.println("sumar");
        
        Divisa d = new Divisa(10, "Soles");
        Divisa instance = new Divisa(20, "Soles");
        Divisa expResult = new Divisa(30, "Soles");
        
        Divisa result = instance.sumar(d);
        
        assertEquals(expResult.getImporte(), result.getImporte());
    }
}