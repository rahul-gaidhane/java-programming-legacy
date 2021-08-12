package checkintstream;

import java.util.stream.IntStream;

public class CheckIntStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream myStream = IntStream.range(0, 50);
		
		myStream.map(i -> i*2).boxed().forEach(System.out::println);

	}

}
