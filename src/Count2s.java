/**
 * Created by Omer on 12/11/2016.
 */
public class Count2s {
    //CTCI
    public int countTwos(int n){
        int result = 0;

        int len = String.valueOf(n).length();

        for(int i = 0; i <len; i++){
            result +=helper(n,i);
        }

        return result;
    }

    private int helper(int val,int digit){
        int powerOf = (int)Math.pow(10,digit);
        int next    = powerOf * 10;
        int right   = val % powerOf;


        int roundDown = val - val % next;
        int roundUp   = roundDown + next;

        int d = (val / powerOf) % 10;

        if(d < 2){
            return roundDown / 10;
        }else if(d == 2){
            return roundDown / 10 + right + 1;
        }else{
            return roundUp / 10;
        }

    }
}
