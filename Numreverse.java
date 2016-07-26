package snippet;

import java.util.Scanner;

class Numreverse
{
	
	public void check()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num: ");
		int num=s.nextInt();
		//for(int i=0;i<num;i++)
		//{
			while(num!=0)
			{
			
		int num2=num%10;
		System.out.print(num2);
		 num=num/10;
		
			}
		//}
	}
	public static void main(String[] args)
	{
		
		Numreverse n=new Numreverse();
		n.check();
		
	}

}
