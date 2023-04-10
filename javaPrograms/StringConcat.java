package javaPrograms;

public class StringConcat {

	public static void main(String[] args) {
		String s1="ABC";
		String s2="DEF";
		String s3="IGH";
		String concat = s1.concat(s2).concat(s3);
		System.out.println(concat);
		int length = concat.length();
		System.out.println(length);
	}

}
