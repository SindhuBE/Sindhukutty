import java.util.Scanner;


public class Problem3 {
public static void main(String[] args) {
	int num = 0;
	int n=num;
	int num1 = 0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the num : ");
	num=s.nextInt();
	int count = 0;
	 while(n!=0)
	 {
		 n=n%10;
		 
			 count++;
		 
		 for(int i=0;i<=count;i++)
		 {
			num1=num*num%10;
			num=num/10;
			
		 }
		 
		 
	 }System.out.println(num1);
	 
}
}
