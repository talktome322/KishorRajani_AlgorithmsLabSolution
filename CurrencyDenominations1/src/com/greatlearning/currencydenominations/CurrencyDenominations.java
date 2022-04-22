package com.greatlearning.currencydenominations;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyDenominations {
	int quotient, remainder;
	String expression = "";
	
	public void makePayment(int[] currency, int amount) {
		
		Arrays.sort(currency);
		
		print(currency);
		System.out.println(amount);
		quotient = amount;
		
		for(int i = currency.length - 1 ; i >= 0 ; i--) {
			remainder = quotient % currency[i];
			quotient = quotient / currency[i];
			if(quotient > 0)
				expression = expression + currency[i] + " : " + quotient + "\n";
			quotient = remainder;
		}
		
		if(remainder == 0)
			System.out.println(expression);
		else
			System.out.println("Not payable");
		
	}
	
	public int[] createDenomications(int size, Scanner input){
		int[] arr = new int[size];
		
		System.out.printf("Enter %d values: ", size);
		
		for(int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
		}
		
		return arr;
	}
	
	public void print(int[] arr) {
		System.out.println( Arrays.toString(arr) );
	}
	

}