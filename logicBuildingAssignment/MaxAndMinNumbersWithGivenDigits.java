public class MaxAndMinNumbersWithGivenDigits {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt(),temp=num,digitCount=0,max=0,min=0,zeros=0;
		while(num!=0){
			num/=10;
			digitCount++;
		}
		num=temp;
		int digitArray[]=new int[digitCount];
		for(int i=0;i<digitArray.length;i++){
			digitArray[i]=num%10;
			if(num%10==0)
				zeros++;
			num/=10;
		}
		Arrays.sort(digitArray);
		for(int i=digitArray.length-1;i>=0;i--){
			max=max*10+digitArray[i];
			if(min>0 ||digitArray[digitArray.length-i-1]>0)
				min=min*10+digitArray[digitArray.length-i-1];
			if(zeros>0&&i==digitArray.length-zeros-1)
				min*=java.lang.Math.pow(10,zeros);

		}
		System.out.println("Minimum Number is "+min+"\nMaximum Number is "+max);
		sc.close();
	}
}
