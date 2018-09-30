package ProblemStatements;
import java.util.Arrays;
public class Prob1 {

	public static void main(String[] args) {

		int arr1[]= {8,9,5};
		int n=arr1.length,i,swapcount=0;
		int arr2[]=new int[n];
		for(i=0;i<n;i++)
			arr2[i]=arr1[i];

		Arrays.sort(arr2);

		for(i=0;i<n;i++)
		{

			if(arr1[i]!=arr2[i])
				swapcount++;

			if(swapcount>2)
				break;

		}

		if(swapcount==0 || swapcount==2)
			System.out.println("True");
		else
			System.out.println("False");







	}

}
