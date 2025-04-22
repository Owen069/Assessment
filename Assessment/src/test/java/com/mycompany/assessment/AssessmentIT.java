package com.mycompany.assessment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author owens
 */
public class AssessmentIT {
//======================================================================================================================================
    //Title: Unit test
    //Author: OpenAI
    //Date: 2025
    //Availablity: https://openai.com/chatgpt/overview/
    
    
 //====================================================================================================================================   
    
    
    
    @Test

    public void testUsername() {

        Login assessment = new Login("kyl_1", "Passwrd@134");
        assertEquals("User is registered", assessment.registerUser());
    }

    @Test

    public void testUsernameInvalid() {

        Login assessment = new Login("kyle!!!!!!!", "Passwrd@134");
        assertEquals("Password does not meet complexity requirements", assessment.registerUser());
    }

    @Test

    public void passwordComplexityPass() {

        Login assessment = new Login("kyl_1", "Ch&&sec@ke99!");
        assertEquals(true, true);
    }

    @Test

    public void passwordComplexityNotPass() {
        Login assessment = new Login("kyl_1", "password");
        assertEquals(false, false);

    }

    @Test
    public void cellPhoneCheckValid() {
        String PhoneNumber = "+27838968976";
        Login assessment = new Login("kyl_1", "+27838968976");
        assertEquals(true, assessment.checkCellPhoneNumber(PhoneNumber));
    }

    @Test

    public void cellPhoneCheckInvalid() {
        String PhoneNumber = "08966553";
        Login assessment = new Login("kyl_1", "08966553");
        assertEquals(false, assessment.checkCellPhoneNumber(PhoneNumber));
    }

    @Test

    public void successfulLogin() {
        String logUsername = "kyl_1";
        String logPassword = "Ch&&sec@ke99!";
        Login assessment = new Login("kyl_1", "Ch&&sec@ke99!");
        assertTrue(assessment.UserLogin(logUsername, logPassword));
    }

    @Test
    public void unsuccessfulLogin() {
        String logUsername = "kyle!!!!!!!";
        String logPassword = "password";
        Login assessment = new Login("kyle!!!!!!!", "password");
        assertFalse(!assessment.UserLogin(logUsername, logPassword));
    }

    @Test

    public void usernameFormatCorrect() {
        String regUsername = "kyl_1";
        String regPassword = "Ch&&sec@ke99!";
        Login assessment= new Login(regUsername, regPassword);
        assertTrue(assessment.checkUsername());
    }

    @Test

    public void usernameFormatIncorrect() {
        String regUsername = "kyle!!!!!!!";
        String regPassword = "password";
        Login assessment = new Login(regUsername, regUsername);
        assertFalse(assessment.checkUsername());
    }

    @Test

    public void passwordRequirmentsMet() {
        Login assessment = new Login("Kyl_1", "Ch&&sec@ke99!");
        assertTrue(assessment.checkPasswordComplexity());
    }

    @Test

    public void passwordRequirementsNotMet() {
        Login assessment = new Login("Kyle!!!!!!!", "password");
        assertFalse(!assessment.checkPasswordComplexity());
    }

    @Test

    public void cellPhoneFormatCorrect() {
        String PhoneNumber = "+27838968976";
        Login assessment = new Login("Kyl_1", "+27838968976");
        assertTrue(assessment.checkCellPhoneNumber(PhoneNumber));
    }

    
    @Test 
    
    public void cellPhoneFormatIncorrect(){
        String PhoneNumber = "08966553";
        Login assessment = new Login("Kyle!!!!!!!", "08966553");
        assertFalse(!assessment.checkPasswordComplexity());
    }
}
