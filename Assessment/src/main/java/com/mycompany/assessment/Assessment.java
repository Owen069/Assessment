/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assessment;

import java.util.Scanner;

/**
 *
 * @author owens
 */
public class Assessment {

    public static void main(String[] args) {

        // Inputs of information
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username" + "***Username must consist of 5 characters including and underscore(_)");
        String regUsername = scanner.nextLine();

        if (regUsername.length() <= 5 && regUsername.contains("_")) {
            System.out.println("Username Successfully capture");
            System.out.println(" Enter your password");
            
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters");
        }
        String regPassword = scanner.nextLine();
        

        Login login = new Login(regPassword, regUsername);
        if (!login.checkPasswordComplexity()){
            System.out.println("Password is not correctly formatted; please ensure that the password must contains atleast 8 characters, a capital letter and a special character");
        }else{
             System.out.println("Password successfully added");
            System.out.println("Enter cell phone number with international code");
        }
        
            String PhoneNumber = scanner.nextLine();
        if (login.checkCellPhoneNumber(PhoneNumber)) {
            System.out.println("Cell phone number is successfully added");
            System.out.println("Enter your first name");
            String firstName = scanner.nextLine();
            System.out.println("Enter your last name");
            String lastName = scanner.nextLine();
            System.out.println("Enter username for login purposes");
        String logUsername = scanner.nextLine();
        System.out.println("Enter password for login purposes");
        String logPassword = scanner.nextLine();
        } else {
            System.out.println("Cell phone number is incorrectly formatted or does not contain international code");
           
        }
        System.out.println(login.returnLoginStatus());
        scanner.close();

    }
}
//****************************************************************************************************
//****************************************************************************************************
