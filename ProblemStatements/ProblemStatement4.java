package ProblemStatements;
import  java.util.HashMap; 
public class ProblemStatement4 {

	public static void main(String[] args) {
		int arr[]= {1,1,1,1,50,50,50};
		int a;
		HashMap<Integer,Integer> m = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{

			if(!m.containsKey(arr[i]))
				m.put(arr[i], 1);

			else
			{
				a=m.get(arr[i])+1;
				m.put(arr[i], a);
			}
		}
		int max=0,leader=0;
		for(int key:m.keySet())
		{
			if(max<m.get(key))
			{max=m.get(key);
			leader=key;}
		}
		if(max>arr.length/2)
			System.out.println(leader);
		else
			System.out.println(-1);
		
		
		







	}

}
