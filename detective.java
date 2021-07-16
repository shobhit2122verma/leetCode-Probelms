package Arrays;

import java.util.Scanner;

public class detective {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
		int arr1[]=new int[n];
		for(int i=1;i<arr.length;i++)
		{
			arr1[arr[i]-1]+=1;
		}
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==0)
			{
				System.out.print(i+1+" ");
			}
		}
	}
}
