import java.util.Scanner;
public class Shapes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.print("\n");
			for(int j=0;j<i;j++)
				System.out.print(i);
		}
		System.out.print("\n \n");
		for(int i=n;i>0;i--){
			System.out.print("\n");
			for(int j=0;j<i;j++)
				System.out.print(i);
		}
		sc.close();
	}
}
