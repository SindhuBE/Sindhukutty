import java.util.Scanner;
public class Greatest 
{
public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=s.nextInt();
		System.out.println("Enter the value of b: ");
		int b=s.nextInt();
		System.out.println("Enter the value of c: ");
		int c=s.nextInt();
		if( a>b || b>c && a<c )
		{
			System.out.println("a is greater");
		}
		else
		{
			System.out.println("b is greater");
		}
		
s.close();
	}

}
