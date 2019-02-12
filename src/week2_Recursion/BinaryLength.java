/*chương trình sinh các số nhị phân có độ dài n
*/
package week2_Recursion;

public class BinaryLength {
	/*private static String binary(int n) {
		String b= "";
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 2; j++) {
				b += Integer.toString(j)+ Integer.toString(j)+ " ";
			}
		}
		return b;
	}*/
	
	
	    
	    
	
	
	private static void binary(int n, int i)
	{
		int[]a= new int [2*n];
	    for(int j=0;j<=1;j++)
	    {
	        a[i]=j;
	        if(i==n-1)   //nếu tìm đến x i cuối cùng thì xuất ra ket quả
	        	for(int x=0;x<n;x++)
	    	        System.out.println(a[x]);
	        else;
	            binary(n, i+1); // chưa tìm đến i cuối thì tăng i lên
	    }
	}
	
	
	public static void main(String[] args) {
		binary(2, 0);
		
		
	}
}
