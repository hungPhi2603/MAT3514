package week6_HeapSort_Puzzle;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HeapIO {
	public static InsertHeap read(String path) {
		try {
			List<String> lines= Files.readAllLines(Paths.get(path));
			int n= Integer.parseInt(lines.get(0));
			int[] heap= new int[n];
			String[] tokens=lines.get(1).split("\\s+");
			for (int i = 0; i < n; i++) {
				heap[i]= Integer.parseInt(tokens[i]);
			}
			InsertHeap ih= new InsertHeap(n, heap);
			return ih;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
