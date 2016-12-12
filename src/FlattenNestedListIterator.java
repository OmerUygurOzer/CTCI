import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Omer on 12/8/2016.
 */
public class FlattenNestedListIterator implements Iterator<Integer> {


      public interface NestedInteger {

          // @return true if this NestedInteger holds a single integer, rather than a nested list.
          public boolean isInteger();

          // @return the single integer that this NestedInteger holds, if it holds a single integer
          // Return null if this NestedInteger holds a nested list
          public Integer getInteger();

          // @return the nested list that this NestedInteger holds, if it holds a nested list
          // Return null if this NestedInteger holds a single integer
          public List<NestedInteger> getList();
      }

    List<NestedInteger> data;
    int cur;

    public FlattenNestedListIterator(List<NestedInteger> nestedList) {
        data = flatten(nestedList);
        cur  = 0;
    }

    private List<NestedInteger> flatten(List<NestedInteger> nestedInteger){
        LinkedList<NestedInteger> list = new LinkedList<>();
        for(int i = 0; i <nestedInteger.size();i++){
            if(nestedInteger.get(i).isInteger()){
                list.add(nestedInteger.get(i));}
            else{
                list.addAll(flatten(nestedInteger.get(i).getList()));
            }
        }
        return list;
    }

    @Override
    public Integer next() {
        return data.get(cur++).getInteger();
    }

    @Override
    public boolean hasNext() {
        return cur<data.size();
    }

    /**
     * Your NestedIterator object will be instantiated and called as such:
     * NestedIterator i = new NestedIterator(nestedList);
     * while (i.hasNext()) v[f()] = i.next();
     */
}
