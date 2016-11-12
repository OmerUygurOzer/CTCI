import javax.swing.text.Style;

/**
 * Created by Omer on 11/5/2016.
 */
public class PerfectRectangle {
    public int leftMost , bot, rightMost,top;



    public  boolean isRectangleCover(int [][] rectangles){
        leftMost  = rectangles[0][0];
        bot       = rectangles[0][1];
        rightMost = rectangles[0][2];
        top       = rectangles[0][3];

        for(int i = 0 ; i< rectangles.length;i++){
            if(rectangles[i][0]<leftMost){leftMost=rectangles[i][0];}
            if(rectangles[i][1]<bot){bot=rectangles[i][1];}
            if(rectangles[i][2]>rightMost){rightMost=rectangles[i][2];}
            if(rectangles[i][3]>top){top=rectangles[i][3];}
        }

        int recTable[][] = new int[rightMost - leftMost][top-bot];

        for(int i = 0 ; i< rectangles.length;i++){
           scan(rectangles[i],recTable);
        }

        return checkForRect(recTable);
    }

    private  void scan(int[] rect,int[][] rectTable){
        for(int x = rect[0]; x < rect[2];x++){
            for(int y = rect[1];y<rect[3];y++){
                rectTable[x-leftMost][y-bot] = rectTable[x-leftMost][y-bot]+1;
            }
        }
    }

    private boolean checkForRect(int[][] rectTable){
        for(int x = 0; x < rightMost-leftMost;x++){
            for(int y = 0;y<top-bot;y++){
               if(rectTable[x][y]!=1){return false;}
            }
        }
        return true;
    }
}
