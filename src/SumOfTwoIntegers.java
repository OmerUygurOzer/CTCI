/**
 * Created by Omer on 12/23/2016.
 */
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        if(b == 0) {return a;}
        int sumWithoutCarry = a ^ b;
        int carry = (a & b) << 1;
        return getSum(sumWithoutCarry,carry);
    }
}
