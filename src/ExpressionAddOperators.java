import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Omer on 1/25/2017.
 */
public class ExpressionAddOperators {
    public List<String> addOperators(String num, int target) {
        List<List<String>> possibilities = new ArrayList<>();
        generatePossibilities(num,0,possibilities,new ArrayList<>());
        List<String> res = new ArrayList<>();
        for(List<String> s : possibilities){if(eval(s,target)){res.add(linear(s));}}
        return res;
    }

    private void generatePossibilities(String num,int itr,List<List<String>> res,List<String> cur){
        if(itr == num.length()){res.add(new ArrayList<>(cur));return;}
        for(int i = itr; i < num.length();i++){
            String s = num.substring(itr,i+1);
            if(s.startsWith("0")&&s.length()>1){return;}
            cur.add(s);
            if(i+1!=num.length()){
                cur.add("+");
                generatePossibilities(num,i+1,res,cur);
                cur.remove(cur.size()-1);
                cur.add("-");
                generatePossibilities(num,i+1,res,cur);
                cur.remove(cur.size()-1);
                cur.add("*");
                generatePossibilities(num,i+1,res,cur);
                cur.remove(cur.size()-1);}
            else{
                generatePossibilities(num,i+1,res,cur);
            }
            cur.remove(cur.size()-1);
        }
    }

    private String linear(List<String> s){
        StringBuilder stringBuilder = new StringBuilder();
        for(String st: s){stringBuilder.append(st);}
        return stringBuilder.toString();
    }

    private boolean eval(List<String> e,int target){
        Stack<Long> stack = new Stack<>();
        boolean isOp = false;
        String curOp = null ;
        for(String v : e){
         if(isOp){
             curOp = v;
         }else{
             if(curOp!=null) {
                 if (curOp.equals("*")) {
                     Long val = stack.pop();
                     val *= Long.parseLong(v);
                     stack.push(val);
                 } else if (curOp.equals("+")) {
                     stack.push(Long.parseLong(v));
                 } else {
                     stack.push(-1 * Long.parseLong(v));
                 }
             }else{stack.push(Long.parseLong(v));}
         }
          isOp =! isOp;
        }

        long sum = 0L;
        for(Long l : stack){sum+=l;}
        return sum == target;
    }
}
