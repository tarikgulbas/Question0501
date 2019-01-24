package bolum05.questions;

public class Q0506 {

	public static void main(String[] args) {
		final double MILES_TO_KILOMETERS = 1.609;
		System.out.printf("%s%5s%s%5s|%5s%s%5s%s\n","Kilograms"," ","Pounds"," "," ","Pounds"," ","Kilograms");
		for (int i = 1; i <= 10; i ++) {
			System.out.printf("%-9d%5s",i," ");
			System.out.printf("%-6.3f%5s|",MILES_TO_KILOMETERS * (i)," ");
			System.out.printf("%5s%-9d%5s"," ",15+ 5 *( i )," ");
			System.out.printf("%-6.3f\n",(15+ 5 *( i )) /MILES_TO_KILOMETERS);
			
	}
	}
}
