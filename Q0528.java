package bolum05.questions;

import java.util.Date;
import java.util.Scanner;

public class Q0528 {

	public static void main(String[] args) {
		Scanner user = new Scanner (System.in);
		Date date = new Date();
		System.out.print("Enter a year :");
		int year = user.nextInt();
		System.out.print("Enter the first day of the year (1 if Monday,..,7 if Sunday) :");
		int day = user.nextInt();
		 boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		 String dayInMonth =getDay(day);
		 if(isLeapYear == true){
			 System.out.printf("%s 1st, %d is %s\n","January",year,getDay(day) );
			 System.out.printf("%s 1st, %d is %s\n","February",year,getDay((day+31)%7) );
			 System.out.printf("%s 1st, %d is %s\n","March",year,getDay((day +60) %7 ));
			 System.out.printf("%s 1st, %d is %s\n","April",year,getDay((day+91)%7) );
			 System.out.printf("%s 1st, %d is %s\n","May",year,getDay((day+121)%7)) ;
			 System.out.printf("%s 1st, %d is %s\n","June",year,getDay((day+152)%7) );
			 System.out.printf("%s 1st, %d is %s\n","July",year,getDay((day+182)%7));
			 System.out.printf("%s 1st, %d is %s\n","August",year,getDay((day+213)%7) );
			 System.out.printf("%s 1st, %d is %s\n","September",year,getDay((day+244)%7) );
			 System.out.printf("%s 1st, %d is %s\n","October",year,getDay((day+274)%7) );
			 System.out.printf("%s 1st, %d is %s\n","November",year,getDay((day+305)%7));
			 System.out.printf("%s 1st, %d is %s\n","December",year,getDay((day+335)%7) );
		 }else {
			 System.out.printf("%s 1st, %d is %s\n","January",year,getDay(day) );
			 System.out.printf("%s 1st, %d is %s\n","February",year,getDay((day+31)%7) );
			 System.out.printf("%s 1st, %d is %s\n","March",year,getDay((day +59) %7 ));
			 System.out.printf("%s 1st, %d is %s\n","April",year,getDay((day+90)%7) );
			 System.out.printf("%s 1st, %d is %s\n","May",year,getDay((day+120)%7)) ;
			 System.out.printf("%s 1st, %d is %s\n","June",year,getDay((day+151)%7) );
			 System.out.printf("%s 1st, %d is %s\n","July",year,getDay((day+181)%7));
			 System.out.printf("%s 1st, %d is %s\n","August",year,getDay((day+212)%7) );
			 System.out.printf("%s 1st, %d is %s\n","September",year,getDay((day+243)%7) );
			 System.out.printf("%s 1st, %d is %s\n","October",year,getDay((day+273)%7) );
			 System.out.printf("%s 1st, %d is %s\n","November",year,getDay((day+304)%7));
			 System.out.printf("%s 1st, %d is %s\n","December",year,getDay((day+334)%7) );
		 }
	}

	public static String getDay(int day) {
		switch(day){
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		case 0:
			return "Sunday";
		}
		return "";
	}

}
