package week8_Graph.exercises;

import java.util.Arrays;

/**
 * @author hung Dec 8, 2018 4:40:14 PM
 * @aims: ton tai duong di tu u den v?
 * DFS means Depth-First Search
 */

public class GraphPathDFS {
	//static String[] x= {"A","B","C","D","E","F"};
	static int[][]a= {{0,1,0,0,0},{1,0,1,0,0},{0,1,0,0,0},{0,0,0,0,1},{0,0,0,1,0}};
	static boolean[]visited= new boolean[a.length];
	static boolean reachable(int u, int v) {
		dfs(u);
		if(visited[v])
			return true;
		else return false;
	}
	//DFS function aims to find all reachable nodes from node u
	private static void dfs(int u) {
		int v;
		//visit(u);
		visited[u]=true;
		for (v = 0; v < a.length; v++) {
			if (visited[v]==false && a[u][v]==1) {
				dfs(v);
			}
		}

	}
	private static void visit(int u) {
		System.out.printf("%3d", u);
	}
	public static void main(String[] args) {
		if(reachable(0, 2))
			System.out.println("Co duong di");
		else System.out.println("Khong co duong di");
	}
}
