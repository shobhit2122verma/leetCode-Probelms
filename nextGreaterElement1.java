package Arrays;

import java.util.Scanner;

public class nextGreaterElement1 {
	public static String maximumNumber(String num, int[] change) {
		char ans[]=num.toCharArray();
        for(int i=0;i<num.length();i++) {
        	int max=num.charAt(i)-'0';
        	int changed=change[max];
        	if(changed>max) {
        		while(i<num.length()&&(num.charAt(i)-'0'<=change[num.charAt(i)-'0']))
        		{
        			ans[i]=(char)(change[num.charAt(i)-'0']+'0');
        			i++;
        		}
        		break;
        	}
        }
        return ans.toString();
    }
//	public static String maximumNumber(String num, int[] change) { 
//        char[] chars = num.toCharArray();
//        for(int i = 0; i < chars.length; i++) {
//            int currDigit = chars[i] - '0';
//            if(currDigit < change[currDigit]) {
//                while(i < chars.length && (chars[i] - '0' <= change[chars[i] - '0'])) {
//                    chars[i] =  (char)(change[chars[i] - '0'] + '0');
//                    i++;
//                }
//                break;
//            }
//        }
//        return String.valueOf(chars);
//    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String nums=in.next();
		int a[]=new int[10];
		for(int i=0;i<10;i++) {
			a[i]=in.nextInt();
		}
		System.out.println(maximumNumber(nums, a));
	}
}
