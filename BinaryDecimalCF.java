package Arrays;

import java.util.Scanner;

public class BinaryDecimalCF {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t!=0) {
			 int n=in.nextInt();
			 int maxva=Integer.MIN_VALUE;
			 while(n!=0) {
				 if(n%10>=maxva) {
					 maxva=n%10;
				 }
				 n=n/10;
			 }
			 if(maxva>1) {
				 int ans=1+(maxva-1);
				 System.out.println(ans);
			 }
			 else
			 {
				 System.out.println(1);
			 }
			t--;
		}
	}
}
