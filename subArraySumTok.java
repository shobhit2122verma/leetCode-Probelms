package Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
public class subArraySumTok {
	//my first approach was wrong because this problem is not solved using recursion but using the prefix sum and Hashmap
	public static int subArrayCount(ArrayList < Integer > arr, int k) {
		HashMap<Integer,Integer> map=new HashMap<>(); 
		int prefixsum=0;
		int count=0;
		for(int i=0;i<arr.size();i++) {
			prefixsum=prefixsum+arr.get(i);
			arr.set(i, prefixsum);
		}
		for(int i=0;i<arr.size();i++) {
			int key=arr.get(i)%k;
			if(key<0) {
				key=key+k;
			}
			if(map.containsKey(key)) {
				map.put(key,map.get(key)+1);
			}
			else
			{
				map.put(key, 1);
			}
		}
		Set<Integer> keys=map.keySet();
		for(int i:keys) {
			if(i==0) {
				int value=map.get(i);
				count=count+((value*(value-1))/2)+value;
			}
			else
			{
				int value=map.get(i);
				count=count+((value*(value-1))/2);
			}
		}
		return count;
   }
}
