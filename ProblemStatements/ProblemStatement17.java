package ProblemStatements;
import java.util.Arrays;
public class ProblemStatement17 {

	public static void main(String[] args) {
		int arr[]= {3,5,6,3,3,5,3,3},key=arr[0],res=0,count=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				count++;
				
			}
			else
			{
				res=res+(count*(count-1)/2);
				key=arr[i];
				count=1;
				
				
			}
			
		}
		System.out.println(res);
		
		// TODO Auto-generated method stub

	}

}
