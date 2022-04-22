package com.greatlearning.currencydenominations;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] currency;
		
		System.out.print("Enter the number of denomination: ");
		int size = input.nextInt();
		
		CurrencyDenominations service = new CurrencyDenominations();
		
		currency = service.createDenomications(size, input);
		
		System.out.print("Enter the payable amount: ");
		int amount = input.nextInt();		
		
		service.makePayment(currency, amount);
		

	}

}