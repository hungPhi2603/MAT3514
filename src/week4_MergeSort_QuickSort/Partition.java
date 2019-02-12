//link de bai: https://drive.google.com/file/d/1iO0Al0fft6QKWycyUwM4c0oEawI50c4q/view?usp=sharing
package week4_MergeSort_QuickSort;

import java.util.Arrays;

public class Partition {
	int partition(int[]a) {
		//find index of closest AVG value
		int s=0;
		int key= 0;
		
		for (int i = 0; i < a.length; i++) {
			s+=a[i];
		}
		
		double min= Math.abs(s/a.length-a[0]);
		
		for (int i = 0; i < a.length; i++) {
			if (Math.abs(s/a.length-a[i]) < min) {
				min= Math.abs(s/a.length-a[i]);
				key= i;
			}
			
		}
		
		//fixed key value
		int x= a[key];
		
		//index(key) is fixed but pos of value could change
		int i= 0, j= a.length;
		while(true) {
			while (a[++i]<x)
				if (i==a.length-1) break;
			while (x< a[--j])
				if (j==0) break;
			if (i>=j) break;
			swap(a,i,j);
		}
		
		//after the while loop above, position of a[key] could be changed so we have to update its position
		for (int j2 = 0; j2 < a.length; j2++) {
			if (a[j2]==x) {
				key=j2;
			}
		}
		return key;
	}
	
	private void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp= a[i];
		a[i]= a[j];
		a[j]= temp;
	}
	
	public static void main(String[] args) {
		Partition p= new Partition();
		int[]a= {1,2,5,3,4,1,3,4,5,6,10};
		int key= p.partition(a);
		System.out.println("key= "+a[key]+ " index= "+key);
		System.out.println(Arrays.toString(a));
	}
}
