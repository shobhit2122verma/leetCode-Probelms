package Arrays;

public class MaximumNumberofWordsYouCanType {

	public int canBeTypedWords(String text, String brokenLetters) {
        String s=text+" ";
        int ans=0;
        String w="";
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<brokenLetters.length();i++) {
        	b[brokenLetters.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)!=' ') {
        		w=w+s.charAt(i);
        		a[s.charAt(i)-'a']++;
        	}
        	else
        	{
        		int flag=0;
        		for(int k=0;k<26;k++) {
        			if(b[k]!=0&&a[k]!=0) {
        				flag=1;
        				break;
        			}
        		}
        		if(flag!=1) {
        			ans=ans+1;
        		}
        		w="";
        		a=new int[26];
        	}
        }
        return ans;
    }
}
