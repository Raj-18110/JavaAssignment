package ProblemStatements;

public class Task3 {

	public static void main(String[] args) {
		int arr[]= {5,2,4,6,0,3,7};
		int firstmin=99999,secondmin=99999;
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]<secondmin)
			{
				if(arr[i]<firstmin)
				{
					secondmin=firstmin;
					firstmin=arr[i];
				}
				else
					secondmin=arr[i];
				
				
			}
			
		}
		
System.out.println(firstmin+secondmin);
	}

}
