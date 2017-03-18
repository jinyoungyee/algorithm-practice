package ch01;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2017, 1, 31);
		Date today = new Date(cal.getTimeInMillis());
		System.out.println();
	}
}
