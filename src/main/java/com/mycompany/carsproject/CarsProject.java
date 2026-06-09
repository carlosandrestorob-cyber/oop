/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carsproject;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
import java.util.ArrayList;
import java.util.Scanner;

public class CarsProject {
    
    public static void mainMenu(){ 
        System.out.println("::: VEHICLES MENU :::\n"
                + "[1]. Register vehicle \n"
                + "[2]. List vehicles \n"
                + "[3]. Search vehicle \n"
                + "[4]. Update vehicle \n"
                + "[5]. Delete vehicle \n"
                + "[6]. Exit \n"
                + ".::: Press an option: ");
    }
    
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        ArrayList<Vehicles> vehiclesList = new ArrayList<>();
        
        int opt;
        boolean menu_status = true;
        
        while(menu_status){
            mainMenu();
            opt = data.nextInt();
            data.nextLine();
            
            switch (opt){
                case 1:
                    System.out.println("::: REGISTER NEW VEHICLE :::");
                    int id = vehiclesList.size() + 1;
                    System.out.print("VIN: ");
                    String vin = data.nextLine();
                    System.out.print("Plate number: ");
                    String plate = data.nextLine();
                    System.out.print("Model: ");
                    String model = data.nextLine();
                    System.out.print("Year: ");
                    int year = data.nextInt();
                    data.nextLine();
                    System.out.print("Color: ");
                    String color = data.nextLine();
                    System.out.print("Mileage: ");
                    int mileage = data.nextInt();
                    data.nextLine();
                    
                    Vehicles v = new Vehicles(id, vin, plate, model, year, color, mileage);
                    vehiclesList.add(v);
                    
                    System.out.println("\nVehicle registered successfully!");
                    System.out.println("Press ENTER to go back.");
                    data.nextLine();
                    break;

                case 2:
                    System.out.println("Total vehicles: " + vehiclesList.size());
                    if (vehiclesList.isEmpty()){
                        System.out.println("No vehicles registered!");
                    } else {
                        for(Vehicles vItem : vehiclesList){
                            System.out.println(vItem.toString());
                        }
                    }
                    System.out.println("\nPress ENTER to go back.");
                    data.nextLine();
                    break;

                case 3:
                    System.out.println("::: SEARCH VEHICLE BY ID :::");
                    System.out.print("Enter vehicle ID: ");
                    int searchId = data.nextInt();
                    data.nextLine();
                    
                    boolean found = false;
                    for(Vehicles vItem : vehiclesList){
                        if(vItem.getId() == searchId){
                            System.out.println("Vehicle found: " + vItem.toString());
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Vehicle not found with ID: " + searchId);
                    }
                    System.out.println("\nPress ENTER to go back.");
                    data.nextLine();
                    break;

                case 4:
                    System.out.println("Update vehicle (to be implemented)");
                    data.nextLine();
                    break;

                case 5:
                    System.out.println("Delete vehicle (to be implemented)");
                    data.nextLine();
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

