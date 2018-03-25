package org.sayali.model;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class company {
	
	private long id;
	private String name;
	private float package1;
	
	public company()
	{
		
	}
	public company(long id,String name,float package1)
	{
		this.id=id;
		this.name=name;
		this.package1=package1;
	}
	
	public long getID()
	{
		return id;
	}
	public void setID(long id)
	{
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public float getpackage1()
	{
		return package1;
	}
	public void setpointer(float package1)
	{
		this.package1=package1;
	}
}

