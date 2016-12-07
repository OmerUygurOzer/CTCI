/**
 * Created by Omer on 12/6/2016.
 */
public class Search2DArray {
    public boolean searchMatrix(int[][] matrix, int target) {
        int x = matrix[0].length-1;
        int y = 0;

        while(x>=0 && y<=matrix.length-1){
            if(matrix[y][x]==target){return true;}
            if(target < matrix[y][x]){
                x--;
            }else{
                y++;
            }
        }


        return false;
    }
}
