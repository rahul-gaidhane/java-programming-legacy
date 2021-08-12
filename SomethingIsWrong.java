class Rectangle {
	int width;
	int height;
	Rectangle(int wd, int ht) {
		width = wd;
		height = ht;
	}
	int area() {
		return height * width;
	}
}

class SomethingIsWrong {
	public static void main(String[] args) {
		Rectangle myRect;
		myRect.width = 10;
		myRect.height = 15;
		System.out.println("myRect's area is "+myRect.area());
	}
}
