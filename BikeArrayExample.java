package com.arrays.examples;


public class BikeArrayExample {
 public static void main(String[] args) {
     // Single array of MountainBike objects
     MountainBike[] bikes = new MountainBike[3];
     for (int i = 0; i < bikes.length; i++) {
         bikes[i] = new MountainBike(); // Initialize each element with a new MountainBike instance
     }

     // Multi-dimensional array of MountainBike objects
     MountainBike[][] garage = new MountainBike[2][2];
     for (int i = 0; i < garage.length; i++) {
         for (int j = 0; j < garage[i].length; j++) {
             garage[i][j] = new MountainBike(); // Initialize each element with a new MountainBike instance
         }
     }

     // Jagged array of MountainBike objects
     MountainBike[][] showroom = new MountainBike[3][];
     showroom[0] = new MountainBike[2];
     showroom[1] = new MountainBike[1];
     showroom[2] = new MountainBike[3];

     // Initialize bikes in the showroom
     for (int i = 0; i < showroom[0].length; i++) {
         showroom[0][i] = new MountainBike(); // Initialize each element with a new MountainBike instance
     }
     showroom[1][0] = new MountainBike();
     for (int i = 0; i < showroom[2].length; i++) {
         showroom[2][i] = new MountainBike(); // Initialize each element with a new MountainBike instance
     }

     // Manipulate bikes in arrays
     bikes[0].speedUp(10);
     bikes[1].speedUp(15);
     bikes[2].speedUp(20);

     garage[0][0].applyBrakes(5);
     garage[1][1].speedUp(30);

     showroom[0][1].applyBrakes(8);
     showroom[2][2].speedUp(25);

     // Display speeds of bikes in array format

     // Single array of MountainBike objects
     System.out.print("Bikes: [");
     for (int i = 0; i < bikes.length; i++) {
         System.out.print(bikes[i].getSpeed());
         if (i < bikes.length - 1) {
             System.out.print(", ");
         }
     }
     System.out.println("]");

     // Multi-dimensional array of MountainBike objects
     System.out.println("Garage:");
     for (MountainBike[] row : garage) {
         System.out.print("[");
         for (int i = 0; i < row.length; i++) {
             if (row[i] != null) {
                 System.out.print(row[i].getSpeed());
             }
             if (i < row.length - 1) {
                 System.out.print(", ");
             }
         }
         System.out.println("]");
     }

     // Jagged array of MountainBike objects
     System.out.println("Showroom:");
     for (MountainBike[] row : showroom) {
         System.out.print("[");
         for (int i = 0; i < row.length; i++) {
             if (row[i] != null) {
                 System.out.print(row[i].getSpeed());
             }
             if (i < row.length - 1) {
                 System.out.print(", ");
             }
         }
         System.out.println("]");
     }
 }
}

