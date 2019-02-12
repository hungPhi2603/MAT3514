/*ma tran m x k
xuat phat tai [1, t] va [1, t+1]
xuat phat tai [1, t] thi chi di sang trai hoac xuong duoi den dich la [m, 1]
xuat phat tai [1, t+1] thi chi di sang phai hoac xuong duoi den dich la [m, k]*/		

package week2_Recursion;

public class Robot2 {
	public static int countPath(int m, int k, int t)
	{
		t--;
		int[][] a = new int[m][k];
		for (int i=0;i<m;i++)
			for (int j=0;j<k;j++)
				if (j==0 || i==m-1 || j==k-1) a[i][j] = 1;
		for (int i=m-2; i>=0; i--)
			for (int j=1; j<=t; j++)
				a[i][j] = a[i+1][j] + a[i][j-1];
		for (int i=m-2; i>=0; i--)
			for (int j=k-2; j>=t+1; j--)
				a[i][j] = a[i+1][j] + a[i][j+1];
//		for (int i=0;i<m;i++) {
//			for (int j=0;j<k;j++)
//				System.out.print(a[i][j] + " ");
//			System.out.println();
//		}
			
				
		
		return a[0][t] + a[0][t+1];
	}
	
	public static void main(String[] args) {
		System.out.println(countPath(3,3,1));
	}
}