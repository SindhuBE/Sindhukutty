import java.util.Scanner;


public class Problem2 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length :");
		int length=s.nextInt();
		int [] a=new int[length];
		System.out.println("Enter the numbers in an array:");
		for(int i=0;i<=length;i++)
		{
		a[i]=s.nextInt();
		for(int j=1;j<=length;j++)
		{
			a[j]=s.nextInt();
			if(a[i]>a[j])
			{
				System.out.println(a[i]);
			}
			else
			{
				System.out.println(a[j]);
			}
		}System.out.println("");
		}
	}

}
