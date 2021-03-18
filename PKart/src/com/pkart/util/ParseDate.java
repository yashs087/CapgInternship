package com.pkart.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseDate {
	
	public ParseDate() {}
	
	public LocalDate parseDate(String date){
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return LocalDate.parse(date, formatter);
	}
}
