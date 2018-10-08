/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import static org.mockito.Mockito.*;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ac532323
 */
public class PanierTest {

    private Panier pVide, p1, p2, pPlein;
    private Orange omock1, omock2, o1, o2, o3;

    public PanierTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pVide = new Panier(4);
        p1 = new Panier(4);
        p2 = new Panier(4);
        pPlein = new Panier(4);

        omock1 = omock2 = mock(Orange.class);
        o1 = new Orange("France", 0.2);
        o2 = new Orange("Espagne", 0.25);

        when(omock1.getPrix()).thenReturn(1.0);
        when(omock2.getPrix()).thenReturn(0.5);

        p1.ajouter(omock1);

        pPlein.ajouter(omock1);
        pPlein.ajouter(omock1);
        pPlein.ajouter(omock2);
        pPlein.ajouter(omock2);

        p2.ajouter(omock1);
        p2.ajouter(omock2);

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    @Test
    public void testEstPlein() {
        System.out.println("estPlein");
        boolean expResult = true;
        boolean result = pPlein.estPlein();
        assertEquals(expResult, result);
    }

    /**
     * Test of estVide method, of class Panier.
     */
    @Test
    public void testEstVide() {
        System.out.println("estVide");
        boolean expResult = true;
        boolean result = pVide.estVide();
        assertEquals(expResult, result);
    }


    /**
     * Test of ajouter method, of class Panier.
     */
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        p1.ajouter(o1);
        assertTrue(p1.getSacoche().size()== 2);
    }

    /**
     * Test of retire method, of class Panier.
     */
    /*@Test
    public void testRetire() {
        System.out.println("retire");
        Panier instance = null;
        instance.retire();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getPrix method, of class Panier.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        double expResult = 1.5;
        double result = p2.getPrix();
        assertTrue(p2.getSacoche().size()==2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of boycottOrigine method, of class Panier.
     */
    /*@Test
    public void testBoycottOrigine() {
        System.out.println("boycottOrigine");
        String origine = "";
        Panier instance = null;
        instance.boycottOrigine(origine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of equals method, of class Panier.
     
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Panier instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

}
