public class RectanglePlusDemo {
	public static void main(String[] args) {
		RectanglePlus r1 = new RectanglePlus(10,20);
		RectanglePlus r2 = new RectanglePlus(5,4);
		
		int result = r1.isLargerThan(r2);
		if (result == 1) {
			System.out.println("r1 is larger than r2");
		}
		else if (result == -1) {
			System.out.println("r2 is larger than r1");
		}
		else {
			System.out.println("r1 and r2 are equal");
		}
	}
} 
