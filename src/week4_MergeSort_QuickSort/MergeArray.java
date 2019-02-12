//Merge two sorted arrays. This program is a child of MergeSort Class
package week4_MergeSort_QuickSort;

import java.util.Arrays;

public class MergeArray {
	private static int[] merge(int[]a, int[]b) {
		int[]c = new int[a.length+b.length];
		int i= 0;
		int j= 0;
		for (int k = 0; k < c.length; k++) {
			if (i > a.length-1)
				c[k]= b[j++];
			else if (j > b.length-1)
				c[k]= a[i++];
			
			else if (a[i] < b[j])
				c[k]= a[i++];
			else
				c[k]= b[j++];
		}
		return c;
	}
	
	public static void main(String[] args) {
		int[] a= {1,3,5,9,16};
		int[] b= {2,3,4,6};
		System.out.println(Arrays.toString(merge(a, b)));
	}
}
