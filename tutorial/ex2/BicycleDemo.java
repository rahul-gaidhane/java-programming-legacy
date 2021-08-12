class BicycleDemo {
	public static void main(String[] args) {
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		bike1.changeCadence(100);
		bike1.changeGear(5);
		bike1.speedUp(30);
		bike1.printStates();
	}
}
