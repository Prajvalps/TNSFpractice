package com.interfaces.examples;
//Interface for Bike
interface Bike {
 void speedUp(int increment);
 void applyBrakes(int decrement);
 void displaySpeed();
}

//Class implementing Bike interface
class MountainBike implements Bike {
 private int speed;

 public MountainBike() {
     speed = 0;
 }

 public void speedUp(int increment) {
     speed += increment;
 }

 public void applyBrakes(int decrement) {
     if (speed - decrement >= 0) {
         speed -= decrement;
     } else {
         speed = 0;
     }
 }

 public void displaySpeed() {
     System.out.println("Current Speed: " + speed + " mph");
 }
}




