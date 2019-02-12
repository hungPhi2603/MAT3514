package week8_Graph.exercises;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author hung Dec 18, 2018 2:09:32 AM
 * @aims: find sortest path from u to v on unweighted graph
 */
public class SortestPathUnweighted {
	static int[][]a= {{0,1,1,0,0,0},{1,0,0,0,1,0},{1,0,0,1,0,0},{0,0,1,0,1,1},{0,1,0,1,0,1},{0,0,0,1,1,0}};
	static int[]d= new int[a.length];
	Queue<Integer>q= new LinkedList<>();
	Stack<Integer>s= new Stack<>();
	
	public SortestPathUnweighted() {
		// TODO Auto-generated constructor stub
	}
	
	Stack<Integer> findPath(int u, int v) {
		//(BFS) indexing nodes from u to v
		q.add(u);
		while (!q.isEmpty() || d[v]==0) {
			int w=q.remove();
			for (int i = 0; i < a.length; i++) {
				if(d[i]==0 && a[w][i]==1) {
					d[i]= d[w]+1;
					q.add(i);
				}
			}
		}
		//push nodes (on the path) to a stack
		s.push(v);
		int temp= v;
		for (int j = d[v]-1; j > 0; j--) {
			for (int i = 0; i < a.length; i++) {
				if(d[i]==j && a[temp][i]==1) {
					temp=i;
					s.push(i);
					break;
				}
			}
		}
		s.push(u);
		return s;
	}
	
	public static void main(String[] args) {
		Arrays.fill(d, 0);
		SortestPathUnweighted sp= new SortestPathUnweighted();
		Stack<Integer>s= sp.findPath(5, 0);
		while (!s.isEmpty()) {
			System.out.printf("%3d",s.pop());
		}
	}
}
