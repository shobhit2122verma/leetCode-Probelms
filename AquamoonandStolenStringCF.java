package Arrays;

import java.util.Scanner;

public class AquamoonandStolenStringCF {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t!=0) {
		int n=in.nextInt();
		int l=in.nextInt();
		char a[][]=new char[(2*n)-1][l];
		for(int i=0;i<a.length;i++) {
			String s=in.next();
			for(int j=0;j<l;j++) {
				a[i][j]=s.charAt(j);
			}
		}
		String ans="";
		for(int j=0;j<l;j++) {
			int arr[]=new int[26];
			for(int i=0;i<a.length;i++) {
				arr[a[i][j]-97]++;
			}
			for(int i=0;i<26;i++) {
				if(arr[i]%2!=0) {
					ans=ans+(char)(i+97);
				}
			}
		}
		System.out.println(ans);
		System.out.flush();
		t--;
		}
	}
}
