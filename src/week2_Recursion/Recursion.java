package week2_Recursion;



public class Recursion {
	
	public static int gt(int n){
		
		if(n == 0)
			return 1;
		else
			return n * gt(n-1);
	}
	
	public static int gtk(int n){
		if( n == 2 || n == 1)
			return n;
		else
			return n*gtk(n-2);
	}
	
	public static int fibo_recu(int n)
	{
		if( n < 2)
			return n;
		else
			return fibo_recu(n-1)+ fibo_recu(n-2);
	}
	
	
	public static void binary_array(int a[], int n, int i)
	{
		if( i == n )
		{
			for(int j = 0 ; j < n ; j++)
				System.out.print(a[j]);
			System.out.println();
		}
		else
		{
			for(int t = 0 ; t < 2 ; t++)
			{
				a[i] = t;
				binary_array(a, n, i+1);
			}
		}
	}
	
	
	
	public static void binary_array(int n)
	{
		int[] a = new int[n];
		binary_array(a,n,0);
	}
	
	
	public static void subset(int[] b,int a[], int n, int i)
	{
		if( i == n )
		{
			System.out.print("{");
			for(int j = 0 ; j < n ; j++)
				if(a[j] == 1)
					System.out.print(b[j]+"; ");
			System.out.print("}");
			
			System.out.println();
		}
		else
		{
			for(int t = 0 ; t < 2 ; t++)
			{
				a[i] = t;
				subset(b, a, n, i+1);
			}
		}
	}
	
	
	
	public static void subset(int[] b)
	{
		int n = b.length;				
		int[] a = new int[n];
		subset(b,a,n,0);
	}
	
	
	public static int fibo_iter(int n)
	{
		if(n < 2)
			return n;
		else
		{
			int f0 = 0, f1 = 1, fn=0;
			for(int i = 2; i <= n; i++)
			{
				fn = f0+f1;
				f0 = f1;
				f1 =fn;
			}
			
			return fn;
		}
	}
	
	
	public static void main(String[] args) {
		int[] b = {1,2,3,4,5};
		binary_array(3);
	}
	

}


