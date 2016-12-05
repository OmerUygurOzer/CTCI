/**
 * Created by Omer on 10/29/2016.
 */
public class DynamicFibonacci {
    public int get(int n){
        if(n == 0 || n==1){return 1;}
        int[] memo = new int[n];
        memo[0] = 1;
        memo[1] = 1;
        for(int i = 2 ; i < n ; i++){
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n-1];
    }

}
