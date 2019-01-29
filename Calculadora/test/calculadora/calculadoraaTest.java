/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam
 */
public class calculadoraaTest {

    calculadoraa instance;

    public calculadoraaTest() {
    }

    @Before
    public void setUp() {// crea la calculadora 
        instance = new calculadoraa(20, 10);

    }

    @After
    public void tearDown() { // cuando sale lo destruye 
        instance = null;
    }

    /**
     * Test of sumar method, of class calculadoraa.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");

        int result = instance.sumar();
        assertEquals("propiedad numero", instance.numero1, 21);
        assertEquals("resultado", 30, result);
    }

    /**
     * Test of multiplicar method, of class calculadoraa.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");

        int result = instance.multiplicar();
        assertEquals("propiedad numero", instance.numero1, 20);
        assertEquals("resultado", 200, result);
    }
}
