import java.util.ArrayList;
import java.util.List;

/**
 * Created by Omer on 11/27/2016.
 */
public class ZigZagIterator {

    List<List<Integer>> vals;
    int ptr;
    int[] itr;
    int size;
    int main;

    public ZigZagIterator(List<Integer> v1, List<Integer> v2) {
        vals = new ArrayList<>();
        vals.add(v1);
        vals.add(v2);
        ptr = 0;
        itr = new int[vals.size()];
        size = v1.size() + v2.size();
    }

    public int next() {
        ptr = getNextPtr();
        main++;
        return vals.get(ptr).get(itr[ptr++]++);
    }

    private int getNextPtr(){
        int lim = vals.size()+ptr;
        for(int i = ptr ; i<lim; i++){
            ptr = i%vals.size();
            if(itr[ptr]<vals.get(ptr).size()){return ptr;}
        }
        return -1;
    }

    public boolean hasNext() {
        return main < size;
    }
}

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */