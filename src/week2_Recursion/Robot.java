//	dem so cach robot co the di den dich (n, n) xuat phat tu (i, j). chi duoc di sang phai va xuong duoi
package week2_Recursion;

public class Robot {

	public static int countPath(int i, int j, int n)
	{
		if (i < 0 || j < 0) {
			return -1;
		} else if (i == n && j == n) {
			return 1;
		} else if (i == n && j < n) {
			return countPath(i, j+1, n);
		} else if (i < n && j == n) {
			return countPath(i+1, j, n);
		} else {
			return countPath(i+1, j, n)+countPath(i, j+1, n);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(countPath(2, 1, 3));
	}
}
