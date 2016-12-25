import java.util.*;

/**
 * Created by Omer on 12/17/2016.
 */
public class BabyNames {
    //CTCI
    public HashMap<String,Integer> merge(HashMap<String,Integer> names,List<String[]> synonyms){
        HashMap<String,String> graph   = new HashMap<>();

        for(String[] s : synonyms){
            if(graph.containsKey(s[0])){
                graph.put(s[1],graph.get(s[0]));
            }else if (graph.containsKey(s[1])){
                graph.put(s[0],graph.get(s[1]));
            }else{
                graph.put(s[0],s[0]);
                graph.put(s[1],s[0]);
            }
        }


        Iterator<String> itr = new HashSet<>(names.keySet()).iterator();
        while (itr.hasNext()){
            String next= itr.next();
            if(graph.containsKey(next)) {
                if (!next.equals(graph.get(next))) {
                    Integer add = names.get(next);
                    names.put(graph.get(next), names.get(next) + add);
                    names.remove(next);
                }
            }
        }


        return names;
    }


}
