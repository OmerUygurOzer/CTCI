import java.util.Arrays;

/**
 * Created by Omer on 12/26/2016.
 */
public class Candy {
    public int candy(int[] ratings) {
        int result = 0;

        int memo[] = new int[ratings.length];
        Arrays.fill(memo,1);


        for(int i = 1; i <ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                    memo[i] = memo[i-1]+1;
            }
        }

        for(int i = ratings.length-2 ; i>=0; i--){
                if(ratings[i]>ratings[i+1]){
                    memo[i] = Math.max(memo[i],memo[i+1]+1);
                }
        }

        for(int c : memo){
            result += c;
        }


        return result;
    }
}
