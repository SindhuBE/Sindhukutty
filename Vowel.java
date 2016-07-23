import java.util.Scanner;


public class Vowel
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enthe the character");
		String c=s.nextLine();
		switch(c)
		{
		case "a":
			System.out.println("a vowel");
			break;
		case "e":
			System.out.println("e vowel");
			break;
		case "i":
			System.out.println("i vowel");
			break;
		case "o":
			System.out.println("o vowel");
			break;
		case "u":
			System.out.println("u vowel");
			break;
			default :
				System.out.println("consonunt");
			
			
			
			
		}
		
	}

}
