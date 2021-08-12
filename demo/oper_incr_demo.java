class Oper_incr_demo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		int d = a+++b+a; 
		System.out.println("a+++b+a = "+d);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
}
