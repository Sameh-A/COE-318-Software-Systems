/**
 *
 * @author Sameh Ahmed
 */
package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sameh
 */
public class DCVoltageSourceTest {
    
    public DCVoltageSourceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNodes method, of class DCVoltageSource.
     */
    @Test
    public void testGetNodes() {
        System.out.println("getNodes");
        DCVoltageSource instance = null;
        Node[] expResult = null;
        Node[] result = instance.getNodes();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class DCVoltageSource.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DCVoltageSource instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
