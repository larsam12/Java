
public class MyArrayList {

		private int[] arr = new int[10];
		private int size = 0;
		private int index;
		private String s;
		private int nextsize;
		private int[] arrclone = new int [arr.length];
		MyArrayList<Integer> mr = new MyArrayList<Integer>();
		MyArrayList<Integer> mr2 = new MyArrayList();
		
		public MyArrayList() {
			MyArrayList mr = new MyArrayList();
			MyArrayList mr2 = new MyArrayList();
		}
		
	    public void add(int i) {
	    	for (int a = 0; i == a; a++) {
	    		size++;
	    		int[] arr = new int [10 + size]; 		
	    	}
	    }
	    
	    public int get(int pos) {
	    	if (pos>=0 || pos<=size) {
	    	index = arr[pos];
	    	return index;
	    	} else {
	    		throw new ArrayIndexOutOfBoundsException("Feld nicht vorhanden");
	    	}
	    }
	    
	    public String toString() {
	    	s = arr.toString();
	    	return s;
	    }
	    
	    public void clear() {
	          	 	
	    } 
	    
	    public int size() {
	    	nextsize = arr.length - size;
	    	return nextsize;
	    }
	    
	    public int capacity() {
	    	return arr.length;
	    }
	    
	    public int[] clone() {
	    	arrclone = arr.clone();
	    	return arrclone;
	    }
	}


