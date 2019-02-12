package week8_Graph.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphRepresentation {
	private static void present1(String[]v, int[][]a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a[0].length; j++) {
				if (a[i][j] == 1) {
					System.out.print(v[j]);
					System.out.println(v[i]);
				}
			}
		}
	}
	
	private static void present2(List<String>l) {
		System.out.print("  ");
		String s="";
		
		//in ra cac dinh
		for (String string : l) {
			s = s+ Character.toString(string.charAt(0))+" ";
		}
		System.out.println(s);
		String[] verdex= s.split("\\s");	//tap hop cac dinh
		
		for (String string : l) {
			//in ra cac dinh
			System.out.print(string.charAt(0)+" ");
			//in ra ma tran
			for (int j = 0; j < verdex.length; j++) {
				if (string.substring(1).contains(verdex[j])) {	//neu chuoi ke tu ky tu 1 co chua ten dinh
					System.out.print("1 ");
				} else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//cho ma tran ke, in ra cac canh
		String[]v= {"K","H","B","D","T"};
		int[][]a= {{0,1,0,0,1},{1,0,1,1,1,},{0,1,0,0,1},{0,1,0,0,1},{1,1,1,1,0}};
		//present1(v, a);
		
		//cho danh sach ke, in ra ma tran ke
		List<String> ls= new ArrayList<>();
		ls.add("K H T");
		ls.add("H K B D T");
		ls.add("B H T");
		ls.add("D H T");
		ls.add("T K H B D");
		/*ls.add("R N H");
		ls.add("N T R");
		ls.add("H T G R");
		ls.add("T A H N");
		ls.add("G A H");
		ls.add("A T G");*/
		present2(ls);
	}
}
