/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carsproject;

/**
 *
 * @author PC
 */
public class Vehicles {
    private int id;
    private String vin;
    private String plateNumber;
    private String model;
    private int year;
    private String color;
    private int mileage;

    // Constructor
    public Vehicles(int id, String vin, String plateNumber, String model, int year, String color, int mileage) {
        this.id = id;
        this.vin = vin;
        this.plateNumber = plateNumber;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
    }

    // Getters
    public int getId() { return id; }
    public String getVin() { return vin; }
    public String getPlateNumber() { return plateNumber; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getColor() { return color; }
    public int getMileage() { return mileage; }

    // Método para mostrar datos
    public String toString() {
        return id + " | " + vin + " | " + plateNumber + " | " + model + " | " + year + " | " + color + " | " + mileage;
    }
}