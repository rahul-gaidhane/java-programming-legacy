public class DataStructure {
	private final static int SIZE = 15;
	private int[] arrayOfInts = new int[SIZE];

	DataStructure() {
		//filling array with consective integer values
		for(int i = 0; i < SIZE; i++) {
			arrayOfInts[i] = i;
		}
	}
	
	interface DataStructureIterator extends java.util.Iterator<Integer> { }
	
	class EvenIterator implements DataStructureIterator {
		private int currentIndex = 0;
	
		public Integer next() {
			Integer element = Integer.valueOf(arrayOfInts[currentIndex]);
			currentIndex += 2;
			return element;  
		}
		
		public boolean hasNext() {
			return currentIndex <= SIZE;
		}
	}	
	
	void printEven() {
		DataStructureIterator iterator = this.new EvenIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next()+" ");	
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		DataStructure Numbers = new DataStructure();
		Numbers.printEven();
	}
}
