/**
 * Created by Omer on 11/12/2016.
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int maxLen = Math.max(num1.length(),num2.length());
        int minLen = Math.min(num1.length(),num2.length());
        int dif = maxLen - minLen;

        int carry = 0;
        for(int i = 0; i <minLen;i++){
            carry = add(result,getInt(num1,i),getInt(num2,i),carry);
        }

        if(dif>0){
            String bigger = num1.length()>num2.length() ? num1:num2;
            for(int i = minLen; i<maxLen;i++){
                carry = add(result,getInt(bigger,i),0,carry);
            }
        }

        if(carry==1){result.append(carry);}

        return result.reverse().toString();
    }

    private int getInt(String s,int n){
        int index = (s.length()-1)-n;
        return Integer.parseInt(s.substring(index,index+1));
    }

    private int add(StringBuilder stringBuilder,int n1,int n2,int carry){
        int val = n1 + n2 + carry;
        int add = val>=10? val%10:val;
        stringBuilder.append(add);
        return val>=10?1:0;
    }
}
