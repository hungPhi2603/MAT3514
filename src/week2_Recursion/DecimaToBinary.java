package week2_Recursion;

public class DecimaToBinary {
	/*private static long toBinary(int a) {
		int n;
		if(a == 0) {
			return 0;
		} else {
			n= a % 2;
		}
		return toBinary(a/2) * 10 + n;
	}*/
	
	private static String toBinary(int a) {
		String b= "";
		if (a == 0) {
			return "";
		} else {
			b = Integer.toString(a % 2);
		}
		return toBinary(a/2)+b;
	}
	
	public static void main(String[] args) {
		System.out.println(toBinary(10));
	}
}
