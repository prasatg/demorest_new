package com.rest.demorest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Appointment {
	public int getId() {
		return id;
	}
	public void setId(int d) {
		this.id = d;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime localDateTime) {
		this.startTime = localDateTime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	private int id;
	private LocalDate date;
	private LocalDateTime startTime;
	private String type;
	private Person person;
	

}
