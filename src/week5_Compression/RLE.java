package week5_Compression;

/**
 * @author Phuong LE-HONG
 * <p>
 * Jan 25, 2015, 2:58:23 PM
 * <p>
 * The RLE algorithm to compress data.
 *
 */
public class RLE {
	
	/**
	 * Computes the length of the compression array.
	 * @param t a binary array
	 * @return an integer.
	 */
	public static int length(int[] t) {
		// TODO: Your code here
		if (t.length == 0) {
			return 0;
		}
		int x= t[0];
		int count= 1;
		for (int i = 0; i < t.length; i++) {
			if (x != t[i]) {
				count++;
				x= t[i];
			}
		}
		return count*2;
	}

	/**
	 * Compresses an array in RLE format and return the result.
	 * @param t
	 * @return compressed array.
	 */
	public static int[] compress(int[] t) {
		// TODO: Your code here
		/*int temp = t[0];
		int[] a = null;
		int id= 0;
		int count= 0;
		for (int i = 0; i < t.length; i++) {
			if (temp== t[i]) {
				count++;
			} else {
				a[id]= temp;
				a[id+1]= count;
				temp= t[i];
				count= 1;
			}
		}
		id = 0;
		for (int i = 0; i < t.length; i= i+2) {
			for (int x = 0; x < t[i+1]; x++) {
				a[id]= t[i];
				id++;
			}
		}
		return null;*/
		
		if (t.length == 0) {
			return new int[0];
		}
		int [] a= new int [length(t)];
		int temp= a[0];
		int count= 0;
		int id= 0;
		for (int i = 0; i < t.length; i++) {
			if (i!= t.length-1) {
				if (temp == t[i]) {
					count ++;
				} else {
					a[id]= temp;
					a[id+1]= count;
					temp= t[i];
					count= 1;
					id= id+2;
				}
			} else {
				if (t[t.length-2]==t[t.length-1]) {
					count++;
					a[id]= temp;
					a[id+1]= count;
				} else {
					a[id]= t[i];
					a[id+1]= 1;
				}
			}
			
		}
		
		
		return a;
		
		/*if (t.length == 0) return new int[0];
		int[] res = new int[length(t)];
		int j = 0;
		int begin = 0;
		int end = 0;
		for (int i=begin;i<t.length-1;i++) {
			if (t[i] != t[i+1] || i==t.length-2) {
				end = i;
				res[j++] = t[i];
				res[j++] = end - begin + 1;
				begin = i+1;
			}
		}
		if (t[t.length-1] != t[t.length-2]) {
			res[j++] = t[t.length-1];
			res[j++] = 1;
		}
		else 
			res[j-1] += 1;
		int[] temp = new int[j];
		for (int i =0; i<j;i++)
			temp[i] = res[i];
		return temp; */
	}

	/**
	 * Computes the length of the decompressed array.
	 * @param t
	 * @return an integer.
	 */
	public static int lengthInverse(int[] t) {
		// TODO: Your code here
		return 0;
	}
	
	/**
	 * Decompresses the array.
	 * @param t
	 * @return an array
	 */
	public static int[] decompress(int[] t) {
		return null;
	}
}
