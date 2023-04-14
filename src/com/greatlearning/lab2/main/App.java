package com.greatlearning.lab2.main;

import java.util.Scanner;

import com.greatlearning.lab2.service.BubbleSortImplementation;
import com.greatlearning.lab2.service.NotesCountService;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Currency Denominations");
		int size = sc.nextInt();
		int notes[] = new int[size];
		System.out.println("Enter the currency denominations value one by one");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		BubbleSortImplementation bb = new BubbleSortImplementation();
		bb.bubbleSort(notes);
//		System.out.println("After Sort");
//		for (int i : notes) {
//			System.out.println(i + " ");
//		}
		System.out.println("Enter the amount to pay");
		int amount = sc.nextInt();
		NotesCountService ncs = new NotesCountService();
		ncs.notesCounter(notes, amount);

	}

}