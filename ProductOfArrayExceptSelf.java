package Arrays;

public class ProductOfArrayExceptSelf {

	public static int[] getProductArrayExceptSelf(int[] arr) {
        int product=1,flag=0;
    	for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                flag++;
            } 
            else
            {
                product=product*arr[i];
            }
        }
        if(flag==1){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    arr[i]=product;
                }
                else
                {
                    arr[i]=0;
                }
            }
            return arr;
        }
        else if(flag==0){
            for(int i=0;i<arr.length;i++){
                arr[i]=product/arr[i];
            }
            return arr;
        }
        else
        {
            for(int i=0;i<arr.length;i++){
                arr[i]=0;
            }
            return arr;
        }
    }
}
