package exemplo_maven.megacena;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testNumero(){
    	assertTrue( App.getNumero() <= 60);
    }
    
    public void testJogo(){
    	assertTrue(App.getJogo().length == 6);
    }
}
