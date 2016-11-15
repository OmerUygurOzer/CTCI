/**
 * Created by Omer on 11/14/2016.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int val = 0;
        int carry = 1;
        for(int i = digits.length-1;i>=0;i--){
            val  = digits[i]+carry;
            carry = val>9? 1:0;
            digits[i]=val%10;
        }
        if(carry==1){
            int [] newD = new int[digits.length+1];
            for(int i = digits.length-1;i>=0;i--){
               newD[i+1] = digits[i];
            }
            newD[0]=carry;
            return newD;
        }
        return digits;
    }
}
