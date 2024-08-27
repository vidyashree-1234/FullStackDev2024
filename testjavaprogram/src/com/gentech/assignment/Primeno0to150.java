package com.gentech.assignment;

public class Primeno0to150 {

	public static void main(String[] args) {
		        int start = 50;
		        int end = 150;
		        int primeCount = countPrimes(start, end);

		        System.out.println("Number of prime numbers between " + start + " and " + end + ": " + primeCount);
		    }

		    public static int countPrimes(int start, int end) {
		        int count = 0;
		        for (int i = start; i <= end; i++) {
		            if (isPrime(i)) {
		                count++;
		            }
		        }
		        return count;
		    }

		    public static boolean isPrime(int num) {
		        if (num <= 1) {
		            return false;
		        }
		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }
		}
