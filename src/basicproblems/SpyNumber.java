package basicproblems;

import java.util.Scanner;

public class SpyNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int sum = 0,product = 1, rem;

		while(a != 0) {
			rem =a % 10;
			sum = sum + rem;
			product *= rem;
			a = a/ 10;
		}
		if(sum == product) {
			System.out.println("it is spy number");
		}else {
			System.out.println("it is not a spy number");

		}
		}
}
