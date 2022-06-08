package basicproblems;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int rev = 0, rem = 0, temp = a;
		while (a != 0) {
			
			rem = a % 10;
			rev = rev * 10 + rem;
			a = a / 10;
				
		}
		if(rev == temp) {
			System.out.println("it is an palindrome number");
		}else{
			System.out.println("it is not an palindrome number");
		}
		}
	}


