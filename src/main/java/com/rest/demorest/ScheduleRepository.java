package com.rest.demorest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ScheduleRepository 
{
	List<Person> personList;
	List<Appointment> apptList;
	
	public ScheduleRepository()
	{
		//Add a list of Doctors
		personList = new ArrayList<>();
		Person p1 = new Person();
		p1.setFirstName("Tony");
		p1.setLastName("Briar");
		p1.setId(101);	

		Person p2 = new Person();
		p2.setFirstName("Jeff");
		p2.setLastName("Cunningham");
		p2.setId(102);
				
		personList.add(p1);
		personList.add(p2);
		
		//Add a list of Appointments
		apptList = new ArrayList<>();
		Appointment a1 = new Appointment();
		LocalDate d = LocalDate.of(2022, 5, 15);
		a1.setId(200);
		a1.setDate(LocalDate.now());
		a1.setStartTime(d.atTime(9,0));
		a1.setPerson(p1);
		a1.setType("New Patient");
		
		Appointment a2 = new Appointment();
		LocalDate d2 = LocalDate.of(2022, 5, 15);
		a2.setId(201);
		a2.setDate(LocalDate.now());
		a2.setStartTime(d2.atTime(10,30));
		a2.setPerson(p1);
		a2.setType("Follow-up");
		
		Appointment a3 = new Appointment();
		LocalDate d3 = LocalDate.of(2022, 5, 15);
		a3.setId(201);
		a3.setDate(LocalDate.now());
		a3.setStartTime(d3.atTime(11,0));
		a3.setPerson(p2);
		a3.setType("New Patient");
		
		Appointment a4 = new Appointment();
		LocalDate d4 = LocalDate.of(2022, 5, 15);
		a3.setId(201);
		a3.setDate(LocalDate.now());
		a3.setStartTime(d4.atTime(11,30));
		a3.setPerson(p2);
		a3.setType("New Patient");
		
		apptList.add(a1);
		apptList.add(a2);
		apptList.add(a3);
		apptList.add(a4);
	}
	
	public List<Person> getAllDoctors()
	{
		return personList;
	}
	

	public Appointment getAppointment(int apptId)
	{
				
		for (Appointment p: apptList)
			if(p.getId() == apptId)
			{
				return p;
			}
			
		return null;
	}
	
	public List<Appointment> getAppointments(int id)
	{
		List<Appointment> appts = new ArrayList<>();
		
		for (Appointment p: apptList)
			if(p.getPerson().getId() == id)
			{
				appts.add(p);
			}
			
		return appts;
	}
		
	
	public void createAppointment(Appointment a1) {
		apptList.add(a1);
		
	}
	
	public void deleteAppointment(int apptId)
	{

		for (Appointment p: apptList)
			if(p.getId() == apptId && p != null)
			{
				apptList.remove(p);
			}
		
		System.out.println("deletedAppointment");
	}
}

