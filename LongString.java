
public class LongString
{
	public static void main(String[] args)
	{
		String str="wipro technology";
		//int length=str.length;
		//for(int i=0;i<length;i++)
		//{
		String[] s=str.split(" ");
		if(s[0].length()>s[1].length())
		{
			System.out.println("the string is:" + s[0]);
		}
		else
		{
			System.out.println(s[1]);
		}
		//}
		
	}

}
