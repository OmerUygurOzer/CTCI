import java.util.ArrayList;
import java.util.List;

/**
 * Created by Omer on 12/13/2016.
 */
public class PacificAtlanticWaterFlow {
    public List<int[]> pacificAtlantic(int[][] matrix) {
        int width = matrix[0].length;
        int height= matrix.length;

        List<int[]> result = new ArrayList<>();

        char[][] memo = new char[height][width];

        for(int i = 0 ; i < height; i++){
            helper(matrix,width,height,memo,result,0,i,'P');
            helper(matrix,width,height,memo,result,width-1,i,'A');
        }

        for(int i = 0 ; i < width; i++){
            helper(matrix,width,height,memo,result,i,0,'P');
            helper(matrix,width,height,memo,result,i,height-1,'A');
        }

        return result;
    }

    private void helper(int[][] matrix,int width,int height,char[][] memo,List<int[]> result,int x,int y,char mark){
        if(memo[y][x]=='B' || memo[y][x]==mark){return;}
        if((memo[y][x]=='A' && mark=='P') || (memo[y][x]=='P' && mark=='A')){
            memo[y][x]='B';
            result.add(new int[]{y,x});
            return;
        }
        memo[y][x] = mark;
        if(x - 1 >=0){if(matrix[y][x-1]>=matrix[y][x]){helper(matrix,width,height,memo,result,x-1,y,mark);}}
        if(x + 1 <width){if(matrix[y][x+1]>=matrix[y][x]){helper(matrix,width,height,memo,result,x+1,y,mark);}}

        if(y - 1 >=0){if(matrix[y-1][x]>=matrix[y][x]){helper(matrix,width,height,memo,result,x,y-1,mark);}}
        if(y + 1 <height){if(matrix[y+1][x]>=matrix[y][x]){helper(matrix,width,height,memo,result,x,y+1,mark);}}
    }
    
}
