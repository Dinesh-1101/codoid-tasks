package javaPrograms;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		for (int i = 6; i >=1; i--) {
			fact=fact*i;
			System.out.println(i+"   "+fact);
		}
		System.out.println(fact);

	}

}
