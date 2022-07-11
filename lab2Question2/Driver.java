package lab2Question2;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		MergeSort mergeSort = new MergeSort();
		CountingNotes cn = new CountingNotes();
		System.out.println("Enter the total no of denominations");
		int totalNoOfDenominations = scanner.nextInt();

		int[] notes = new int[totalNoOfDenominations];
		
		System.out.println("Enter currency Denominations value");
		for (int i = 0; i < totalNoOfDenominations; i++) {
			notes[i] = scanner.nextInt();
		}

		System.out.println("Enter the amount you want to pay");
		int amount = scanner.nextInt();

		mergeSort.sort(notes, 0, notes.length - 1);

		System.out.println(Arrays.toString(notes));
		cn.notesCountImplementation(notes, amount);

		scanner.close();

	}

}
