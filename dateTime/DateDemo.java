import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

class DateDemo {
	public static void main(String[] args) {
		Instant t1 = Instant.now();
		LocalDateTime t2 = LocalDateTime.now();
		ZonedDateTime t3 = ZonedDateTime.now();

		System.out.println("Instant : " + t1);
		System.out.println("LocalDateTime : " +  t2);
		System.out.println("ZonedDateTime : " + t3);	
	}
}

