
import java.util.Random;

/**
 * Created by Omer on 12/10/2016.
 */
public class ShuffleDeck {
    //CTCI
    public void shuffle(String[] deck,int index){
        if(index == deck.length){return;}
        int swapIndex = getRandom(index,deck.length-1);
        String temp = deck[index];
        deck[index] = deck[swapIndex];
        deck[swapIndex] = temp;
        shuffle(deck,index+1);
    }

    private int getRandom(int min,int max){
        return new Random().nextInt(max-min)+min+1;
    }
}
