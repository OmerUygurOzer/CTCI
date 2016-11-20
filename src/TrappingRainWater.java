/**
 * Created by Omer on 11/17/2016.
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        int count = height.length;
        if(count<3){return 0;}

        int total = 0;

        int cur = 0;
        int left = height[0];


        for(int i=0;i<count;i++){
            if(height[i]<left){
                cur+=left-height[i];
                System.out.println(cur);
            }else{
                total +=cur;
                cur=0;
                left = height[i];
            }

        }


        return total;
    }
}
