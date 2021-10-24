package com.Arrays;

import java.util.Scanner;

public class ArraysDeclaration {
	public static void main(String args[]) {
		System.out.println("Enter Size of Array");
		try (Scanner sc = new Scanner(System.in);) {
			int size = sc.nextInt();
			int A[] = new int[size];
			System.out.println("Enter Elements");
			for (int i = 0; i < size; i++) {
				A[i] = sc.nextInt();
			}
			DisplayElements(A, size);
		}
	}

	static void DisplayElements(int[] A, int size) {
		System.out.println("All elements of Array is");
		for (int i = 0; i < size; i++) {
			System.out.print(A[i] + " ");
		}
	}
}
