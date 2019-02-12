/*	Chương trình tính số Fib theo CT
	F(n)= n với n< 2
		= F(n-1) + F(n-2) với n >= 2  
*/
package week2_Recursion;

public class Fibonacci {
	private static long fibonacci(int a) {
		if (a < 0) {
			return -1;
		}
		
		if (a < 2) {
			return a;
		}
		return fibonacci(a-1) + fibonacci(a-2);
	}
	
	//khong de quy
	static private void fibonacci2(int a) {
		int x= 0, y= 1;
		int f= a;
		for (int i = 2; i <= a; i++) {
			f= x + y;
			x= y;
			y=f;
		}
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		System.out.println(fibonacci(3));
		fibonacci2(2);
	}
}
