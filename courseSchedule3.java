package Arrays;

import java.util.Scanner;

public class courseSchedule3 {

	public static int scheduleCourse(int[][] courses) {
		int work=0;
        return helper(courses,work,0);
    }
	public static int helper(int arr[][],int work,int i)
	{
		if(i==arr.length)
		{
			return 0;
		}
		if(i==arr.length-1)
		{
			work=work+arr[i][0];
			if(work<=arr[i][1])
			{
				return 1;
			}
			return 0;
		}
		int ans1=0, ans2=0;
		if(work+arr[i][0]<=arr[i][1])
		{
			ans1=1+helper(arr,work+arr[i][0],i+1);
		}
//		else
//		{
			ans2=helper(arr,work,i+1);
//		}
		return Math.max(ans1, ans2);
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[][]=new int[n][2];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		System.out.println(scheduleCourse(arr));
	}
}
