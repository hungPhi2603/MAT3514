// This program can sort Comparable data by use QuickSort algos

package week4_MergeSort_QuickSort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {
	private int partition(Comparable[]a, int u, int v) {
		// TODO Auto-generated method stub
		int i= u, j= v+1;
		while(true) {
			while (lessThan(a[++i], a[u]))
				if (i==v) break;
			while (lessThan(a[u], a[--j]))
				if (j==u) break;
			if (i>=j) break;
			swap(a,i,j);
		}
		swap(a,u,j);
		return j;
	}

	private void swap(Comparable[] a, int i, int j) {
		// TODO Auto-generated method stub
		Comparable temp= a[i];
		a[i]= a[j];
		a[j]= temp;
	}

	private boolean lessThan(Comparable x, Comparable y) {
		// TODO Auto-generated method stub
		return x.compareTo(y) < 0;
	}
	
	private void sort(Comparable[]a, int u, int v) {
		// TODO Auto-generated method stub
		if (v<=u) return;
		int j= partition(a, u, v);
		sort(a, u, j-1);
		sort(a, j+1, v);
	}
	
	private void sort(Comparable[]a) {
		
		//shuffle needed for performance guarantee
		shuffleArray(a);
		
		sort(a, 0, a.length-1);
	}
	
	static void shuffleArray(Comparable[] ar)
	  {
	    // If running on Java 6 or older, use `new Random()` on RHS here
	    Random rnd = ThreadLocalRandom.current();
	    for (int i = ar.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      // Simple swap
	      Comparable a = ar[index];
	      ar[index] = ar[i];
	      ar[i] = a;
	    }
	  }
	
	public static void main(String[] args) {
		QuickSort qc= new QuickSort();
		Integer[]a= {1,6,2,8,4,11,3,8};
		qc.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
