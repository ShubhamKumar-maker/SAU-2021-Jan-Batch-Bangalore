package secondquestion;

public class execptionhandling {
	
	static void eligibleForVote(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible for Vote");
		}
		else
		{
			System.out.println("Eligible for Vote");
		}
		
	
	}
	
	static void student() throws ArithmeticException
	{
		int num=1000/0;
	}
	
	

	public static void main(String[] args) {
		
		//Throw
		try {
		eligibleForVote(10);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		
		//throws
		try {
			
				student();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

		

	}

}
