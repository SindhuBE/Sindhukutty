import java.util.Scanner;


public class Oddeven
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num");
		int n=s.nextInt();
		
		if(n%2==0)
		{
			System.out.println("even");
		}
		else if(n%2!=0)
		{
			System.out.println("odd");
		}
	}

}
