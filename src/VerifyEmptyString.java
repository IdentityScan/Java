import java.lang.String;

public class VerifyEmptyString
{
	public static void main (String[]args)
	{
		String verifyEmpty = " ";
		if (verifyEmpty.isBlank())
		{
			System.out.println("Is empty.");
		} else 
		{
			System.out.println("No, is filled");
		}
	}
}
