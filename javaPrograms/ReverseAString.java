package javaPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		String me="dinesh";
		char[] charArray = me.toCharArray();
		for (int i =charArray.length-1 ; i >=0; i--) {
			System.out.println(charArray[i]);
		}
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
