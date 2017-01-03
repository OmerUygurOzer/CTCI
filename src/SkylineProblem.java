import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * Created by Omer on 11/15/2016.
 */
public class SkylineProblem {
    public List<int[]> getSkyline(int[][] buildings) {
        List<int[]> result = new ArrayList<>();
        List<int[]> height = new ArrayList<>();
        for(int[] b:buildings) {
            height.add(new int[]{b[0], -b[2]});
            height.add(new int[]{b[1], b[2]});
        }
        Collections.sort(height, (a, b) -> {
            if(a[0] != b[0])
                return a[0] - b[0];
            return a[1] - b[1];
        });
        TreeMap<Integer,Integer> treeMap = new TreeMap<>(Collections.reverseOrder());
        treeMap.put(0,1);
        int prev = 0;
        for (int[] h: height) {
            if (h[1] < 0) {
                Integer cnt = treeMap.get(-h[1]);
                cnt = ( cnt == null ) ? 1 : cnt + 1;
                treeMap.put(-h[1], cnt);
            } else {
                Integer cnt = treeMap.get(h[1]);
                if (cnt == 1) {
                    treeMap.remove(h[1]);
                } else {
                    treeMap.put(h[1], cnt - 1);
                }
            }
            int currHeight = treeMap.firstKey();
            if (prev != currHeight) {
                result.add(new int[]{h[0], currHeight});
                prev = currHeight;
            }
        }
        return result;
    }


}
