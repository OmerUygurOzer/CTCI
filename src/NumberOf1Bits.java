/**
 * Created by Omer on 11/12/2016.
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int num = 0;
        for(int i = 0; i <32; i++){
            if(getBit(n,i)==1){num++;}
            System.out.println(getBit(n,i));
        }
        return num;
    }

    private int getBit(int n ,int bit){
        return  (n & (1 << bit)) >> bit;
    }
}
