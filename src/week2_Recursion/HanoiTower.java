/*Chương trình mô tả cách chuyển đĩa trong bài toán tháp Hà Nội
*/	
package week2_Recursion;

public class HanoiTower {
	private static void move(char a, char b, char c, int n) {
		if (n==1) {
			System.out.println(a + " -> " + c);
		} else {
			move(a, c, b, n-1);
			move(a, b, c, 1);
			move(b, a, c, n-1);
			//chuyen n-1 dia 
		}
	}
	
	public static void main(String[] args) {
		move('A', 'B', 'C', 3);
	}
}
