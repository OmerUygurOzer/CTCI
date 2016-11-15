/**
 * Created by Omer on 11/13/2016.
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index = -1;
        //Todo : fix!
        int total = 0;

        for(int i = 0;i<gas.length;i++){
            total += gas[i]-cost[i];
        }

        int cur = 0;

        for(int i = 0;i<gas.length;i++){
            cur+= gas[i]-cost[i];
            if(cur<=total-cur){
                index = i;
            }
        }

        return index;
    }
}
