package week8_Graph.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hung Dec 8, 2018 1:08:13 AM
 *	tim bac cua do thi
 */
public class GraphDeg {
	private static void countDeg1(String[]v, int[][]a) {
		int d= 0; int D= 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				d+= a[i][j];
				D+= a[i][j];
			}
			System.out.println("Bac cua dinh "+v[i]+" la: "+d);
			d= 0;
		}
		System.out.println("Bac cua do thi la: "+D);
	}
	
	private static void countDeg2(List<String>ls) {
		int D=0;
		for (String line : ls) {
			String[] tokens= line.split("\\s+");
			System.out.println("Bac cua dinh "+tokens[0]+" la: "+(tokens.length-1));
			D+=tokens.length-1;
		}
		System.out.println("Bac cua do thi la: "+D);
	}
	
	public static void main(String[] args) {
		String[]v= {"K","H","B","D","T"};
		int[][]a= {{0,1,0,0,1},{1,0,1,1,1,},{0,1,0,0,1},{0,1,0,0,1},{1,1,1,1,0}};
		countDeg1(v, a);
		
		/*List<String> ls= new ArrayList<>();
		ls.add("K H T");
		ls.add("H K B D T");
		ls.add("B H T");
		ls.add("D H T");
		ls.add("T K H B D");
		countDeg2(ls);*/
	}
}
