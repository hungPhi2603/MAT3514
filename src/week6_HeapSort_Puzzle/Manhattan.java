package week6_HeapSort_Puzzle;

import java.util.Scanner;

public class Manhattan {
	private static int manhattan(int[][]a) {
		int manhattan= 0; 
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j]!=0) {
					manhattan+= Math.abs(i-(a[i][j]-1)/a[0].length);	//tim do lech hang
					manhattan+= Math.abs(j-(a[i][j]-1)%a[0].length);	//tim do lech cot
				}
			}
		}
		return manhattan;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [][]a= new  int [3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j]= sc.nextInt();
			}
		}
		System.out.println(manhattan(a));
		/*for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}*/
	}
}
