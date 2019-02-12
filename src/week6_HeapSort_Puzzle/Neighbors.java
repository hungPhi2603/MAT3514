/*package week6_HeapSort_Puzzle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Neighbors {
	public Iterable<int[][]> neighbours()
	{
	    return new Iterable<int[][]>()
	    {
	        @Override
	        public Iterator<int[][]> iterator()
	        {
	            return new Iterator<int[][]>()
	            {
	                private int position;
	                private ArrayList<Integer[][]> arrL= new ArrayList<>();
	                arrL.add();
	                int count= 0;
	                @Override
	                public boolean hasNext()
	                {
	                    for (int[][] is : arrL) {
							count++;
						}
	                    return position!= count;
	                }

	                @Override
	                public int[][] next()
	                {
	                    if (!hasNext()) throw new NoSuchElementException();
	                    return arrL.get(position++);
	                }
	            };
	        }
	    };
	}
	
	public static void main(String[] args) {
		
	}
}
*/