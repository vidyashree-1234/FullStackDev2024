package com.gentech.assignment;

public class Primeno1to100 {

	public static void main(String[] args) {
		
		        int sum = calculateSumOfPrimes(1, 100);
		        System.out.println("The sum of prime numbers between 1 and 100 is: " + sum);
		    }

		    public static boolean isPrime(int number) {
		        if (number <= 1) {
		            return false;
		        }
		        for (int i = 2; i <= Math.sqrt(number); i++) {
		            if (number % i != 0) {
		                return false;
		            }
		        }
		        return true;
		    }
		    public static int calculateSumOfPrimes(int start, int end) {
		        int sum = 0;
		        for (int i = start; i <= end; i++) {
		            if (isPrime(i)) {
		                sum += i;
		            }
		        }
		        return sum;
		    }
		}
