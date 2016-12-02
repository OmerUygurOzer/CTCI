/**
 * Created by Omer on 11/30/2016.
 */
public class PowXN {
    public double myPow(double x, int n) {
        if(n==0){return 1;}
        if(x==0){return 0;}

        if(n % 2 == 0){
            return myPow(x * x , n / 2);
        }else{
            return (n > 0 ? x : 1.0D/x) * myPow(x * x ,n / 2);
        }
    }

}
