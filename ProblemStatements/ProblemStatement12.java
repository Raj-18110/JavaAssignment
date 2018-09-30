package ProblemStatements;

public class ProblemStatement12 {

	public static void main(String[] args) {
		String str="a0aa";
		int maxlength=0,capital=0,count=0,flag=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				if(maxlength<count && capital==1)
					{maxlength=count;
					flag=1;}
				
				count=0;
				capital=0;
			}
			
			else
			{
				count++;
				if(str.charAt(i)>='A' && str.charAt(i)<='Z')
					capital=1;
			}
			
		}
		if(maxlength<count && capital==1)
			maxlength=count;
		
		if(flag==0 && capital==0)
		{
			System.out.println(-1);
			return;
		}
		System.out.println(maxlength);

	}

}
