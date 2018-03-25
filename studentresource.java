package org.sayali.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sayali.model.student;
import org.sayali.service.studentservice;

@Path("/student")

public class studentresource {
	studentservice ss=new studentservice();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<student> givetTest()
	{
		return studentservice.getallstudents();
	}
		
		

}


