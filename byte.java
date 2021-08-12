//impo 
class Bite {
	public static void main(String[] args) 
	{
		byte bb = -65;
		String s = "-100";
		Byte b1 = new Byte((byte)-65);
		Byte b2 = new Byte(s);
		int b3 = b1.intValue();
		System.out.println("bb = "+bb);
		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
		System.out.println("b3 = "+b3);
	}
}
