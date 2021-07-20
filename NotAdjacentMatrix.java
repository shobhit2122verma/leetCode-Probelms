package Arrays;

import java.util.Scanner;

public class NotAdjacentMatrix {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t!=0) {
			int n=in.nextInt();
			if(n==2) {
				System.out.println("-1");
			}
			else
			{
				int a[][]=new int[n][n];
				int k=1,p=3;
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if((i+j)%2==0) {
							a[i][j]=k;
							k+=1;
						}
					}
				}
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if((i+j)%2!=0) {
							a[i][j]=k;
							k+=1;
						}
					}
				}
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
			}
			t--;
		}
	}
}
