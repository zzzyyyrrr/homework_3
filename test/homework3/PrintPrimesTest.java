package homework3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrintPrimesTest {
    
    private PrintPrimes pptest;

    @Before
    public void setUp() throws Exception {
        pptest = new PrintPrimes();
    }

    @Test
    public void testPrintPrimes() {
        pptest.printPrimes(5);
        
    }
}
