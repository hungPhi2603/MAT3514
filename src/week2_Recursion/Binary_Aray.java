package week2_Recursion;

public class Binary_Aray {
	private static void binary_array(int[]a, int n, int i) {
		int count= 0;
		if (i == n) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[j]);
			}
			System.out.println();
		} else {
			for (int j = 0; j < 2; j++) {
				a[i]= j;
				binary_array(a, n, i+1);
			}
		}
				
	}
	
	private static void binary_array(int n) {
		int[] a= new int[n];
		binary_array(a, n, 0);
	}
	
	public static void main(String[] args) {
		binary_array(3);
		
	}
}
