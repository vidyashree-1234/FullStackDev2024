package com.gentech.assignment;

public class Cubeelement {

	public static void main(String[] args) {
		        int[] intArray = {1, 2, 3, 4, 5};

		        // Call the method to display the cube of each element
		        displayCubes(intArray);
		    }

		    // Method to display the cube of each element in the array
		    public static void displayCubes(int[] array) {
		        System.out.println("Cubes of the elements in the array:");
		        for (int i = 0; i < array.length; i++) {
		            int cube = array[i] * array[i] * array[i];
		            System.out.println("Element: " + array[i] + ", Cube: " + cube);
		        }
		    }
		}
