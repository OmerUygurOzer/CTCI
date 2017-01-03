import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Omer on 12/31/2016.
 */
public class RandomMatrix {
    //CareerCup :  https://www.careercup.com/question?id=5655717580111872

    Random random = new Random();

    public int[][] generateMatrix(){
        int[][] result  = new int[4][4];
        int[][] rowsMemo= new int[4][4];
        int[][] colsMemo= new int[4][4];
        Set<Integer> nums = new HashSet<>();
        nums.addAll(Arrays.asList(1,2,3,4));

        for(int i = 0; i <4; i++){
            for(int j = 0; j <4; j++) {
                     if(j-1>=0)if(rowsMemo[i][j-1]==2){nums.remove(result[i][j-1]);}
                     if(i-1>=0)if(colsMemo[i-1][i]==2){nums.remove(result[i-1][j]);}
                     result[i][j] = getRand(nums);
                     rowsMemo[i][j] = j - 1>=0 ?  rowsMemo[i][j-1]==2 ? 1 : result[i][j]==result[i][j-1] ? rowsMemo[i][j-1]+1 : 1 :1;
                     colsMemo[i][j] = i - 1>=0 ?  colsMemo[i-1][j]==2 ? 1 : result[i][j]==result[i-1][j] ? colsMemo[i-1][j]+1 : 1 :1;
                     if(j-1>=0) nums.add(result[i][j-1]);
                     if(i-1>=0) nums.add(result[i-1][j]);
            }
        }
        return result;
    }

    private int getRand(Set<Integer> set){
        int i = random.nextInt(set.size());
        Iterator<Integer> integerIterator = set.iterator();
        while (i>0){
            integerIterator.next();
            i--;
        }
        return integerIterator.next();
    }
}
