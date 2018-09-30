package ProblemStatements;

public class ProblemStatement5 {
	public static void main(String[] args) {

		String s="(()))(())";
		int i=0,count=0;
		StringBuilder str = new StringBuilder();
		str.append(s);
		while(i<str.length())
		{
			
			if(str.charAt(i)=='(')
			{
				if(i+1<str.length() && str.charAt(i+1)==')')
				{
					str.delete(i,i+1);
					count=count+2;
					if(i>0)
					i=i-1;
					else
						i=0;
					
					
				}
				else
					i++;
			}
			else
				i++;
			}
		System.out.println(count);


	}

}
