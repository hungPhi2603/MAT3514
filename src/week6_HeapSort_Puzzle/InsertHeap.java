package week6_HeapSort_Puzzle;

import java.util.Arrays;
import java.util.Scanner;

public class InsertHeap extends HeapIO{
	int n;
	int[]heap= new int[100];
	
	public InsertHeap(int n, int[] heap) {
		this.n= n;
		for (int i = 1; i < n+1; i++) {
			this.heap[i]= heap[i-1];
		}
	}
	
	private void upheap(int k) {
		while (k > 1 && heap[k] > heap[k/2]) {
			swap(k, k/2);
			k=k/2;
		}
	}

	private void swap(int k, int i) {
		int temp = heap[k];
		heap[k] =  heap[i];
		heap[i]= temp;
	}
	
	private void initheap() {
		for (int i = 2; i < n+1; i++) {
			upheap(i);
		}
		/*while (n>1) {
			swap(1, n);
			n--;
			upheap(n-1,n);
		}*/
	}
	
	/*void upheap(int k, int n) {
		int[]heap2= new int[k];
		for (int i = 0; i < heap2.length; i++) {
			heap2[i]=heap[i];
		}
		while (k > 1 && heap[k] > heap[k/2]) {
			swap(k, k/2);
			k=k/2;
		}
	}*/
	
	private void insert(int x) {
		n++;
		heap[n]= x;
		upheap(n);
	}
	
	private int[] out() {
		// TODO Auto-generated method stub
		return heap;
	}
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		for (int i = 1; i < n+1; i++) {
			sb.append(heap[i]);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		InsertHeap ih= HeapIO.read("dat/HeapIO.txt");
		ih.initheap();
		ih.insert(7);
		System.out.println(ih);
		//System.out.println(Arrays.toString(ih.out()));
		
		/*int n= 5;
		int[]heap= {1,4,5,2,8};
		InsertHeap ih= new InsertHeap(n, heap);
		ih.initheap();
		ih.insert(7);
		System.out.println(ih);*/
	}
}
