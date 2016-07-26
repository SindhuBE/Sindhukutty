import java.util.Scanner;


public class Getnum1
{
public static void main(String[] args) 
	{
	int num2 = 0;
	int a=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num : ");
		int num=s.nextInt();
		
		int length=String.valueOf(num).length();
		//int length1=Integer.parseInt(length);
		//for(int i=0;i<length;i++)
		//{
		int n=num;
			while(num!=0)
			{
		 num2=n%10;
		 System.out.println(num2);
		  int num=num*num2;
		  System.out.println(num);
		n=n/10;
				//}
		}
	}

}
