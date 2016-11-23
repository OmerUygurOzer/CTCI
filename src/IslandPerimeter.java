/**
 * Created by Omer on 11/22/2016.
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {

        if(grid==null){return 0;}

        int x = grid[0].length;
        int y = grid.length;

        int totalSquares = 0;
        int totalEdges   = 0;


        for(int i = 0;i<y;i++){
            for(int j = 0; j <x; j++){
                if(grid[i][j]==1){
                    totalSquares++;
                    int bot = i + 1;
                    int rig = j + 1;

                    if(bot<y){
                        if(grid[bot][j]==1){
                            totalEdges++;
                        }
                    }

                    if(rig<x){
                        if(grid[i][rig]==1){
                            totalEdges++;
                        }
                    }


                }
            }
        }


        return (totalSquares*4) - (totalEdges*2);
    }
}
