package Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
public class subArraySumTok {
	//my first approach was wrong because this problem is not solved using recursion but using the prefix sum and Hashmap
	public static int subArrayCount(ArrayList < Integer > arr, int k) {
		int helper[]=new int[k+1];
        int ind=arr.get(0)%k;
        if(ind<0){
            ind=ind+k;
        }
        helper[ind]++;
        for(int i=1;i<arr.size();i++){
            arr.set(i, arr.get(i)+arr.get(i-1));
            int index=arr.get(i)%k;
            if(index<0){
                index=index+k;
            }
            helper[index]++;
        }
        int count=0;
        count=count+((helper[0]*(helper[0]-1))/2)+helper[0];
        for(int i=1;i<helper.length;i++){
            count=count+((helper[i]*(helper[i]-1))/2);
        }
        return count;
   }
}
