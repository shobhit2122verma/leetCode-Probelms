package Arrays;
import java.util.*;
public class maximumCostDeletionCF {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t!=0) {
			 int n = in.nextInt();
             int a = in.nextInt();
             int b = in.nextInt();
             String s = in.next();
			
			int c = 1;
			int ans = 0;
			
			for (int i = 0; i < n - 1; i++) {
				if (s.charAt(i) != s.charAt(i + 1))
				     c++;
			}
			
			if (b >= 0) {
			     ans = n * (a + b);
			}
			else {
		          ans = (n * a) + (((c/ 2) + 1) * b);
			}
			System.out.println(ans);
			t--;
		}
	}
}
