package Arrays;
 import java.util.ArrayList;
public class SumOfInfiniteArray {
	    public static ArrayList<Integer> sumInRanges(int[] arr, int n, ArrayList<ArrayList<Integer>> queries, int q) {
	        ArrayList<Integer> ans=new ArrayList<Integer>();
	        while(q!=0){
	            long sum=0;
	            int j=0;
	            for(int i=0;i<queries.size();i++){
	            	int l=queries.get(i).get(0);
	            	int k=queries.get(i).get(1);
	            	k=l-k;
	            	j=l%n-1;
	            	for(int p=0;p<k;p++) {
	            		if(j==n) {
	            			j=0;
	            		}
	            		sum=sum+arr[j];
	            		j++;
	            	}
	            }
	            ans.add((int)((sum)%(Math.pow(10,9)+7)));
	            q--;
	        }
	        return ans;
	    }
	
}
