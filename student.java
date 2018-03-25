package org.sayali.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class student {
	

		private long id;
		private String name;
		private float pointer;
		
		public student()
		{
			
		}
		public student(long id,String name,float pointer)
		{
			this.id=id;
			this.name=name;
			this.pointer=pointer;
		}
		
		public long getID()
		{
			return id;
		}
		public void srtID(long id)
		{
			this.id=id;
		}
		public String getname()
		{
			return name;
		}
		public float getpointer()
		{
			return pointer;
		}
		public void setpointer(float pointer)
		{
			this.pointer=pointer;
		}
}
