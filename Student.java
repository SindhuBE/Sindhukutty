package Problem1;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		int n;
		int days;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n value:");
		n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			int n1=(2*n)-1;
			for(int j=0;j<=n1;j++)
				
			{
				if(n1!=0)
				{
					System.out.println("True");
				}
				else
				{
					System.out.println("False");
				}
			}
		}
		
	}

}
