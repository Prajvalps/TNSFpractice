package com.interfaces.examples;

public class Main {
	 public static void main(String[] args) {
	     MountainBike bike = new MountainBike();

	     bike.speedUp(20);
	     bike.displaySpeed();

	     bike.applyBrakes(5);
	     bike.displaySpeed();

	     bike.applyBrakes(20); // Trying to apply brakes more than current speed
	     bike.displaySpeed();
	 }
	}