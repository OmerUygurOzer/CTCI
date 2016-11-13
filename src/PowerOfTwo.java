/**
 * Created by Omer on 11/12/2016.
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n==0){return false;}
        return helper(n)==1;
    }

    private long helper(long n){
        if(n==1){return n;}
        double num = n;
        double divF = num/2;
        long   div  = Math.round(num/2);
        if(divF==div){
            return helper(div);
        }
        return n;
    }

}
