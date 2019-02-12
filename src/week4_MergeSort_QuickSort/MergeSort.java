// This program can sort Comparable data, use MergeSort algos

package week4_MergeSort_QuickSort;

import java.util.Scanner;

public class MergeSort {
	static Scanner sc= new Scanner(System.in);
	private void merge(Comparable[]a, Comparable[]b, int u, int m, int v) {
		//a is original array, b is array coppied from a to compare, u is first pos, m is sub pos, v is last pos
		
		//copy from a to b
		for (int i = u; i <= v; i++) {
			b[i]= a[i];
		}
		
		//merging
		int i=u;
		int j=m+1;
		for (int k = u; k <= v; k++) {
			if (i>m) {
				a[k]= b[j++];
			} else if (j>v) {
				a[k]= b[i++];
			} else if (lessThan(b[i], b[j])) {
				a[k]= b[i++];
			} else 
				a[k]= b[j++];
		}
		
	}

	private boolean lessThan(Comparable i, Comparable j) {
		//if i<j return true
		return i.compareTo(j)<0;
	}
	
	void sort(Comparable[]a, Comparable[]b, int u, int v) {
		if (v <= u) {
			return;
		}
		int m= u+(v-u)/2;
		sort(a,b,u,m);
		sort(a,b,m+1,v);
		merge(a,b,u,m,v);
	}
	
	void sort(Comparable[] a) {
		Comparable[] b= new Comparable[a.length];
		sort(a,b,0,a.length-1);
	}
	
	public static void main(String[] args) {
		MergeSort merge= new MergeSort();
		String s= sc.nextLine();
		Character[] a= new Character[s.length()];
		for (int i = 0; i < a.length; i++) {
			a[i]= s.charAt(i);
		}
		merge.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
