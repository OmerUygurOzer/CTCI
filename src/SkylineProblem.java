import java.util.*;

/**
 * Created by Omer on 11/15/2016.
 */
public class SkylineProblem {
    public List<int[]> getSkyline(int[][] buildings) {
        List<int[]> result = new LinkedList<>();

        List<Building> list = new ArrayList<>();
        for(int i = 0 ; i < buildings.length ; i++){list.add(new Building(buildings[i][0] , buildings[i][1] , buildings[i][2]));}


        Building mostRec = null;
        Building cur;

        for(int i = 0; i <list.size(); i++){

        }



        return result;
    }


    private class Building{
        int l,r,h;
        public Building(int l,int r,int h){
            this.l = l;
            this.r = r;
            this.h = h;
        }
    }
}
