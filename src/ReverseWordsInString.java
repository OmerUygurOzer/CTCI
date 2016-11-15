import java.util.Stack;

/**
 * Created by Omer on 11/14/2016.
 */
public class ReverseWordsInString {
    public String reverseWords(String s) {
        String words[] = s.trim().split("\\s+");
        Stack<String> wordsStack = new Stack<String>();
        StringBuilder stringBuilder = new StringBuilder();

        for(String word:words){
            wordsStack.add(word);
        }

        String cur ;
        while (!wordsStack.isEmpty()){
            cur = wordsStack.pop();
            stringBuilder.append(cur);
            if(!wordsStack.isEmpty()){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
