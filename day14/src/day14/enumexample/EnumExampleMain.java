package day14.enumexample;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Locale;

public class EnumExampleMain {

	public enum Flowers {MARIOGOLD, LILY , MOGRA , JASMINE , ROSES};
	public enum WEEKDAYS {MONDAY ,TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ,SATURDAY,SUNDAY};
	public static void main (String args[]) {
		for(Flowers f: Flowers.values()) {
			System.out.println(f);
		}
		System.out.println("The value of SUNDAY is "+WEEKDAYS.valueOf("SUNDAY"));
		System.out.println("The value of MONDAY is "+WEEKDAYS.valueOf("MONDAY").ordinal());
		LocalDate localdate = LocalDate.now();
		System.out.println(localdate);
		System.out.println(localdate.getDayOfWeek());
		System.out.println(localdate.getDayOfWeek().getValue());
		for (WEEKDAYS weekday:WEEKDAYS.values()){
			
			if(localdate.getDayOfWeek().name().equals(weekday.name()))
			{
				System.out.println("Hey lol its Sunday");
			}
			else 
			{
				System.out.println("Check your logic");
			}	
			
			
//		if(localdate.getDayOfWeek().getValue() == WEEKDAYS.valueOf("SUNDAY").ordinal())
//		{
//			System.out.println("Hellol its Sunday");
//		}
//		else 
//		{
//			System.out.println("Check your logic");
//		}
		}
	}
}