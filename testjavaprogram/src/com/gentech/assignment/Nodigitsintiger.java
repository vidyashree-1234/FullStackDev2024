package com.gentech.assignment;

public class Nodigitsintiger {

		    public static int countDigits(int number) {
		   
		        if (number < 0) {
		            number = -number;
		        }
	
		        int count = 0;
		        do {
		            count++;
		            number /= 10;
		        } while (number != 0);
		        
		        return count;
		    }

		    public static void main(String[] args) {
		        int[] numbers = {12345, -67890, 0, 42};

		        
		        for (int number : numbers) {
		            System.out.println("Number: " + number + " has " + countDigits(number) + " digits.");
		        }
		    }
		}
	