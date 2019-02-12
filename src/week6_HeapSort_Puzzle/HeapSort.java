package week6_HeapSort_Puzzle;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {

	int[]heap= new int [100];	//start at index=1
	int n= 0;				//n is number of elements
	int m;				//clone of n to keep num of ele (n will be reduce during sorting)
	
	public HeapSort(int n, int[]heap) {
		this.n= n;
		for (int i = 1; i < n+1; i++) {
			this.heap[i]= heap[i-1];
		}
		this.m= n;
	}
	
	private Scanner sc= new Scanner(System.in);
	
	private void input() {
		for (int i = 1; i < n+1; i++) {
			heap[i]= sc.nextInt();
		}
	}
	
	private void downheap(int k) {
		while (k*2 <= n) {
			int j= k*2;
			if(j<n && heap[j]< heap[j+1]) j++;
			if(heap[k]>heap[j]) break;
			swap(k, j);
			k=j;
		}
	}

	private void swap(int k, int j) {
		int temp= heap[k];
		heap[k]= heap[j];
		heap[j]= temp;
	}
	
	//
	private void inPlace() {
		//build a heap structure
		for (int i = n/2; i>=1; i--) {
			downheap(i);
		}
		//start sorting
		while (n>1) {
			swap(1,n); 	//bring max to lastest position
			n--;
			downheap(1,n);	//continue without recent max
		}
		//return heap;
	}
	
	//to do the same as downheap(k) on an array of n2 elements
	private void downheap(int k, int n) {
		while (k*2 <= n) {
			int j= k*2;
			if(j<n && heap[j]< heap[j+1]) j++;
			if(heap[k]>heap[j]) break;
			swap(k, j);
			k=j;
		}
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		for (int i = 1; i < m+1; i++) {
			sb.append(heap[i]+"\t");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		int n= 9;
		int[] heap= {8,4,3,9,10,20,6,3,12};
		HeapSort h= new HeapSort(n, heap);
		//h.input();
		
		h.inPlace();
		System.out.println(h);
		
	}
}
