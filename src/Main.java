import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

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

//        ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
//        System.out.println(reverseWordsInString.reverseWords("the sky is blue"));
//        System.out.println(reverseWordsInString.reverseWords("1"));

//        CombinationSumII combinationSumII = new CombinationSumII();
//        combinationSumII.combinationSum2(new int[]{10,1,2,7,6,1,5},8);

//        SkylineProblem skylineProblem = new SkylineProblem();
//        int[][] test = new int[][]{{2,9,10},
//                {3,7,15},
//                {5,12,12},
//                {15,20,10},
//                {19,24,8}};
//
//        skylineProblem.getSkyline(test);

//        SubsetsII subsetsII = new SubsetsII();
//        subsetsII.subsetsWithDup(new int[]{1,2,2});

//        System.out.print(Integer.compare(10,30));

//        TrappingRainWater rainWater = new TrappingRainWater();
//        System.out.println(rainWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
//        System.out.println(rainWater.trap(new int[]{4,2,3}));

//        LongestSubstringWithoutRepeatingChars longestSubstringWithoutRepeatingChars = new LongestSubstringWithoutRepeatingChars();
//        System.out.println(longestSubstringWithoutRepeatingChars.lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(longestSubstringWithoutRepeatingChars.lengthOfLongestSubstring("bbbbbb"));
//        System.out.println(longestSubstringWithoutRepeatingChars.lengthOfLongestSubstring("pwwkew"));
//        System.out.println(longestSubstringWithoutRepeatingChars.lengthOfLongestSubstring("abcdefghc"));
//        System.out.println(longestSubstringWithoutRepeatingChars.lengthOfLongestSubstring("aab"));
//        System.out.println(longestSubstringWithoutRepeatingChars.lengthOfLongestSubstring("abaaaaab"));
//        System.out.println(longestSubstringWithoutRepeatingChars.lengthOfLongestSubstring("abbbbbbacdefa"));
//

//        SerializeDeserializeBinaryTree.TreeNode treeNode = new SerializeDeserializeBinaryTree.TreeNode(4);
//        treeNode.left = new SerializeDeserializeBinaryTree.TreeNode(2);
//        treeNode.right = new SerializeDeserializeBinaryTree.TreeNode(6);
//        treeNode.right.right = new SerializeDeserializeBinaryTree.TreeNode(8);
//
//        SerializeDeserializeBinaryTree serializeDeserializeBinaryTree = new SerializeDeserializeBinaryTree();
//        serializeDeserializeBinaryTree.deserialize(serializeDeserializeBinaryTree.serialize(treeNode));

//        char[][] h = new char[][]{
//                {'0','E','0','0'},
//                {'E','0','W','E'},
//                {'0','E','0','0'},};
//
//        BombEnemy bombEnemy = new BombEnemy();
//        System.out.println(bombEnemy.maxKilledEnemies(h));

//        List<List<Integer>> array = new ArrayList();
//        array.add(Arrays.asList(1));
//        array.add(Arrays.asList(2,3));
//        array.add(Arrays.asList(5,0,-3));
//        Triangle triangle = new Triangle();
//        System.out.println(triangle.minimumTotal(array));
        WordBreak wordBreak = new WordBreak();
        HashSet<String> dict = new HashSet<>();
        dict.add("cat");
        dict.add("cats");
        dict.add("and");
        dict.add("sand");
        dict.add("dog");
        System.out.println(wordBreak.wordBreak("catsanddog",dict));

    }
}
