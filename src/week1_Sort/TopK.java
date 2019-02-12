package week1_Sort;

import java.util.Arrays;

public class TopK {
	private static int findTopK(int [] a, int k) {
		int y= 0;
		for (int i = 0; i < a.length; i++) {
			int min= a[i];
			int x= i;
			for (int j = i; j < a.length; j++) {
				if (a[j] < min) {
					min= a[j];
					x= j;
				}
			}
			int temp= a[i];
			a[i]= a[x];
			a[x]= temp;
			y= a[a.length - k];		//tim top K, sd thuat toan sx chon
		}
		return y;
	}
	
	public static void main(String[] args) {
//		TopK tk= new TopK();
		int[] a= {5, 9, 1, 6, 3, 14, 20, 11, 2};
		int k= 1;
		System.out.printf("Phan tu lon thu %d la: %d", k, findTopK(a, k));
		
	}
}
