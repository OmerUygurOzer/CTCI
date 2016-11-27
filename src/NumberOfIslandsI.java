/**
 * Created by Omer on 11/25/2016.
 */
public class NumberOfIslandsI {
    public int numIslands(char[][] grid) {
        if(grid == null){return 0;}
        if(grid.length==0){return 0;}
        int islands = 0;
        int y = grid.length;
        int x = grid[0].length;

        for(int i = 0; i < y;i++){
            for(int j = 0; j<x ; j++){
                if(grid[i][j]=='s' || grid[i][j]=='0')continue;
                islands++;
                helper(grid,j,i);
            }
        }

        return islands;
    }

    private void helper(char[][] grid,int x,int y){
        if(x<0 || y<0 || x>=grid[0].length || y>=grid.length){return;}
        if(grid[y][x]=='s' || grid[y][x]=='0'){return;}
        grid[y][x]='s';
        helper(grid,x-1,y);
        helper(grid,x+1,y);
        helper(grid,x,y+1);
        helper(grid,x,y-1);
    }
}
