package week1_Sort;

import java.util.Arrays;

public class BubbleSortStep {
	
	public static void main(String[] args) {
		BubbleSortStep bs= new BubbleSortStep();
		int [] a= {1, 2, 3, 4, 5, 9, 16};
		bs.bubbleSortUp(a);
	}

	private void bubbleSortUp(int[] a) {
		int comp= 0, swap= 0;
		for (int i = a.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				comp ++;
				if (a[j+1] < a[j]) {
					int temp = a[j+1];
					a[j+1]= a[j];
					a[j]= temp;	
					swap++;
				}
			}
			System.out.println(Arrays.toString(a));
		}
		System.out.println("comp= "+comp); 		//compare times
		System.out.println("swap= "+swap);		//swap times
	}
}

