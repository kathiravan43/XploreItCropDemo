package Xplore;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

public class Date_Functions {

	public static void main(String[] args) {
	LocalDate localDate =LocalDate.now();
	LocalDate yesterDate = localDate.minusDays(1);
	LocalDate tromrrow = localDate.plusDays(2);
	System.out.println(localDate);
	System.out.println(yesterDate);
	System.out.println(tromrrow);
	// manually ---------------------------
	
	LocalDate date = LocalDate.of(2024, 10, 9);
	LocalDateTime timedate = date.atTime(7, 38);
	
	System.out.println(timedate);
	
	//formatting -------------------------------------------//
	
	LocalDateTime localDateTime = LocalDateTime.now();
	System.out.println("Before formatting : "+localDateTime);
	
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
	String formatString = localDateTime.format(dateTimeFormatter);
	System.out.println(formatString);
	
	// month 
	System.out.println("-----------Month modules----------");
	MonthDay month = MonthDay.now();
	LocalDate date1 = month.atYear(2023);
	System.out.println(date1);
	
	}

}
