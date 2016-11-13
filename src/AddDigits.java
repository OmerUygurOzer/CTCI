/**
 * Created by Omer on 11/12/2016.
 */
public class AddDigits {
    public int addDigits(int num) {
        int val = helper(num);
        if(val<10){return val;}
        return addDigits(val);
    }

    private int helper(int num){
        int val = num - (num%10);
        if(val==0){return num%10;}
        return (num%10) + helper(val/10);
    }

    //Non-looped and no recursion algo

//    public int addDigits(int num){
//        return num==0?0:(num%9==0?9:(num%9));
//    }
}
