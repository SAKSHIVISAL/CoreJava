package com.edubridge.datetimeapi;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalZoneDateTimeDemo {

	public static void main(String[] args) {
		
		ZonedDateTime z=ZonedDateTime.now();
		System.out.println(z);
		
		
	   OffsetTime o=OffsetTime.now();
	   System.out.println(o);
	   
	   
	   OffsetDateTime o1=OffsetDateTime.now();
	   System.out.println(o1);
	   
	   ZoneId i=ZoneId.of("Asia/Calcutta");
	   System.out.println(i);
	   
	   ZoneOffset z1=ZoneOffset.ofHoursMinutes(12, 20);
	   System.out.println(z1);
	   
	   String s="2024-02-14 01:07";
	   DateTimeFormatter tr= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	   LocalDateTime y1=LocalDateTime.parse(s ,tr);
	   System.out.println(y1);
	   

	}

}
