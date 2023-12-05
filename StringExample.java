package com.Strings.examples;

public class StringExample {
    public static void main(String[] args) {
        // String operations
        String str = "My  ";
        str = str.concat(" Bike"); 
        int length = str.length(); 
        char ch = str.charAt(0); 
        String sub = str.substring(3); 
        int index = str.indexOf('B'); 
        String[] parts = str.split(" "); 

        // StringBuffer operations
        StringBuffer buffer = new StringBuffer("My  ");
        buffer.append(" Bike"); 
        buffer.insert(5, ","); 
        buffer.delete(5, 6); 
        buffer.replace(5, 11, "Duke");
        int bufferLength = buffer.length(); 
        String result = buffer.toString(); 

        // Displaying results
        System.out.println("String operations:");
        System.out.println("Modified String: " + str);
        System.out.println("Length: " + length);
        System.out.println("Character at index 0: " + ch);
        System.out.println("Substring from index 3: " + sub);
        System.out.println("Index of 'o': " + index);
        System.out.println("Split parts:");
        for (String part : parts) {
            System.out.println(part);
        }

        System.out.println("\nStringBuffer operations:");
        System.out.println("Modified StringBuffer: " + result);
        System.out.println("Buffer Length: " + bufferLength);
    }
}

