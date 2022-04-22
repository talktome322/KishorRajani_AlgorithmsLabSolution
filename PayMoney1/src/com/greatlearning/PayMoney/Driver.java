package com.greatlearning.PayMoney;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] transactions;
		
		int[] targets;
		
		int transactionSize, targetSize;
		
		Scanner input = new Scanner(System.in);
		PayMoney service = new PayMoney();
		
		System.out.print("Enter the Number of transactions: ");
		transactionSize = input.nextInt();
		
		transactions = service.createArray(transactionSize, input);
		
		System.out.print("Enter the Number of Targets: ");
		targetSize = input.nextInt();
		
		targets = service.createArray(targetSize, input);
		
		for(int i = 0; i < targets.length; i++) {
			
			int numOfTrans = service.checkTarget(transactions, targets[i]);
			
			service.printResult(numOfTrans, targets[i]);
			
		}

	}

}

