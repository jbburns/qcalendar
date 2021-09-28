package com.f3birmingham.qcalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(QcalendarApplication.class, args);
	}

}

//TODO
//calendars" : [ {
//		"aoId" : 1,  <--- Get this to be a HATEOAS thing (object + link)?
//		"workoutDate" : "2021-09-24",
//		"ghostQ" : false,
//		"qid" : 1,