package ProblemStatements;

public class ProblemStatement14 {
	public static void main(String[] args)
	{
		int a,b,c,count=0;
		a=3;
		b=7;
		c=a*b;
		while(c>0)
		{
			if((c & 1)!=0)
				count++;
			c=c>>1;
		}
		System.out.println(count);
		
		
		
		
		
		
	}

}
