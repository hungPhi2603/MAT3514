package week6_HeapSort_Puzzle;

import java.util.ArrayList;
import java.util.Arrays;

public class Exp {
	public static void main(String[] args) {
		String[]a= {"S","C","G"};
		String[]b= new String [a.length+1];
		for (int i = 1; i < b.length; i++) {
			b[i]=a[i-1];
		}
		b[3]= "E"+4;
		System.out.println(Arrays.toString(b));
	}
}
