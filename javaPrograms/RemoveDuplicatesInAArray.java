package javaPrograms;

public class RemoveDuplicatesInAArray {

	public static void main(String[] args) {
		int a[]={1,1,2,2,2,3,3,3,3,3,4,4,4,4,5};
		int j=0;
		int [] newindex=new int[a.length];
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] != a[i+1]) {
				newindex[j]=a[i];
				j++;
			}
		}
		newindex[j++]=a[a.length-1];
		for (int k = 0; k < j; k++) {
			System.out.println(newindex[k]);
	}

	}

}
