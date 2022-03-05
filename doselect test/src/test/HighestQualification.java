package test;

import java.io.PrintStream;

class CompanyJobRepository{
	
		static String getJobPrediction(int age ,String highestQualification)
		{
			
	try
	{
		if (age <19)
		{
			throw new NotEligibleException("you are underage for any job");
		}	
		
		else if (age>=21 && highestQualification.equals("B.E")==true)
		{
			return "We have opening for junior developers";
		}
		
		else if (age>=26 && highestQualification.equals("M.S")==true||highestQualification.equals("phd")==true)
		{
			return "We have opening for Senior developers";
		}
		
		else if (age>=19 && (highestQualification.equals("M.S")==false || highestQualification.equals("phd")==false
				|| highestQualification.equals("B.E")==false))
		{
			throw new NotEligibleException("We do not have any job that matches with your qualification");
		}
		
		else
		{
			return "Sorry we have no openings for now";
		}
	}
	catch(NotEligibleException e)
	{
		System.out.println(e);
	}
	return highestQualification;
}	
}

public class HighestQualification  {
		
	static String searchForJob(int age , String highestQualification) throws NotEligibleException{
		
		if(age>=200 || age<=0){
			throw new NotEligibleException("The age entered in not typical for human being");
		}
		else{
			return CompanyJobRepository.getJobPrediction(age,highestQualification);
		}
}
		
		public static void main(String args[])
		{
			
			try {
			System.out.println(searchForJob(28,"M.S"));
		
				System.out.println(searchForJob(28,"bcom"));
			} catch (NotEligibleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}
}

class NotEligibleException extends Exception
{
	public NotEligibleException(String string) {
	}
}




		