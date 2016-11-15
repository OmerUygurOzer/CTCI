/**
 * Created by Omer on 11/13/2016.
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index = 0;

        int circ = gas.length;

        int gained = 0;
        int sum = 0;

        for(int i = 0; i < circ;i++){
            int cur = gas[i]-cost[i];

            gained+=cur;
            sum+=cur;
            if(gained<0){
                gained=0;
                index=i+1;
            }

        }

        return sum>=0?index:-1;
    }
}
