package basicproblems;

public class Smaller {

	public static void main(String[] args) {

		int a= 123;
		int count = 0, rem, sum =0, temp = a;
		while(temp >0) {
			temp = temp/10;
			count++;
			
		}
		while(a<0) {
			rem = a%10;
			a=a/10;
			sum = sum+(count*rem);
			count--;
		}
		System.out.println(sum);

	}
}
