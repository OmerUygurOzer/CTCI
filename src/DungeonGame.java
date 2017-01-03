import java.util.PriorityQueue;

/**
 * Created by Omer on 12/30/2016.
 */
public class DungeonGame {


    public int calculateMinimumHP(int[][] dungeon) {
        int maxX = dungeon[0].length;
        int maxY = dungeon.length;

        int[][] memo = new int[maxY+1][maxX+1];
        memo[maxY-1][maxX] = 1;
        memo[maxY][maxX-1] = 1;

        for(int i = maxY-1 ; i >=0 ; i -- ){
            for(int j = maxX-1; j>=0; j --){
                int req = Math.min(memo[i+1][j],memo[i][j+1]) - dungeon[i][j];
                memo[i][j] = req<=0 ? 1 : req;
            }
        }


        return memo[0][0];
    }


}
