package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(){

    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        new Vehicle();
        //Hint: Car extends Vehicle
        this.name = name;
        this.gears = gears;
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;

    }

    public void changeGear(int newGear){

        this.gears = newGear;

        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

        move(newSpeed,newDirection);

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
