package Arrays;

import java.util.Scanner;

public class DigitSumCF {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t!=0) {
			int n=in.nextInt();
			if(n%10==9) {
			System.out.println((n/10)+1);
			}
			else
			{
				if(n<9) {
					System.out.println('0');
				}
				else
				{
				int p=(n%10)+1;
				n=n-p;
				System.out.println((n/10)+1);
				}
			}
			t--;
		}
	}
}
