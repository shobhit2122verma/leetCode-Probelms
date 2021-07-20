package Arrays;

import java.util.Scanner;

public class DoNotBeDistractedCF {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t!=0) {
			int n=in.nextInt();
			String s=in.next();
			int a[]=new int[26];
			a[s.charAt(0)-'A']++;
			int flag=0;
			for(int i=1;i<s.length();i++) {
				if(a[s.charAt(i)-'A']!=0) {
					if(s.charAt(i)!=s.charAt(i-1)) {
						flag=1;
						break;
					}
					else {
						a[s.charAt(i)-'A']++;
					}
				}
				else
				{
					a[s.charAt(i)-'A']++;
				}
			}
			if(flag==1) {
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
			t--;
		}
	}
}
