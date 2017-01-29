import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Omer on 1/28/2017.
 */
public class MeetingRoomsII {



      public class Interval {
          int start;
          int end;
          Interval() { start = 0; end = 0; }
          Interval(int s, int e) { start = s; end = e; }
      }



    public int minMeetingRooms(Interval[] intervals) {
        if(intervals.length<=1){return intervals.length;}

        Arrays.sort(intervals, new Comparator<Interval>() {@Override public int compare(Interval o1, Interval o2) {return Integer.compare(o1.start,o2.start);}});
        PriorityQueue<Interval> rooms = new PriorityQueue<>(new Comparator<Interval>() {@Override public int compare(Interval o1, Interval o2) {return Integer.compare(o1.end,o2.end);}});

        rooms.offer(intervals[0]);

        Interval available;

        for(int i = 1; i <intervals.length;i++){
            available = rooms.poll();

            if (intervals[i].start >= available.end) {
                available.end = intervals[i].end;
            } else {
                rooms.offer(intervals[i]);
            }
            rooms.offer(available);
        }

        return rooms.size();
    }
}
