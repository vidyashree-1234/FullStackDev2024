package com.gentech.assignment;

public class Tables {

	public static void main(String[] args) {
		        printMultiplicationTables();
		    }

		    public static void printMultiplicationTables() {
		        for (int i = 1; i <= 20; i++) {
		            System.out.println("Multiplication table for " + i);
	
		            for (int j = 1; j <= 10; j++) {
		                System.out.println(i + " x " + j + " = " + (i * j));
		            }
		            System.out.println(); 
		        }
		    }
		}
