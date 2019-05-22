package pro.matthewmoore.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class DateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date.toString());
		Scanner dateIn = new Scanner(System.in);
		SimpleDateFormat simpleDate = new SimpleDateFormat("MM-dd-yyyy");
		
		/*
		System.out.println("Please enter one date: ");
		String userDate1 = dateIn.nextLine();
		System.out.println("Please enter another date: ");
		String userDate2 = dateIn.nextLine();
		
		try {
			Date newUserDate1 = simpleDate.parse(userDate1);
			Date newUserDate2 = simpleDate.parse(userDate2);
			
			if (newUserDate1.before(newUserDate2)) {
				System.out.println("Date 1 is before Date 2");
			} else {
				System.out.println("Date 1 is not before Date 2");
			}	
		} catch (ParseException e) {
			System.out.println("There was a parsing error.");
		}
		*/
		
		Date userDate3 = new Date(11-15-2013);
		System.out.println("3rd Date: " + userDate3);
		
		LocalDate userDate4 = LocalDate.parse("2019-05-21");
		System.out.println("4th Date: " + userDate4);
		
		//LocalDate userDate5 = new LocalDate(2019, 5, 21);
		//System.out.println("5th Date: " + userDate5);
		
		LocalDate userDate6 = LocalDate.of(2019, 5, 21);
		System.out.println("6th Date: " + userDate6);
		
		LocalDate userDate7 = userDate6.plusDays(7);
		System.out.println("7th Date: " + userDate7);
		
		LocalDate userDate8 = userDate6.minusDays(7);
		System.out.println("8th Date: " + userDate8);
	}
}