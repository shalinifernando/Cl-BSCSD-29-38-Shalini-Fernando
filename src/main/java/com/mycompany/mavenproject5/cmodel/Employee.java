/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5.cmodel;

/**
 *
 * @author User
 */
public class Employee {
   private int id;
    private String name;
    private String address;
    private String tnumber;
    private int guests;
    private String vehicle;
    private String destinanation;

    // Constructor
    public Employee(String name, String address, String tnumber, int guests, String vehicle, String destinanation) {
        this.name = name;
        this.address = address;
        this.tnumber = tnumber;
        this.guests = guests;
        this.vehicle = vehicle;
        this.destinanation = destinanation;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getTnumber() {
        return tnumber;
    }

    public void setTnumber(String tnumber) {
        this.tnumber = tnumber;
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int age) {
        this.guests = guests;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
     public String getDestinanation() {
        return destinanation;
    }

    public void setDestinanation(String destinanation) {
        this.destinanation = destinanation;
    } 
}
