public class EvenOddPalindromeArmstrong {
	public static void main(String[] args) {
		int low=1,high=100,i;
		int temp,sum,remainder,reverse,flag=0,even=0,odd=0,prime=0,armstrong=0,palindrome=0;		
		for(i=low; i<=high; i++){
			for(int  j=2; j<i; j++){
				if(i % j == 0) {
                    flag = 0;
                    break;
                }
                else
                    flag = 1;
            }
			if(flag==1)
				prime++;
			}
		for(i=low;i<=high;i++){
			if(i%2!=0)
				even++;
			if(i%2==0)
				odd++;
			temp=i;
			sum = 0;
			while(temp!=0){
				remainder=temp % 10;
				temp=temp/10;
				sum=sum+(remainder*remainder*remainder);
			}
			if(sum==i)
				armstrong++;
			temp=i;
			reverse=0;
			while(temp!=0){
				remainder=temp%10;
				temp=temp/10;
				reverse=reverse*10+remainder;
			}
			if(i==reverse)
				palindrome++;
		}
		System.out.println("Number of \neven numbers : "+even+"\nOdd numbers : "+odd+"\nPrime numbers  :"+prime+"\nArmstrong numbers :"+armstrong+"\nPalindrome numbers : "+palindrome);;
	}
}
