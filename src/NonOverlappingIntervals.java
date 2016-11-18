import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Omer on 11/17/2016.
 */
public class NonOverlappingIntervals {

      public class Interval {
          int start;
          int end;
          Interval() { start = 0; end = 0; }
          Interval(int s, int e) { start = s; end = e; }
      }


    public int eraseOverlapIntervals(Interval[] intervals) {
        int val = intervals.length;
        if(val<2){return 0;}

        Arrays.sort(intervals,new MyComparator());

        Interval start = intervals[0];

        int found = 0;
        for(int i = 1;i<intervals.length ;i++){
            if(start.start==intervals[i].start){
                found++;
            }else if(intervals[i].start<start.end){
                found++;
                start = (intervals[i].end < start.end) ? intervals[i] : start;
            }else{
                start = intervals[i];
            }
        }

        return found;
    }

    public class MyComparator implements Comparator<Interval>{
        @Override
        public int compare(Interval o1, Interval o2) {
            return Integer.compare(o1.start,o2.start)!=0?Integer.compare(o1.start,o2.start):Integer.compare(o1.end,o2.end);
        }
    }
}
