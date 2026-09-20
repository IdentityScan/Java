import java.lang.Float;

public class StringConvertFloat
{
	public static void main (String[]args)
	{
		String formatStringNumber = "35.4";
		float convertFloat = Float.parseFloat(formatStringNumber);
		
		System.out.println("Format String: " + formatStringNumber);
		System.out.println("Format Float: " + convertFloat);
		
		// And now let's sum this variable for show the String convert Float
		convertFloat += 0.5; // Output 35.9
		System.out.println(convertFloat);
	}
}
