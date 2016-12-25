/**
 * Created by Omer on 12/15/2016.
 */
public class WordSearchI {

    public boolean exist(char[][] board, String word) {
        if(word.isEmpty()){return false;}
        int width = board[0].length;
        int height= board.length;

        for(int i = 0;  i < height ; i ++){
            for(int j = 0 ; j < width; j++){
                if(helper(board,word,0,j,i,width,height)){return true;}
            }
        }
        return false;
    }

    private boolean helper(char[][]board , String word, int index,int x, int y,int width,int height){
        if(board[y][x]!=word.charAt(index)){return false;}

        if(index==word.length()-1){return true;}
        boolean found = false;
        char c = board[y][x];
        board[y][x]='#';
        if(x-1>=0){    found |= helper(board,word,index+1,x-1,y,width,height);}
        if(x+1<width){ found |= helper(board,word,index+1,x+1,y,width,height);}
        if(y-1>=0){    found |=helper(board,word,index+1,x,y-1,width,height);}
        if(y+1<height){found |=helper(board,word,index+1,x,y+1,width,height);}
        board[y][x]=c;

        return found;
    }

}
