package org.sayali.service;
import java.util.*;

import org.sayali.database.studentdatabase;
import org.sayali.model.student;

public class studentservice {
	private Map<Long, student> stud1 = studentdatabase.getstudents();
	
	public List<student>  getallstudents1(){
		return new ArrayList<student>(student.values());
	}
	
	public student senddatatotpo()
	{
		return studentlist;
		
	}
	public student test()
	{
		return testdetails;
		
	}
	public student accessserviceviaemail()
	{
		return result;
		
	}
	
	public static List<student> getallstudents(){
		student s1=new student(16108197,"ABC",(float) 7.4);
		student s2=new student(16108198,"XYZ",(float) 7.0);
		List<student> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		return list;
	}

}
