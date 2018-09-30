import java.util.Scanner;
public class BinaryDecimalConversion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),temp=n,power=0;
		while(n!=0){
			n/=2;
			power++;
		}
		n=temp;
		int binary[]=new int[power];
		for(int i=0;i<binary.length;i++){
			binary[i]=n%2;
			n/=2;
		}
		for(int i=binary.length-1;i>=0;i--){
			n=n+binary[i]*(int)java.lang.Math.pow(2,binary.length-i-1);
		}
		for(int t:binary)
			System.out.print(t);
		System.out.println("\n"+n);
		sc.close();
	}
}
