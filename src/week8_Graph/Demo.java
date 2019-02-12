package week8_Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Demo {
	static int demo(int[]a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i]>3) {
				return a[i];
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] a= {1,3,8,6,5,2};
		Stack<Integer>q= new Stack<>();
		q.push(1);
		q.push(6);
		q.push(8);
		for (Integer integer : q) {
			System.out.println(integer);
		}
		System.out.println("top:"+q.pop());
		Queue<Integer>p= new LinkedList<>();
		p.add(1);
		p.add(6);
		p.add(8);
		
		for (Integer integer : p) {
			System.out.println(integer);
		}
		System.out.println("top:"+p.remove());
		System.out.println(q);
		System.out.println(p);
		
		int[]b= new int [3];
		Arrays.fill(b, 0);
		System.out.println(Arrays.toString(b));
	}
}
