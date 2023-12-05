package com.arrays.examples;

//Interface for Bike
interface Bike {
void speedUp(int increment); // Method to increase speed
void applyBrakes(int decrement); // Method to apply brakes
String getSpeed(); // Method to get current speed as a string
}

//Class implementing Bike interface
class MountainBike implements Bike {
private int speed; // Private speed variable for MountainBike

// Constructor to initialize speed to 0
public MountainBike() {
   speed = 0;
}

// Method to increase speed by a specified increment
public void speedUp(int increment) {
   speed += increment;
}

// Method to apply brakes by a specified decrement
public void applyBrakes(int decrement) {
   if (speed - decrement >= 0) {
       speed -= decrement;
   } else {
       speed = 0;
   }
}

// Method to get current speed as a string
public String getSpeed() {
   return "Current Speed: " + speed + " mph";
}
}
