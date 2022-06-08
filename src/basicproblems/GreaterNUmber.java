package basicproblems;

import java.util.Scanner;

public class GreaterNUmber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {
			System.out.println(a + " is an greater than " + b);
		} else {
			System.out.println(b + " is an greater than " + a);

		}
	}
}
