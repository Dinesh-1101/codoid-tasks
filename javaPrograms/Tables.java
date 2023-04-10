package javaPrograms;

public class Tables {

	public Tables(int n){
		for (int i = 1; i < 12; i++) {
			System.out.println(n+"* "+i +" =" +i*n);
		}
	}

	public static void main(String[] args) {
		Tables hii=new Tables(10);
		

	}

}
