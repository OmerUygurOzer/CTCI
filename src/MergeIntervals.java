import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Omer on 2/8/2017.
 */





public class MergeIntervals {
    public class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size()<=1){return intervals;}

        List<Interval> result = new LinkedList<>();

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return Integer.compare(o1.start,o2.start);
            }
        });

        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        for(Interval interval : intervals){
            if(interval.start<=end){
                end = Math.max(end,interval.end);
            }else{
                result.add(new Interval(start,end));
                start = interval.start;
                end   = interval.end;
            }
        }

        result.add(new Interval(start,end));
        return result;
    }
}
