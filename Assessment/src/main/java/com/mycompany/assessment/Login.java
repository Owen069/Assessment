package com.mycompany.assessment;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author owens
 */
public class Login {

    private String regUsername;
    private String regPassword;

    //Constructor
    public Login(String regUsername, String regPassword) {
        this.regPassword = regPassword;
        this.regUsername = regUsername;

        //Methods
    }

    public boolean checkUsername() {
        //Validating Username Condition

        if (regUsername.length() <= 5 && regUsername.contains("_")) {
            return true;
          
        } else {
            return false;
        }
    }

    public boolean checkPasswordComplexity() {
        //Validating Password Password conditions wit Regex 

        final String Password = "^(?=(?:.*\\d){2,})(?=.*[A-Z])(?=.*[!@#$*%^&*_+-?|])(?=\\S+$).(8,)$";
        return regPassword.matches(regPassword);
        
//===========================================================================================================        
    //Title: Password conditions with regex
    //Author: OpenAI
    //Date: 2025
    //Availablity: https://openai.com/chatgpt/overview/
 //===========================================================================================================   
    }

    public boolean checkCellPhoneNumber(String PhoneNumber) {
        //Validating Cell phone number conditions

        if (PhoneNumber.length() != 12 && (!PhoneNumber.contains("+27"))){ 
            return false;
        } else {
            return true;
        }

    }

    public String registerUser() 
    {
        if (!checkUsername() && checkPasswordComplexity()){
            return ("Username is incorrectly formatted ");
    }else{
            if (checkUsername() && !checkPasswordComplexity()){
             return ("User is registered");   
            }
                
            }
        return ("Password does not meet complexity requirements");
                    
        }
        
    

    public boolean UserLogin(String logUsername, String logPassword){
       // Verifying login information with registration information  
        
       if (logUsername.equals(regUsername) && logPassword.equals(regPassword)){
           return true;
       }else{
           return false;
       }
    }

   public String returnLoginStatus(){
       
       if (UserLogin(regUsername, regPassword)){
           System.out.println ("Welcome "+ regPassword+", it is great to see you again");
       }else{
       System.out.println("Username or password incorrect, please try again");
   }
        return "";
   }
}
