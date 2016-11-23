/**
 * Created by Omer on 11/22/2016.
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {

        if(m<=0 || n<=0){return 0;}

        int[] memo = new int[n];
        memo[0] = 1;

        for (int i = 0; i<m;i++){
            for (int j = 1; j<n; j++){
                memo[j] = memo[j]+memo[j-1];
            }
        }

        return memo[n-1];
    }
}
