import java.util.Arrays;

/**
 * Created by Omer on 11/21/2016.
 */
public class BombEnemy {
    public int maxKilledEnemies(char[][] grid) {

        if(grid==null){return 0;}

        int x = grid.length;
        int y = x == 0? 0:grid[0].length;

        int[][] deathCountHor = new int[x][y];
        int[][] deathCountVer = new int[x][y];
        int max = 0;

        int sum;
        int lim;


        for(int i = 0;i<x;i++){
            lim = 0;
            for(int j = 0;j<y;j++){
                if(grid[i][j] == 'E'){
                   for(int e = lim;e<y;e++){
                       deathCountHor[i][e]++;
                   }
                }
                if(grid[i][j] == 'W'){
                    lim = j+1;
                    j++;
                }
            }
        }

        for(int i = 0;i<y;i++){
            lim = 0;
            for(int j = 0;j<x;j++){
                if(grid[j][i] == 'E'){
                    if(j == lim){continue;}
                    for(int e = lim;e<y;e++){
                        deathCountVer[j][e]++;
                    }
                }
                if(grid[j][i] == 'W'){
                    lim = j+1;
                    j++;
                }
            }
        }

        for(int i = 0;i<x;i++){
            for(int j = 0;j<y;j++){
                sum = deathCountHor[i][j]+deathCountVer[i][j];
                max = Math.max(max,sum);
            }
        }

        return max;
    }
}
