public class factory {
	   //use getPlan method to get object of type Plan   
	public calculator getcalculator(String calculationType){  
        if(calculationType == null){  
         return null;  
        }  
      if(calculationType.equalsIgnoreCase("BASIC")) {  
             return new basic();  
           }   
       else if(calculationType.equalsIgnoreCase("ALGEBRIC")){  
            return new algebric();  
        }   
      else if(calculationType.equalsIgnoreCase("GEOMETRIC")) {  
            return new geometric();  
      }  
  return null;  
}  
}