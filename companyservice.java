package org.sayali.service;

import java.util.ArrayList;
import java.util.List;

import org.sayali.model.company;

public class companyservice {
	
	public static List<company> getallstudents(){
		company c1=new company(1610,"JPMorgan",(float) 7.4);
		company c2=new company(1611,"BOA",(float) 7.8);
		List<company> list=new ArrayList<>();
		list.add(c1);
		list.add(c2);
		return list;
	}


}
