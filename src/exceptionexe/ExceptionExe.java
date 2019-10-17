/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexe;

import com.exception.InvalidAgeException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bella
 */
public class ExceptionExe {

    public void testAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Invalid Age");
        }
        else{
            System.out.println("Allowed to vote");
        }
        
    }
    public static void main(String[] args) {
        
        try {
            new ExceptionExe().testAge(12);
            
        } catch (InvalidAgeException ex) {
            System.out.println("Can not vote : "+ex); 
            ex.printStackTrace();
        }
        
    }
    
}
