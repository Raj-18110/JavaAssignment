package ProblemStatements;

class difference
{
	int minimum,maximum,val;

	public difference(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
		this.val=0;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	
	

}


public class Task4 {

	public static void main(String[] args) {
		int arr[]= {4,6,2,2,6,6,1},res=0;
		difference hashtest[] = new difference[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			hashtest[i]=new difference(99999, -99999);
		}
		
		
		for(int i=0;i<arr.length;i++)
		{

			if(hashtest[arr[i]-1].getMinimum()>i)
				hashtest[arr[i]-1].setMinimum(i);

			if(hashtest[arr[i]-1].getMaximum()<i)
				hashtest[arr[i]-1].setMaximum(i);
			
			res=Math.max(res, Math.abs(hashtest[arr[i]-1].getMinimum()-hashtest[arr[i]-1].getMaximum()));

			

		}


System.out.println(res);

	}

}


