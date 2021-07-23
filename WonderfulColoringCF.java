package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class WonderfulColoringCF {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t!=0) {
			String s=in.next();
			int a[]=new int[26];
			for(int i=0;i<s.length();i++) {
				a[s.charAt(i)-'a']++;
			}
			HashMap<Character,Integer> map=new HashMap<>();
			map.put('r', 0);
			map.put('g', 0);
			for(int i=0;i<a.length;i++) {
				if(a[i]!=0) {
					if(a[i]>1) {
					for(int j=1;j<=2;j++) {
						if(map.get('r')==map.get('g')){
								map.put('r',map.get('r')+1);
						}
						else if(map.get('r')>map.get('g'))
						{
							map.put('g',map.get('g')+1);
						}
					}
					}
					else
					{
						if(map.get('r')==map.get('g')){
							map.put('r',map.get('r')+1);
						}
						else if(map.get('r')>map.get('g'))
						{
							map.put('g',map.get('g')+1);
						}
					}
				}
			}
			if(s.length()==1) {
				System.out.println('0');
			}
			else
			{
				if(map.get('r')!=map.get('g')) {
					System.out.println(map.get('r')-1);
				}
				else
				{
					System.out.println(map.get('r'));
				}
			}
			t--;
		}
	}
}
