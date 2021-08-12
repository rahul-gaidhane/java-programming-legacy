package classloader;

public class TestClassLoader extends LoadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoadClass myClass = new LoadClass();
		myClass.loadMyClass("classloader.SayHelloWorld", "myMethod");
	}

}
