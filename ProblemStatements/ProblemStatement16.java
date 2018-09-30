package ProblemStatements;

public class ProblemStatement16 {

	public static void main(String[] args) {
		//int n=955;
		String s="abracadabracadabra";
		/*while(n>0)
		{

			s=s+(n%2);
			n=n/2;


		}*/
		StringBuilder str=new StringBuilder();
		str.append(s);
		//str.reverse();
		//System.out.println(str);
		int size=str.length()/2,flag=0;
		while(size>0) {
			for(int i=0;i<(str.length()-size);i++)
			{
				if(str.charAt(i)!=str.charAt(i+size))
				{
					flag=1;
					break;

				}

			}
			if(flag==0)
			{
				System.out.println(size);
				return;
			}
			flag=0;
			size--;
		}


		// TODO Auto-generated method stub

	}

}
