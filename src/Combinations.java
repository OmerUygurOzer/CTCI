import java.util.ArrayList;
import java.util.List;

/**
 * Created by Omer on 12/14/2016.
 */
public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if(n==0 || k == 0){return result;}
        helper(n,1,k,new ArrayList<>(),result);
        return result;
    }

    private void helper(int n,int index,int k,List<Integer> cur,List<List<Integer>> result){
        if(cur.size()==k){result.add(new ArrayList<>(cur));return;}
        for(int i = index; i <= n; i++){
            cur.add(i);
            helper(n,i+1,k,cur,result);
            cur.remove(cur.size()-1);
        }
    }
}
