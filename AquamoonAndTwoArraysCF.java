package Arrays;
import java.util.*;
public class AquamoonAndTwoArraysCF {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t!=0) {
		int n=in.nextInt();
		int a1[]=new int[n];
		int a2[]=new int[n];
		int sum1=0,sum2=0;
		for(int i=0;i<a1.length;i++) {
			a1[i]=in.nextInt();
			sum1=sum1+a1[i];
		}
		for(int j=0;j<a2.length;j++) {
			a2[j]=in.nextInt();
			sum2=sum2+a2[j];
		}
		ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
		if(sum1==sum2) {
			for(int i=0;i<n-1;i++) {
				while(a1[i]!=a2[i]) {
					if(a1[i]>a2[i]) {
						for(int j=i+1;j<n;j++) {
							if(a1[j]<a2[j]) {
								ArrayList<Integer> a=new ArrayList<Integer>();
								a.add(i+1);
								a.add(j+1);
								a1[j]+=1;
								a1[i]-=1;
								arr.add(a);
								break;
							}
						}
					}
					else
					{
						for(int j=i+1;j<n;j++) {
							if(a1[j]>a2[j]) {
								ArrayList<Integer> a=new ArrayList<Integer>();
								a.add(j+1);
								a.add(i+1);
								a1[j]-=1;
								a1[i]+=1;
								arr.add(a);
								break;
							}
						}
					}
				}
			}
			if(arr.size()==0) {
				System.out.println("0");
			}
			else
			{
				System.out.println(arr.size());
				for(ArrayList<Integer> List:arr) {
					System.out.println(List.get(0)+" "+List.get(1));
				}
			}
		}
		else
		{
			System.out.println("-1");
		}
		t--;
		}
	}
}
