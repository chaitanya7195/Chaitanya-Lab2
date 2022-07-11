package lab2Question1;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Paymoney pm = new Paymoney();
		System.out.println("Enter the size of transaction array");

		int totalNoOfTransactions = s.nextInt();

		int[] transactions = new int[totalNoOfTransactions];

		System.out.println("Enter the values of array");

		for (int i = 0; i < totalNoOfTransactions; i++)
			transactions[i] = s.nextInt();
		// Get the no. of targets
		System.out.println("Enter the total no. of targets that needs to be achieved");
		int targetCount = s.nextInt();
		System.out.println("Enter the value of targets");
		int target;

		int prefixSum[] = new int[totalNoOfTransactions];
		prefixSum[0] = transactions[0];
		for (int i = 1; i < totalNoOfTransactions; i++) {
			prefixSum[i] = prefixSum[i - 1] + transactions[i];
		}
		System.out.println(Arrays.toString(prefixSum));
		for (int i = 0; i < targetCount; i++) {
			target = s.nextInt();
			pm.processTransactions(prefixSum, target);
		}

		s.close();

	}

}
