/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexe;

import com.exception.InvalidAgeException;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Bella
 */
public class ExceptionExeNGTest {
    
    public ExceptionExeNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(expectedExceptions = InvalidAgeException.class)
    public void testTestAge() throws InvalidAgeException {
        new ExceptionExe().testAge(10);
        
    }

    @Test
    public void testMain() {
    }
    
}
