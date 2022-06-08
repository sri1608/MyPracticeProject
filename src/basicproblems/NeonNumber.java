package basicproblems;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	
	int sum = 0, rem, temp = a;
	a = a * a;
	while (a != 0) {
		rem = a % 10;

		sum += rem;
		a = a / 10;

	}
	if (sum == temp) {
		System.out.println(" is an neon number");
	} else {
		System.out.println(" is  not an neon number");

	}
	}

}