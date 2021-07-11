package Arrays;
import java.util.ArrayList;
public class XorQuery {

	public static ArrayList<Integer> xorQuery(ArrayList<ArrayList<Integer>> queries) {

		ArrayList<Integer> ans=new ArrayList<Integer>();
		for(ArrayList<Integer> q:queries) {
			int a=q.get(0);
			int b=q.get(1);
			if(a==1) {
				ans.add(b);
			}
			else
			{
				for(int i=0;i<ans.size();i++) {
					ans.set(i,ans.get(i)^b);
				}
			}
		}
		return ans;
	}
}
