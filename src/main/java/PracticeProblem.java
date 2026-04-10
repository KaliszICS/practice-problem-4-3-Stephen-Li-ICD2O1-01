/*
File: Lesson 4.3 - Do While Loops
Author: Stephen Li
Date Created: April 10, 2026
Date Last Modified: April 10, 2026
*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
		int num1 = 1;
		do {
			System.out.print("Input a positive integer: ");
			num1 = input.nextInt();
		} while (num1 < 0);
		System.out.println(num1 * 2);
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		String password2;
		String password1;
		do {
			System.out.print("Input a password: ");
			password1 = input.nextLine();
			System.out.print("Confirm the password: ");
			password2 = input.nextLine();
		} while (!password1.equals(password2));
		System.out.println("success.");
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		do {
			System.out.print("Input an integer: ");
			num1 = input.nextInt();
			System.out.print("Input an integer that is a multiple of the first integer: ");
			num2 = input.nextInt();
		} while (num2 % num1 != 0);
		System.out.println("success.");
	}
}
