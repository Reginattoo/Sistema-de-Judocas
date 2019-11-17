/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;

import java.util.Date;
import org.fpij.jitakyoei.util.CorFaixa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31753477
 */
public class FaixaTest {
    
    public FaixaTest() {
    }
    

    /**
     * Test of getCor method, of class Faixa.
     */
    @Test
    public void testGetCor() {
        System.out.println("getCor");
        Faixa instance = new Faixa();
        CorFaixa expResult = null;
        CorFaixa result = instance.getCor();
        assertEquals(expResult, "azul");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCor method, of class Faixa.
     */
    @Test
    public void testSetCor() {
        System.out.println("setCor");
        CorFaixa cor = null;
        Faixa instance = new Faixa();
        instance.setCor(cor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataEntrega method, of class Faixa.
     */
    @Test
    public void testGetDataEntrega() {
        System.out.println("getDataEntrega");
        Faixa instance = new Faixa();
        Date expResult = null;
        Date result = instance.getDataEntrega();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataEntrega method, of class Faixa.
     */
    @Test
    public void testSetDataEntrega() {
        System.out.println("setDataEntrega");
        Date dataEntrega = null;
        Faixa instance = new Faixa();
        instance.setDataEntrega(dataEntrega);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Faixa.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Faixa instance = new Faixa();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}