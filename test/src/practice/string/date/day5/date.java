package practice.string.date.day5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class date {

	public static void main(String[] args) {
		
		// aaj ka date print karega
		System.out.println(LocalDate.now());
		
		//aaj ka date 
		LocalDate date = LocalDate.now();
		
		//bitekal ka date
		LocalDate yesterday = date.minusDays(1);
		System.out.println(yesterday);
		
		//kal ka date
		LocalDate tomorrow = date.plusDays(1);
		System.out.println(tomorrow);
		
		//yes saal leap year or not
		System.out.println(LocalDate.now().isLeapYear());
		
		//ye saal leap year or not
		LocalDate dateToCheckLeapYear = LocalDate.of(2016, 1, 31);
		System.out.println(dateToCheckLeapYear.isLeapYear());

		//aaj ka date or time kya horela h
		LocalDate dateTime = LocalDate.of(2021, 10, 15);
		System.out.println(dateTime);
		LocalDateTime dateWithTime = dateTime.atTime(1, 50, 9);
		System.out.println(dateWithTime);
		
		// Get current date
		LocalDate currentDate = LocalDate.now();
		
		//date ko string m save kiya
		String strDate = currentDate.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Current date in string----" + currentDate);

		
		LocalDate cDate = LocalDate.of(2022, 07, 02);
		System.out.println("cDate in String----" + cDate.format(DateTimeFormatter.ISO_DATE));

		// Convert string into a localdate
		String dateString = "2022-02-09";
		LocalDate d1 = LocalDate.parse(dateString);
		
		//jo date di h uska day nikala
		System.out.println(d1);
		
		// Month of the date which is given 
		System.out.println(d1.getDayOfMonth());
		
		//Year of the date which is given 
		System.out.println(d1.getDayOfYear());
		
		//no of month out of 12
		System.out.println(d1.getMonthValue());
		
		//
		System.out.println(d1.getMonth());

		System.out.println("************Custom Format using Date and SimpleDateFormat*******************");
		Date dt = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		
		String strDt = formatter.format(dt);
		System.out.println(strDt);
		System.out.println("************Custom Format using LocalDate and DateTimeFormatter*******************");
		
		//Print todays date
		LocalDate d2 = LocalDate.now();
		System.out.println(d2);
		
		//Set pattern of date
		String formattedDate = d2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(formattedDate);
	}
}
