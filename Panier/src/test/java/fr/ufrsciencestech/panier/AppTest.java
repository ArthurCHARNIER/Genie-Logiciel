package fr.ufrsciencestech.panier;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        PanierTest pt = new PanierTest();
        pt.setUp();
        
        pt.testAjouter();
        pt.testEstPlein();
        pt.testEstVide();
        pt.testGetPrix();
    }
}
