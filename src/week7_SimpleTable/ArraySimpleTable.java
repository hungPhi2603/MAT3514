package week7_SimpleTable;

public class ArraySimpleTable<Key extends Comparable<Key>, Value> extends AbstractSimpleTable<Key, Value> {
	private int n;
	private Key[] keys;
	private Value[] values;
	
	@Override
	public void put(Key key, Value value) {
		for (int i = 0; i < keys.length; i++) {
			if(keys[i]==key)
				values[i]= value;
			else {
				n++;
				keys[n-1]=key;
				values[n-1]=value;
			}
		}
	}

	@Override
	public Value get(Key key) {
		if (isEmpty()) {
			return null;
		} else {
			for (int i = 0; i < keys.length; i++) {
				if(keys[i]==key)
					return values[i];
			}
			return null;	
		}
	}


	@Override
	public Iterable<Key> keys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		
		return n;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}

		
	private void show() {
		System.out.println(n);
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			System.out.println(keys[i]+" => "+values[i]);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		ArraySimpleTable<Integer, String> a= new ArraySimpleTable<>();
		a.put(1, "A");
		a.show();
		
	}
}
