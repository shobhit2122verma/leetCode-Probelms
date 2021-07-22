package Arrays;

import java.util.Scanner;

public class OrdinaryNumbers {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t!=0) {
			int n=in.nextInt();
			int ans=0;
			if(n>0&&n<=9) {
				ans=n;
			}
			else
			{
				if(n>9) {
					for(int i=1;i<=9;i++) {
						long k=i;
						while(k<=n) {
							ans=ans+1;
							k=(k*10)+i;
						}
					}
				}
			}
			System.out.println(ans);
			t--;
		}
	}
}
