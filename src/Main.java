/**
 * Created by Omer on 10/24/2016.
 */
public class Main {
    public static void main(String[] args) {
//        TrieTree trieTree = new TrieTree();
//        trieTree.addWord("OMER ROCKS");
//        trieTree.addWord("OMER SUCKS");
//
//
//        trieTree.printTree();

//        DynamicFibonacci dynamicFibonacci = new DynamicFibonacci();
//        System.out.println(Integer.toString(dynamicFibonacci.get(12)));

//        int[][] rectangles = new int[][]{
//                {1,1,3,3},
//                {3,1,4,2},
//                {1,3,2,4},
//                {2,2,4,4},
//        };
//
//        PerfectRectangle perfectRectangle = new PerfectRectangle();
//
//        System.out.println(perfectRectangle.isRectangleCover(rectangles));

//        NumberOf1Bits numberOf1Bits = new NumberOf1Bits();
//        numberOf1Bits.hammingWeight(15);

//        AddStrings addStrings = new AddStrings();
//        System.out.println(addStrings.addStrings("0","0"));

//        PlusOne plusOne = new PlusOne();
//        int[] test = plusOne.plusOne(new int[]{9});
//        for(int i = 0;i<test.length;i++){
//            System.out.print(test[i]);
//        }

//        LongestAbsoluteFilePath longestAbsoluteFilePath = new LongestAbsoluteFilePath();
//       longestAbsoluteFilePath.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext");
      // longestAbsoluteFilePath.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext");

        ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
        System.out.println(reverseWordsInString.reverseWords("the sky is blue"));
        System.out.println(reverseWordsInString.reverseWords("1"));

    }
}
