package com.greatlearning.PayMoney;

import java.util.Scanner;

public class PayMoney {
	
	public int checkTarget(int[] arr, int target){
		
		int numOfTransactions = -1;
		
		int i = 0, sum = 0;
		
		while( i < arr.length ) {
			sum = sum + arr[i];
			if(sum >= target) {
				numOfTransactions = i + 1;
				break;
			}
			i++;
		}
				
		return numOfTransactions;
		
	}
	
	public int[] createArray(int size, Scanner input) {
		
		int[] arr = new int[size];
		
		System.out.print("Enter " + size + " values: ");
		for(int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
		}
		
		return arr;
		
	}
	
	public void printResult(int numOfTrans, int target) {
		if(numOfTrans < 1 ) {
			System.out.println("Target " + target + " is not achievable");
		} else {
			System.out.println("Target " + target + " is achieved after " + numOfTrans + " transactions");
		}
		
	}

}