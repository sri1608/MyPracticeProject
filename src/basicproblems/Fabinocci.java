package basicproblems;

public class Fabinocci {

	public static void main(String[] args) {

		int series = 5, firstnum = 0, secondnum =1, thirdnum;
		for(int i = 0; i < series; i++) {
			thirdnum = firstnum + secondnum;
			System.out.println(firstnum + " " + secondnum);

			firstnum = secondnum;
			secondnum = thirdnum;
					}
	}

}
