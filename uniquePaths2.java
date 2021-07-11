package Arrays;

public class uniquePaths2 {
	public int uniquePathsWithObstacles(int[][] arr) {
        if(arr[arr.length-1][arr[0].length-1]==1||arr[0][0]==1)
        {
            return 0;
        }
        arr[0][0]=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i][0]==1)
            {
                arr[i][0]=0;
            }
            else
            {
                arr[i][0]=arr[i-1][0];
            }
        }
        for(int j=1;j<arr[0].length;j++)
        {
            if(arr[0][j]==1)
            {
                arr[0][j]=0;
            }
            else
            {
                arr[0][j]=arr[0][j-1];
            }
        }
        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[i].length;j++)
            {
                if(arr[i][j]==1)
                {
                    arr[i][j]=0;
                }
                else
                {
                    arr[i][j]=arr[i-1][j]+arr[i][j-1];
                }
            }
        }
        return arr[arr.length-1][arr[0].length-1];
    }
}
