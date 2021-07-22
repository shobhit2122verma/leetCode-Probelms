package Arrays;

public class CountTriples {

	public static int countTriples(int n) {
        int ans=0;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		long t=(i*i)+(j*j);
        		String k=""+Math.sqrt(t);
        		int flag=0;
        		for(int p=0;p<k.length();p++) {
        			if(k.charAt(p)=='.'&&k.charAt(p+1)=='0') {
        				flag=1;
        				break;
        			}
        		}
        		if(flag==1) {
        			int s=(int)Math.sqrt(t);
        			if(s<=n) {
        				ans=ans+1;
        			}
        		}
        	}
        }
        return ans;
    }
}
