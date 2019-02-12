package week1_Sort;

import java.util.Arrays;

public class InsertionSortStep {
	
	private void insertionSort(int [] a) {
		int comp= 0, swap= 0;
		for (int i = 1; i < a.length; i++) {
			comp++;
			if (a[i] < a[i-1]) {
				int x= a[i];
				
				while (i > 0 && a[i-1] > x) {
					
					a[i]= a[i-1];
					i--;
					swap++;
				}
				a[i]= x;
				System.out.println(Arrays.toString(a));
			}
			
		}
		System.out.println("comp= "+comp);
		System.out.println("swap= "+swap);
	}
	
	public static void main(String[] args) {
		InsertionSortStep is= new InsertionSortStep();
		int [] a= {1, 2, 3, 4, 5, 10, 9, 8};
		is.insertionSort(a);
	}
}
