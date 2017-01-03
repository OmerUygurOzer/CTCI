/**
 * Created by Omer on 11/17/2016.
 */
public class TrappingRainWater {
    public int trap(int[] height) {
       int result = 0;

       int min = -1,full = 0 ;
       int left = 0;
       int trap = 0;

       for(int i = 0 ; i<height.length;i++){
           if(height[i]>0){
              if(min==-1){
                  min = height[i];
                  left = i;
              }else{
                  if(height[i]<min){
                     full+=height[i];
                  }else{
                      trap = ((i-(left+1))*min)-full;
                      result+=trap;
                      full=0;
                      min = height[i];
                      left = i;
                  }
              }

           }

       }

        min  = -1;
        full = 0 ;
        int lim = left;
        left = height.length-1;

        for(int i = height.length-1 ; i>=lim;i--){
            if(height[i]>0){
                if(min==-1){
                    min = height[i];
                    left = i;
                }else{
                    if(height[i]<min){
                        full+=height[i];
                    }else{
                        trap = ((left-(i+1))*min)-full;
                        result+=trap;
                        full=0;
                        min = height[i];
                        left = i;
                    }
                }

            }

        }


       return result;
    }


}
