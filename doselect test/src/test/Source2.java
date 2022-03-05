package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

class Mobile{
		
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
	
	ArrayList<String> list=new ArrayList<String>();
		
	Scanner ob = new Scanner(System.in);
	
		
		      public String addMobile(String company, String model)
		       {
				   return "model successfully added";
			   }

		      public ArrayList<String> getModels(String company){
		    	ArrayList<String> list = new ArrayList<String>();
		  		return list;
				  }
		         
		     public String buyMobile(String company, String model){
		         
		    	 return "mobile sold successfully";
				 }
}
public class Source2 {
	public static void main(String args[] ) throws Exception {

//		list.
		Scanner ob = new Scanner(System.in);
		String company = ob.nextLine();
		String model = ob.nextLine();
		
		Mobile obj = new Mobile();
		obj.addMobile(company, model);
		obj.getModels(company);
		obj.buyMobile(company,model);

	}
	}