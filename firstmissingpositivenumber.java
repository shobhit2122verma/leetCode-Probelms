package Arrays;

public class firstmissingpositivenumber {

	public int firstMissingPositive(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len;i++) {
        	if(nums[i]<=0) {
        		nums[i]=len+1;
        	}
        }
        for(int i=0;i<len;i++) {
        	int j=Math.abs(nums[i])-1;
        	if(j<=len-1) {
        		if(nums[j]>0) {
        			nums[j]=-nums[j];
        		}
                else
                    continue;
        	}
        }
        int i=1;
        for(i=1;i<len+1;i++) {
        	if(nums[i-1]>0||i-1>=len) {
        		return i;
        	}
            else 
                continue;
        }
        return i;
    }
}
