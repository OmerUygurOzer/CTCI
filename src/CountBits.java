/**
 * Created by Omer on 11/13/2016.
 */
public class CountBits {
    public int[] countBits(int num) {
        int[] result = new int[num+1];

        for(int i = 0; i<=num;i++){
            result[i] = hammingWeight(i);
        }

        return result;
    }

    public int hammingWeight(int n) {
        int num = 0;
        for(int i = 0; i <32; i++){
            if(getBit(n,i)==1){num++;}
        }
        return num;
    }

    private int getBit(int n ,int bit){
        return  (n & (1 << bit)) >> bit;
    }


    //Boss like solution

//    public int[] countBits(int num) {
//        int[] result = new int[num+1];
//
//        int lastPowerOfTwo = 0;
//        result[0] = 0;
//
//        for(int i = 1; i<=num;i++){
//
//            if((i & (i-1))==0){
//                lastPowerOfTwo = i;
//                result[i] = 1;
//            }else{
//                result[i] = 1 + result[i-lastPowerOfTwo];
//            }
//        }
//
//        return result;
//    }


}
