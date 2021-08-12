package exceptionExample;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=99;
		try {
			b = 100;
			b = 50/0;
		} 
		
		catch(ArithmeticException e) {
			System.out.println("divide by zero");
		} 
		
		finally {
			System.out.println("Handled Finally");
			
		}
		System.out.println(b);
		
	//	int b = 50/0;
	}

}
