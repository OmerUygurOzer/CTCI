import java.util.Arrays;

/**
 * Created by Omer on 11/24/2016.
 */
public class FindCelebrity {

    private boolean knows(int a,int b){
        return true;
    }

    public int findCelebrity(int n) {
        boolean [] isKnown = new boolean[n];
        boolean [] knows   = new boolean[n];
        Arrays.fill(isKnown,true);
        boolean cur;
        for(int i = 0;i<n;i++){
            for(int j = 0; j <n; j++){
                if(j==i){continue;}
                cur = knows(j,i);
                isKnown[i] = isKnown[i] && cur;
                knows[j]   =  knows[j] || cur;
               // if(!isKnown[i] || knows[j]){j=n;}
            }
        }
        for(int i = 0;i<n;i++){if(isKnown[i]&&!knows[i]){return i;}}
        return -1;
    }

}
