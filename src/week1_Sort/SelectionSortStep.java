package week1_Sort;

import java.util.Arrays;

public class SelectionSortStep {
	private void selectionSortUp(int [] a) {
		int comp= 0, swap= 0;
		for (int i = 0; i < a.length; i++) {
			int min= a[i];
			int k= i;
			
			for (int j = i; j < a.length; j++) {
				comp++;
				if (a[j] < min) {
					min= a[j];
					k= j;
					swap++;
				}
			}
			int temp = a[i];
			a[i]= a[k];
			a[k]= temp;
			System.out.println(Arrays.toString(a));
		}
		System.out.println("comp= "+comp);
		System.out.println("swap= "+swap);

	}
	
	public static void main(String[] args) {
		SelectionSortStep ss= new SelectionSortStep();
		int [] a= {1, 2, 3, 4, 5, 9, 16};
		ss.selectionSortUp(a);
	}
}
