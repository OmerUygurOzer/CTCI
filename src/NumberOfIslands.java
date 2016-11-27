import java.util.*;

/**
 * Created by Omer on 11/24/2016.
 */
public class NumberOfIslands {

    private int islandId = 2;
    private HashMap<Integer,Point> islandMap = new HashMap<>();

    private class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        int [][] counterMap = new int[m+2][n+2];
        List<Integer> result = new ArrayList<>();
        int x = 0,y =0;
        Set<Integer> unite = new HashSet<>();

        for(int i = 0; i<positions.length; i++){
            unite.clear();
            x = positions[i][0]+1;
            y = positions[i][1]+1;
            unite.add(counterMap[x+1][y]);
            unite.add(counterMap[x-1][y]);
            unite.add(counterMap[x][y+1]);
            unite.add(counterMap[x][y-1]);
            unite.remove(0);
            if(unite.isEmpty()){
                counterMap[x][y]=createNewIsland(x,y);
//                System.out.println("new island " + islandId);
            }else{
                if(unite.size()==1){
                    counterMap[x][y] = unite.iterator().next();
                }else{
//                    System.out.println("uniting " + unite );
//                    System.out.println("existing islands " + islandMap.keySet());
                    uniteIslands(unite,counterMap,x,y);
                }
            }
            result.add(islandMap.size());
        }

        return result;
    }

    private void uniteIslands(Set<Integer> unite,int[][] counterMap,int x,int y){
        int newId = unite.iterator().next();
        counterMap[x][y]=newId;
        Point start = null;
        for(Integer id : unite){
            if (id==newId)continue;
            start = islandMap.get(id);
            mark(id,newId,start.x,start.y,counterMap);
            islandMap.remove(id);
        }

    }

    private void mark(int oldId,int newId,int x, int y,int[][] counterMap){
        counterMap[x][y]=newId;
        if(counterMap[x+1][y]  ==oldId)mark(oldId,newId,x+1,y,counterMap);
        if(counterMap[x-1][y]  ==oldId)mark(oldId,newId,x-1,y,counterMap);
        if(counterMap[x][y+1]  ==oldId)mark(oldId,newId,x,y+1,counterMap);
        if(counterMap[x+1][y-1]==oldId)mark(oldId,newId,x+1,y-1,counterMap);
    }


    private int createNewIsland(int x,int y){
        islandMap.put(++islandId,new Point(x,y));
        return islandId;
    }


}
