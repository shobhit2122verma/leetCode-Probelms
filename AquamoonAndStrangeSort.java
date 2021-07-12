package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AquamoonAndStrangeSort {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t!=0) {
		int n=in.nextInt();
		int a[]=new int[n];
		HashMap<Integer,Integer> mapeven=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> mapodd=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
			if(i%2==0) {
				if(mapeven.containsKey(a[i])) {
					mapeven.replace(a[i],mapeven.get(a[i])+1);
				}
				else
				{
					mapeven.put(a[i], 1);
				}
			}
			else
			{
				if(mapodd.containsKey(a[i])) {
					mapodd.replace(a[i],mapodd.get(a[i])+1);
				}
				else
				{
					mapodd.put(a[i], 1);
				}
			}
		}
		int arr[]=a;
		int flag=0;
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				if(mapeven.containsKey(arr[i]))
				{
				int value=mapeven.get(arr[i])-1;
				if(value==0) {
					mapeven.remove(arr[i]);
				}
				else
				{
					mapeven.replace(arr[i], value);
				}
				}
				else
				{
					flag=1;
					break;
				}
			}
			else
			{
				if(mapodd.containsKey(arr[i]))
				{
				int value=mapodd.get(arr[i])-1;
				if(value==0) {
					mapodd.remove(arr[i]);
				}
				else
				{
					mapodd.replace(arr[i], value);
				}
				}
				else
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
		{
		if(mapeven.size()!=0||mapodd.size()!=0) {
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
		}
		else
		{
			System.out.println("NO");
		}
		t--;
		}
	}

}
