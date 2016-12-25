/**
 * Created by Omer on 12/23/2016.
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int dist = 0;

        for(int i = 0; i < 32 ; i ++){
            if (((x&(1<<i)))!=((y&(1<<i)))){
               dist++;
            }
        }

        return dist;
    }
}
