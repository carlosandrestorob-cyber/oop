/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraydata;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joan
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayData {

    public static void mainMenu(){ 
        System.out.println("::: MAIN MENU :::\n"
                + "[1]. Create/register users \n"
                + "[2]. List users \n"
                + "[3]. Search user \n"
                + "[4]. Update user \n"
                + "[5]. Delete user \n"
                + "[6]. Exit \n"
                + ".::: Press an option: ");
    }
    
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
   
        ArrayList<String> identNumbers = new ArrayList<>();
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        
        String firstname, lastname, email, key, ident_number;
        int age, opt;
        boolean menu_status = true;
        
        while(menu_status){
            mainMenu();
            opt = data.nextInt();
            data.nextLine();
            
            switch (opt){
                case 1:
                    System.out.println("::: REGISTER NEW USER :::");
                    System.out.println("\nUser Nro.: " + (firstNames.size()+1));   
            
                    
                    System.out.print("First name: ");   
                    firstname = data.nextLine();
                    System.out.print("Last name: ");
                    lastname = data.nextLine();
                    System.out.print("Identification number: ");   
                    ident_number = data.nextLine();
                    System.out.print("Email: ");   
                    email = data.nextLine();
                    System.out.print("Age: ");   
                    age = data.nextInt();
                    data.nextLine();

                    identNumbers.add(ident_number);
                    firstNames.add(firstname);
                    lastNames.add(lastname);
                    emails.add(email);
                    ages.add(age);

                    System.out.println("\nUser has been registered successfully !!!");
                    System.out.println("\nPress ENTER to go back to main menu.");
                    key = data.nextLine();
                    break;

                case 2:
                    System.out.println("Total users: " + firstNames.size());
                    if (firstNames.isEmpty()){
                        System.out.println("No users !!!");
                    } else {
                        for(int j = 0; j < firstNames.size(); j++){
                            System.out.println("User " + (j+1) + ": " 
                                    + identNumbers.get(j) + " | " 
                                    + firstNames.get(j) + " | " 
                                    + lastNames.get(j) + " | " 
                                    + emails.get(j) + " | " 
                                    + ages.get(j));
                        }
                    }
                    System.out.println("\nPress ENTER to go back to main menu.");
                    key = data.nextLine();
                    break;

                case 3:
                    System.out.println("::: SEARCH USER BY IDENTIFICATION :::");
                    System.out.print("Enter identification number: ");
                    String searchId = data.nextLine();
                    
                    boolean found = false;
                    for(int j = 0; j < identNumbers.size(); j++){
                        if(identNumbers.get(j).equals(searchId)){
                            System.out.println("User found: " 
                                    + identNumbers.get(j) + " | " 
                                    + firstNames.get(j) + " | " 
                                    + lastNames.get(j) + " | " 
                                    + emails.get(j) + " | " 
                                    + ages.get(j));
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("User not found with ID: " + searchId);
                    }
                    System.out.println("\nPress ENTER to go back to main menu.");
                    key = data.nextLine();
                    break;

                case 4:
                    System.out.println("Update user (to be implemented)");
                    System.out.println("\nPress ENTER to go back to main menu.");
                    key = data.nextLine();
                    break;

                case 5:
                    System.out.println("Delete user (to be implemented)");
                    System.out.println("\nPress ENTER to go back to main menu.");
                    key = data.nextLine();
                    break;

                case 6:
                    System.out.println("Bye, bye");
                    menu_status = false;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }
}
