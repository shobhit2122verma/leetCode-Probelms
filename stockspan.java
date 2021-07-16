package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class stockspan {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int a[]=new int[n];
		a[0]=1;
		for(int i=1;i<n;i++)
		{
			int j=i-1,c=1;
			while(j>=0)
			{
				if(arr[i]>=arr[j])
				{
					c=c+a[j];
					j=j-a[j];
				}
				else
				{
					break;
				}
			}
			a[i]=c;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

//class stockspan {
//	ArrayList<Integer> arr=new ArrayList<>();
//    ArrayList<Integer> a=new ArrayList<>();
//    public stockspan() {
//      
//    }
//    
//    public int next(int price) {
//        arr.add(price);
//        int j=arr.size()-2;int c=1;
//        while(j>=0)
//        {
//        	if(price>arr.get(j))
//        	{
//        		c+=a.get(j);
//        		j=j-a.get(j);
//        	}
//        	else
//        	{
//        		j--;
//        	}
//        }
//        a.add(c);
//        return c;
//        
//    }
//    public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		stockspan obj=new stockspan();
//		System.out.println(obj.next(100));
//		System.out.println(obj.next(80));
//		System.out.println(obj.next(60));
//		System.out.println(obj.next(70));
//		System.out.println(obj.next(60));
//		System.out.println(obj.next(75));
//		System.out.println(obj.next(85));
//	}
//}