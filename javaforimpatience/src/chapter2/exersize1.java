package chapter2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class exersize1 {

	/*
	 * Change the calendar printing program so it starts the week 
	 * on a Sunday. 
	 * Also make it print a newline at the end (but only one).
	 */
	public static void main(String[] args)
	{  
		LocalDate date = LocalDate.now().withDayOfMonth(1);
		int month;
		
		if (args.length >= 2) {        
			month = Integer.parseInt(args[0]);
			int year = Integer.parseInt(args[1]);
			date = LocalDate.of(year, month, 1);
		} else {
			month = date.getMonthValue();
		}
    
	    System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	   
	    DayOfWeek weekday = date.getDayOfWeek();
	    
	    int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
	    
	    
	    for (int i = 0; i < value; i++) 
	        System.out.print("    ");
	    
	    while (date.getMonthValue() == month) {
	        System.out.printf("%4d", date.getDayOfMonth());
	        date = date.plusDays(1);
	       
	        //Set new line when day reaches sunday.
	        if (date.getDayOfWeek().getValue() == 7) 
	            System.out.println();
	    }
	    
	    if (date.getDayOfWeek().getValue() != 0) 
	       System.out.println();
			
		}
}
