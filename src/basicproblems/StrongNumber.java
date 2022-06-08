package basicproblems;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	int rem, sum = 0, temp = a;
		while( a > 0) {
			rem = a% 10;
			int fact = 1, i = 1;
		
			while( i<= rem ) {
			fact = fact * i;
			i++;
		}
		sum = sum + fact;
		a= a/10;
	}
		if(sum == temp) {
			System.out.println("strong");
		}else {
			System.out.println("not strong");
		}
	}
}
