package Arrays;

public class nearedExitFromEntranceInMaze {
	public static int nearestExit(char[][] maze, int[] entrance) {
        int dp[][]=new int[maze.length][maze[0].length];
        for(int i=0;i<maze.length;i++) {
        	for(int j=0;j<maze[i].length;j++) {
        		if(maze[i][j]=='+') {
        			dp[i][j]=Integer.MAX_VALUE;
        		}
        		else
        		{
        			if(i+1>=maze.length||j+1>=maze[0].length) {
        				dp[i][j]=0;
        			}
        			else if(i-1<0||j-1<0) {
        				dp[i][j]=0;
        			}
        			else
        			{
        				int a1=dp[i-1][j];
        				int a2=dp[i+1][j];
        				int a3=dp[i][j-1];
        				int a4=dp[i][j+1];
        				dp[i][j]=Math.min(Math.min(a1, a2),Math.min(a3, a4));
        				if(dp[i][j]!=Integer.MAX_VALUE) {
        					dp[i][j]=dp[i][j]+1;
        				}
        				else
        				{
        					dp[i][j]=0;
        				}
        			}
        		}
        	}
        }
        int ans=dp[entrance[0]][entrance[1]];
        if(ans==0) {
        	int i=entrance[0];
        	int j=entrance[1];
        	if(i==0&&i+1<maze.length) {
        		ans=dp[i+1][j];
        	}
        	else if(i==maze.length&&i-1>=0) {
        		ans=dp[i-1][j];
        	}
        	else if(j==0&&j+1<maze[0].length) {
        		ans=dp[i][j+1];
        	}
        	else if(j==maze[0].length&&j-1>=0) {
        		ans=dp[i][j-1];
        	}
        	if(ans==Integer.MAX_VALUE||ans==0) {
        		return -1;
        	}
        	return ans+1;
        }
        return ans;
        
    }
}
