# Sindhukutty
import java.util.Scanner;


public class Posineg 
{
	public static void main (String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		
	//int n=-10;
	
	if(n>0)
	{
		System.out.println("+ve");
	}
	else if(n<0)
	{
		System.out.println("-ve");
	}
	}
}
