package Arrays;

import java.util.Scanner;

public class PolycrapandcoinsCF {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t!=0)
		{
			int n=in.nextInt();
			if(n%3==0) {
				System.out.println(n/3+" "+n/3);
			}
			else if(n%3==1) {
				System.out.println(((n/3)+1)+" "+n/3);
			}
			else if(n%3==2) {
				System.out.println(n/3+" "+((n/3)+1));
			}
			t--;
		}
	}
}
