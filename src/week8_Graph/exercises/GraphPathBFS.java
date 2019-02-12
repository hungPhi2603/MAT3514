package week8_Graph.exercises;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hung Dec 17, 2018 11:16:12 PM
 * @aims: ton tai duong di tu u den v?
 * BFS means Breadth-First Search
 */
public class GraphPathBFS {
	static int[][]a= {{0,1,0,0,0},{1,0,1,0,0},{0,1,0,0,0},{0,0,0,0,1},{0,0,0,1,0}};
	static boolean[]visited= new boolean[a.length];
	static Queue<Integer> q= new LinkedList<>();
	static boolean reachable(int u, int v) {
		bfs(u);
		if(visited[v])
			return true;
		else return false;
	}
	
	private static void bfs(int u) {
		q.add(u);
		//visit(u);
		visited[u]=true;
		while (!q.isEmpty()) {
			int w= q.remove();
			for (int v = 0; v < a.length; v++) {
				if (!visited[v] && a[w][v]==1) {
					q.add(v);
					//visit(v);
					visited[v]=true;
				}
			}
		}
	}
	
	private static void visit(int u) {
		System.out.printf("%3d", u);
	}

	public static void main(String[] args) {
		//bfs(0);
		if(reachable(3, 4))
			System.out.println("Co duong di");
		else System.out.println("Khong co duong");
	}
}
