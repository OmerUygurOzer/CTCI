import java.util.*;

/**
 * Created by Omer on 11/15/2016.
 */
public class SkylineProblem {
    public List<int[]> getSkyline(int[][] buildings) {
        HashMap<Integer,Integer> heights =  new HashMap<>();
        int maxX = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;

        for(int b = 0;b<buildings.length;b++){
            for(int x = buildings[b][0]; x <= buildings[b][1] ;x++){
                maxX = Math.max(maxX,x);
                minX = Math.min(minX,x);
                if(!heights.containsKey(x)){
                    heights.put(x,buildings[b][2]);
                }else{
                    int cur = Math.max(heights.get(x),buildings[b][2]);
                    heights.put(x,cur);
                }
            }
        }


        List<int[]> result = new ArrayList<>();

        Set<Integer> setX = new HashSet<>();

        List<Integer> keys = new ArrayList<>(heights.keySet());
        Collections.sort(keys);


        for(int x :keys){
            if(setX.contains(heights.get(x))){continue;}

                if(heights.get(x-1)<heights.get(x+1)){
                    result.add(new int[]{x,heights.get(x)});
                }else if(!setX.contains(heights.get(x))){
                    result.add(new int[]{x, heights.get(x + 1)});
                }

        }

        Collections.reverse(result);
        return result;
    }
}
