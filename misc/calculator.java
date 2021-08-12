interface operation {
	void add();
	void sub();
	void multi();
	void div();
}

class impoperation implements operation
{
	int oper1;
	int oper2;
	public void add() {
	System.out.println("Addition is "+(oper1+oper2));
	}
	public void sub() {
	System.out.println("subtraction is "+(oper1-oper2));
	}
	public void multi() {
	System.out.println("Multipilcation is "+(oper1*oper2));
	}
	public void div() {
	System.out.println("Division is "+(oper1/oper2));
	}
}

class Calculator {
	public static void main(String[] args)
	{
		impoperation c1 = new impoperation();
		c1.oper1 = 10;
		c1.oper2 = 15;
		c1.add();
		c1.sub();
		c1.multi();
		c1.div();
	}
}		 
