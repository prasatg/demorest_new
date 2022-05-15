package com.rest.demorest;

import java.util.List;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("schedules")
public class AppointmentScheduler
{
	ScheduleRepository repo = new ScheduleRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getAllDoctors()
	{
		return repo.getAllDoctors();
	}

	@GET
	@Path("getschedule/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Appointment getAppointmentById(@PathParam("id") int apptId)
	{
		return repo.getAppointment(apptId);
	}
	
	@GET
	@Path("getschedules/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Appointment> getAppointmentsById(@PathParam("id") int id)
	{
		//not working yet
		return repo.getAppointments(id);
	}
	
	
	@POST
	@Path("addschedule")
	public Appointment addAppointment(Appointment a1)
	{
		repo.createAppointment(a1);
		return a1;
	}
	
	@DELETE
	@Path("deleteschedule/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void deleteAppointment(@PathParam("id") int apptId)
	{
		repo.deleteAppointment(apptId);
		
	}
}

