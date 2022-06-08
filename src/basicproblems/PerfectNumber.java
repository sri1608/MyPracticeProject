package basicproblems;

public class PerfectNumber {

	public static void main(String[] args) {

		int a = 496, sum = 1;
		for(int i = 2; i<=a/2; i++) {
			if (a% i == 0) {
				sum = sum + i;
			}
		}
		if(sum == a) {
			System.out.println("perfect number");
		}else {
			System.out.println("not perfect");
		}
	}

}
