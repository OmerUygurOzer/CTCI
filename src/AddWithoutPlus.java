/**
 * Created by Omer on 12/10/2016.
 */
public class AddWithoutPlus {
    //CTCI
    public int addWithoutPlus(int a,int b){
        if(b==0){return a;}
        int result = 0;
        int sum  =  a ^ b;
        int carry = (a & b) << 1;
        return addWithoutPlus(sum,carry);
    }
}
