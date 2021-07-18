package Arrays;

public class AddMinNUmberOfRungs {
	public int addRungs(int[] rungs, int dist) {
		 int ans=0;
		 int t=dist;
		 while(t<rungs[0]) {
			 ans=ans+1;
			 t=t+dist;
		 }
		 for(int i=1;i<rungs.length;i++) {
			int p=rungs[i]-rungs[i-1];
			if(p>dist) {
               if(p%dist==0){
				ans=ans+((p/dist)-1);
               }
               else
               {
                   ans=ans+(p/dist);
               }
			}
		 }
		 return ans;
	 }
}
