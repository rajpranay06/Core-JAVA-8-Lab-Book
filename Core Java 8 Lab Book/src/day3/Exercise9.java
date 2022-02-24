package day3;

import java.time.*;
import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		LocalDate currentTime = java.time.LocalDate.now();
		
		int currentYear = currentTime.getYear();
		int currentMonth = currentTime.getMonthValue();
		int currentDate = currentTime.getDayOfMonth();
		
		String inputTime = sc.nextLine();
		
		Pattern pattern = Pattern.compile("(\\d{2})\\s(\\d{2})\\s(\\d{4})");
		Matcher matcher = pattern.matcher(inputTime);
		
		//Checking if the input date matches the pattern
		if(matcher.matches()) {
			//Splitting the input String into year month and date 
			String[] str = inputTime.split(" ");
			
			int inputYear = Integer.parseInt(str[2]);
			int inputMonth = Integer.parseInt(str[1]);
			int inputDate = Integer.parseInt(str[0]);
			
			LocalDate startDate = LocalDate.of(inputYear, inputMonth, inputDate);
			LocalDate endDate = LocalDate.of(currentYear, currentMonth, currentDate);
			
			//Using Period class to find the difference between two dates
			Period timeDiff = Period.between(startDate, endDate);
			
			System.out.println(timeDiff.getDays() + " " + timeDiff.getMonths() + " " + timeDiff.getYears());
		}
		else {
			System.out.println("Invalid Date");
		}
		
	}

}
