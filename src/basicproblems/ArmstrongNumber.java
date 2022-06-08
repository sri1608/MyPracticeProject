package basicproblems;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cube = 0, cubesum = 0, rem = 0, temp = a;

		while (a != 0) {
			rem = a % 10;
			cube = rem * rem * rem;
			cubesum += cube;
			a = a / 10;

		}
		if (cubesum == temp) {
			System.out.println(" is an armstrong number");
		} else {
			System.out.println(" is  not an armstrong number");
		}
	}
}
