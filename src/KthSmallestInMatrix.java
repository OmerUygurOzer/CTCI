import java.util.PriorityQueue;

/**
 * Created by Omer on 12/23/2016.
 */
public class KthSmallestInMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Index> minHeap = new PriorityQueue<>();

        for(int i = 0 ; i < matrix[0].length; i++){
            minHeap.offer(new Index(i,0,matrix[0][i]));
        }

        int c = 0;
        Index candidate = null;
        while (c<k){
            candidate = minHeap.poll();
            minHeap.offer(new Index(candidate.x,candidate.y+1,matrix[candidate.y+1][candidate.x]));
            c++;
        }

        return candidate.val;
    }

    private class Index implements Comparable<Index>{
        int x;
        int y;
        int val;

        public Index(int x, int y,int val){
            this.x = x;
            this.y = y;
            this.val = val;
        }

        @Override
        public int compareTo(Index o) {
            return Integer.compare(this.val,o.val);
        }
    }
}
