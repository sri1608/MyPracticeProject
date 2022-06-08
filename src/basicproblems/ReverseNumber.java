package basicproblems;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int a = sc.nextInt();
		
		int rem, rev = 0, temp = a;
		
		while(a != 0){
			rem = a % 10;
			rev = rev * 10 + rem;
			a = a / 10;
		}
		System.out.println(rev);
	}
}
