import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Omer on 11/14/2016.
 */
public class CloneGraph {

      class UndirectedGraphNode {
          int label;
          List<UndirectedGraphNode> neighbors;
          UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
     };



    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node==null){return null;}
        UndirectedGraphNode clone = new UndirectedGraphNode(0);
        clone(node,clone,new HashMap<>());
        return clone;
    }

    public void clone(UndirectedGraphNode node, UndirectedGraphNode clone, HashMap<Integer,UndirectedGraphNode> alreadyCreated){
        clone.label = node.label;
        alreadyCreated.put(clone.label,clone);

        for(UndirectedGraphNode neighbour: node.neighbors){
            if(alreadyCreated.containsKey(neighbour.label)){
                clone.neighbors.add(alreadyCreated.get(neighbour.label));
            }else{
                UndirectedGraphNode cloneNeighbour = new UndirectedGraphNode(neighbour.label);
                clone.neighbors.add(cloneNeighbour);
                clone(neighbour,cloneNeighbour,alreadyCreated);
            }
        }
    }
}
