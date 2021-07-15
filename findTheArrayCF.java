package Arrays;
import java.util.*;
public class findTheArrayCF {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t!=0) {
		int s=in.nextInt();
		System.out.println((int)Math.ceil(Math.sqrt(s)));
		t--;
		}
	}
}
