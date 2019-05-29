
public class CreateOwnErrorHandling {

	public static void main(String[] args)
	{
		int i,j,k;
		
		i = 4;
		j = 6;
		
		try 
		{
			k = i/j;
			if(k == 0)
				throw new JackException("This division cannot be applicable");  	//Calling throw the exception created by user
			System.out.println(k);
		}
		catch(JackException e)
		{
			System.out.println("Error " + e.getMessage());
		}
	}

}
