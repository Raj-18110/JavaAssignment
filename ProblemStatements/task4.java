package ProblemStatements;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-1,b=36,a1,b1,count=0;
		if(a<0 && b<0)
		{
			System.out.println(0);
			return;
		}
		if(a<0)
			a=0;
		a1=(int)Math.floor(Math.sqrt(a));
		b1=(int)Math.floor(Math.sqrt(b));
		for(int i=a1;i<=b1;i++)
		{
			if(i*i<=b)
				count++;
			else
				break;
			
		}
		
			
		System.out.println(count);

	}

}
