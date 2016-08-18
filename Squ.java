
public class Square {
	public static void Sqa(int[]a,int[]b,int[]c,int[]d)
	{
		int i=0;
	
		if(a[i]+a[i+1]==b[i]+b[i+1])
		{
			System.out.println("Square");
		}
		else if(b[i]+b[i+1]==c[i]+c[i+1])
		{
			System.out.println("square");
		}
		else if(c[i]+c[i+1]==d[i]+d[i+1])
		{
			System.out.println("square");
		}
		else if(d[i]+d[i+1]==a[i]+a[i+1])
		{
			System.out.println("square");
		}
		else
		{
			System.out.println("not square");
		}
		
		
	}

	
	public static void main(String[] args) {
		Square s=new Square();
		int [] e={10,10};
		int [] f={10,20};
		int [] g={20,20};
		int [] h={20,10};
		s.Sqa(e, f, g, h);

	}

}
