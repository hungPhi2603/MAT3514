/*Chương trình tính n!, n!! theo CT:
	n!= n*(n-1)*(n-2)....*1;
	n!!= 1*3*5*...*n với n lẻ
		 2*4*6*...*n với n chẵn;

*/
package week2_Recursion;

public class Fractorial {
	private static long factorial(int  a) {
		if (a <= 0) {
			return 1;
		}
		return a * factorial(a-1);
	}
	
	private static long doubleFactorial(int a) {
		if (a < 1) {
			//System.out.println("Nhap so > 0");
			return 1;
		} else {
			return a * doubleFactorial(a-2);
		}
	}
	
	//in dung de quy
	static private void print(int a) {
		if (a > 0) {
			print(a-1);
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(8));
		System.out.println(doubleFactorial(11));
		//print(4);
	}
}
