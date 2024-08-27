package com.gentech.assignment;
public class booleanrev {
	    public static void main(String[] args) 
	    {
	        boolean[] booleanArray = {true, false, true, false, true};

	    
	        boolean[] reversedArray = reverseArray(booleanArray);
	        System.out.println("Reversed array:");
	        printArray(reversedArray);
	    }
	    public static boolean[] reverseArray(boolean[] array) 
	    {
	        boolean[] reversed = new boolean[array.length];
	        for (int i = 0; i < array.length; i++) {
	            reversed[i] = array[array.length - 1 - i];
	        }
	        return reversed;
	    }

	    public static void printArray(boolean[] array)
	    {
	        for (boolean element : array) 
	        {
	            System.out.print(element + " ");
	        }
	        System.out.println();
	    }
	}

