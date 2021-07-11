package Arrays;

public class Containerwithmostwater {

	public int maxArea(int[] height) {
        int i=0,j=height.length-1;
		int maxheight=Integer.MIN_VALUE;
		while(i<j) {
			int h=0;
			if(height[i]==height[j]) {
				h=height[i]*(j-i);
				i++;
			}
			else if(height[i]<height[j]) {
				h=Math.min(height[i], height[j])*(j-i);
				i++;
			}
			else
			{
				h=Math.min(height[i], height[j])*(j-i);
				j--;
			}
			if(maxheight<h) {
				maxheight=h;
			}
		}
		return maxheight;
    }
}
