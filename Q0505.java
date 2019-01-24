package bolum05.questions;

public class Q0505 {

	public static void main(String[] args) {
		final double KG_TO_POUND = 2.2;
		System.out.printf("%s%5s%s%5s|%5s%s%5s%s\n","Kilograms"," ","Pounds"," "," ","Pounds"," ","Kilograms");
		for (int i = 1; i < 200; i =i+2) {
			System.out.printf("%-9d%5s",i," ");
			System.out.printf("%-6.3f%5s|",KG_TO_POUND * (i)," ");
			System.out.printf("%5s%-9d%5s"," ",15+ 5 *( i /2 + i %2)," ");
			System.out.printf("%-6.3f\n",(15+ 5 *( i /2 + i %2)) /KG_TO_POUND);
			
		}
	}

}
