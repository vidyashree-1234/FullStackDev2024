package com.gentech.assignment;

public class doublesum 
{
	    public static double sumOfRow(double[][] array, int rowIndex) {
	        double sum = 0;
	        if (rowIndex >= 0 && rowIndex < array.length) {
	            for (int i = 0; i < array[rowIndex].length; i++) {
	                sum += array[rowIndex][i];
	            }
	        } else {
	            System.out.println("Invalid row index.");
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        // Example 2D double array
	        double[][] array = {
	            {1.1, 2.2, 3.3},
	            {4.4, 5.5, 6.6},
	            {7.7, 8.8, 9.9}
	        };

	        // Row index for which we want to find the sum
	        int rowIndex = 1;

	        // Calculate the sum of the specified row
	        double sum = sumOfRow(array, rowIndex);

	        // Print the sum of the second row
	        System.out.println("Sum of the elements in row " + (rowIndex + 1) + ": " + sum);
	    }
	}

