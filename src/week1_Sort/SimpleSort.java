package week1_Sort;

import java.util.Arrays;

public class SimpleSort {
	private void bubbleSortUp(int [] a) {
		for (int i = a.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
//			System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
	}
	
	private void bubbleSortDown(int [] a) {
		for (int i = a.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] < a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	private void selectionSortUp(int [] a) {
		for (int i = 0; i < a.length; i++) {
			int j= i;
			int min= a[i];
			for (int k = i; k < a.length; k++) {
				if (a[k] < min) {
					min= a[k];
					j= k;
				}
			}
			int temp = a[i];
			a[i]= a[j];
			a[j] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
	
	private void selectionSortDown(int [] a) {
		for (int i = 0; i < a.length; i++) {
			int j= i;
			int max= a[i];
			for (int k = i; k < a.length; k++) {
				if (a[k] > max) {
					max= a[k];
					j= k;
				}
			}
			int temp = a[i];
			a[i]= a[j];
			a[j] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
	
	private void shiftElements(int [] a, int i) {
		int x= a[i];
		while (i > 0  && a[i-1] > x) {
			a[i]= a[i-1];
			i--;
		}
		a[i] = x;
//		System.out.println(Arrays.toString(a));		//de in ra tung buoc sx
	}
	
	private void insertionSortUp(int [] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i-1]) {
				shiftElements(a, i);
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	private void insertionSortDown(int [] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i-1]) {
				int x= a[i];
				while (i > 0  && a[i-1] < x) {
					a[i]= a[i-1];
					i--;
				}
				a[i] = x;
//				System.out.println(Arrays.toString(a));		//in ra tung buoc sap xep
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		SimpleSort ss= new SimpleSort();
		int[]a = {14, 2, 3, 5, 1, 9, 8};
		ss.bubbleSortUp(a);
		ss.bubbleSortDown(a);
		ss.selectionSortUp(a);
		ss.selectionSortDown(a);
		ss.insertionSortUp(a);
		ss.insertionSortDown(a);

	}
	
	
}
