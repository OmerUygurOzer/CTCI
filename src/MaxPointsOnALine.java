import java.util.HashMap;

/**
 * Created by Omer on 12/3/2016.
 */
public class MaxPointsOnALine {

     public static class Point {
          int x;
          int y;
          Point() { x = 0; y = 0; }
          Point(int a, int b) { x = a; y = b; }
      }


    public int maxPoints(Point[] points) {
        if(points.length<=1){return points.length;}
        int maxNumber = 1;
        HashMap<String,Integer> equationMap = new HashMap<>();

        int cur;
        for (int i = 0; i <points.length ; i++){
            for(int j = i +1 ; j<points.length; j++){
                String eq = createEquation(points[i],points[j]);
                if(!equationMap.containsKey(eq)){equationMap.put(eq,0);}
                cur = equationMap.get(eq) + 1;
                equationMap.put(eq,cur);
                maxNumber = Math.max(maxNumber,cur);
            }
        }

        return maxNumber;
    }

    private String createEquation(Point a, Point b){
        StringBuilder equation = new StringBuilder();
        double deltaY = b.y - a.y;
        double deltaX = b.x - a.x;
        double slope =  deltaX == 0? 1 : deltaY / deltaX;
        double mx1= -1*(slope * a.x);
        double y1 = a.y;
        double rem = mx1 + y1;
        equation.append(slope);
        equation.append('x');
        equation.append(rem>=0?"+"+rem:rem);
        return equation.toString();
    }
}
