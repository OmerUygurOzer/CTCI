import java.util.*;

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
//        WordBreakII wordBreak = new WordBreakII();
//        HashSet<String> dict = new HashSet<>();
//        dict.add("cat");
//        dict.add("cats");
//        dict.add("and");
//        dict.add("sand");
//        dict.add("dog");
//        System.out.println(wordBreak.wordBreak("catsanddog",dict));

//        char[][] islands = new char[][]{
//                {'1','1','0','0','0'},
//                {'1','1','0','0','0'},
//                {'0','0','1','0','0'},
//                {'0','0','0','1','1'}};
//        NumberOfIslandsI numberOfIslandsI = new NumberOfIslandsI();
//        System.out.println(numberOfIslandsI.numIslands(islands));

//        int[][] positions=  new int[][]{
//                {0,1},
//                {1,2},
//                {2,1},
//                {1,0},
//                {0,2},
//                {0,0},
//                {1,1}
//        };
//
//        NumberOfIslands numberOfIslands = new NumberOfIslands();
//        System.out.println(numberOfIslands.numIslands2(3,3,positions));

//        FlipGame flipGame = new FlipGame();
//        System.out.println(flipGame.generatePossibleNextMoves("++++"));
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] vals = new int[]{1,0,5,6,0,8,0,0,7,29,68,12,78,0,5,7,9,95,51,23,68,0,0,0,0,0,0,0};
        moveZeroes.moveZeroes(vals);
        for(int i:vals){System.out.print(i);}

//        ZigZagIterator zigZagIterator = new ZigZagIterator(Arrays.asList(1,2,7,3,8),Arrays.asList(3,4,5,6));
//        while (zigZagIterator.hasNext()){
//            System.out.println(zigZagIterator.next());
//        }

//        MissingRanges missingRanges = new MissingRanges();
//        System.out.println(missingRanges.findMissingRanges(new int[]{0,1,3,50,75},0,99));

//        LetterCombinationsOfPhone letterCombinationsOfPhone = new LetterCombinationsOfPhone();
//        System.out.println(letterCombinationsOfPhone.letterCombinations("23"));

//          RangeSumQuery rangeSumQuery = new RangeSumQuery(new int[][]{
//                  {3,0,1,4,2},
//                  {5,6,3,2,1},
//                  {1,2,0,1,5},
//                  {4,1,0,1,7},
//                  {1,0,3,0,5}
//          });
//          System.out.println(rangeSumQuery.sumRegion(2,1,4,3));
//          rangeSumQuery.update(3,2,2);
//          System.out.println(rangeSumQuery.sumRegion(2,1,4,3));

//        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
//        System.out.println(longestIncreasingSubsequence.lengthOfLIS(new int[]{10,9,2,5,3,4}));
//        System.out.println(longestIncreasingSubsequence.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));

//        PowXN powXN = new PowXN();
//        System.out.println(powXN.myPow(2,18));

//        WordSquares wordSquares = new WordSquares();
//        System.out.println(wordSquares.wordSquares(new String[]{"area","lead","wall","lady","ball"}));

//        LongestSubStringWithAtMostKDistinct longestSubStringWithAtMostKDistinct = new LongestSubStringWithAtMostKDistinct();
//        System.out.println(longestSubStringWithAtMostKDistinct.lengthOfLongestSubstringKDistinct("eceba",2));

//          BinaryTreeMaximumPathSum.TreeNode root = new BinaryTreeMaximumPathSum.TreeNode(1);
//          root.left = new BinaryTreeMaximumPathSum.TreeNode(2);
//          root.right= new BinaryTreeMaximumPathSum.TreeNode(3);
//          System.out.println(new BinaryTreeMaximumPathSum().maxPathSum(root));

//            MaxPointsOnALine.Point point = new MaxPointsOnALine.Point(3,3);
//            MaxPointsOnALine.Point point1 = new MaxPointsOnALine.Point(5,5);
//            MaxPointsOnALine.Point point2 = new MaxPointsOnALine.Point(6,6);
//            MaxPointsOnALine.Point point3 = new MaxPointsOnALine.Point(3,6);
//            MaxPointsOnALine.Point point4 = new MaxPointsOnALine.Point(-1,-1);
//            MaxPointsOnALine.Point point5 = new MaxPointsOnALine.Point(2,9);
//            MaxPointsOnALine maxPointsOnALine = new MaxPointsOnALine();
//            System.out.println(maxPointsOnALine.maxPoints(new MaxPointsOnALine.Point[]{point,point1,point2,point3,point5}));

//            ShortestPalindrome shortestPalindrome = new ShortestPalindrome();
//               System.out.println(shortestPalindrome.shortestPalindrome("abcecbaefefef"));
//               System.out.println(shortestPalindrome.shortestPalindrome("aba"));
//               System.out.println(shortestPalindrome.shortestPalindrome("aaaaa"));

//        BasicCalculator basicCalculator = new BasicCalculator();
//        System.out.println(basicCalculator.calculate("2+1+5-2+(2+1)"));
//        HashSet<String> set = new HashSet<>();
//        set.addAll(Arrays.asList("hog", "pot", "tot", "hop", "dot", "cog", "hot", "dog"));
//        WordLadderII wordLadderII = new WordLadderII();
//        System.out.println(wordLadderII.findLadders("hot","dog",set));

           // System.out.println("great".substring(0,0));
//        ScrambleString scrambleString = new ScrambleString();
//        scrambleString.isScramble("abc","cba");
//         System.out.println( new AddWithoutPlus().addWithoutPlus(8,2));
//        int[] deck = new int[]{1,2,3,4,5,6,7,8,9,10};
//        ShuffleAnArray shuffleAnArray = new ShuffleAnArray(deck);
//        int [] s = shuffleAnArray.shuffle();
//        for(int i = 0 ; i < s.length; i++){System.out.print(s[i]+ " ");}

//        int[] nums = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12};
//        RandomSet randomSet = new RandomSet();
//        System.out.println(randomSet.generateSet(nums,3));
//        System.out.println(randomSet.generateSet(nums,4));
//        System.out.println(randomSet.generateSet(nums,2));


//        Count2s count2s = new Count2s();
//        System.out.println(count2s.countTwos(4567));

//        FlattenBinaryTreeToLinkedList.TreeNode root = new FlattenBinaryTreeToLinkedList.TreeNode(1);
//        root.left = new FlattenBinaryTreeToLinkedList.TreeNode(2);
//        root.right= new FlattenBinaryTreeToLinkedList.TreeNode(5);
//        root.left.left = new FlattenBinaryTreeToLinkedList.TreeNode(3);
//        root.left.right = new FlattenBinaryTreeToLinkedList.TreeNode(4);
//        root.right.right= new FlattenBinaryTreeToLinkedList.TreeNode(6);
//        FlattenBinaryTreeToLinkedList flattenBinaryTreeToLinkedList = new FlattenBinaryTreeToLinkedList();
//        flattenBinaryTreeToLinkedList.flatten(root);
//        while (root!=null){
//            System.out.println(root.val);
//            root = root.right;
//        }

        /*
         Pacific ~   ~   ~   ~   ~
       ~  1   2   2   3  (5) *
       ~  3   2   3  (4) (4) *
       ~  2   4  (5)  3   1  *
       ~ (6) (7)  1   4   5  *
       ~ (5)  1   1   2   4  *
          *   *   *   *   * Atlantic
         */

//        int [][] matrix = new int[][]{
//                {1,2,2,3,5},
//                {3,2,3,4,4},
//                {2,4,5,3,1},
//                {6,7,1,4,5},
//                {5,1,1,2,4}};
//
//        PacificAtlanticWaterFlow pacificAtlanticWaterFlow = new PacificAtlanticWaterFlow();
//        List<int[]> result = pacificAtlanticWaterFlow.pacificAtlantic(matrix);
//        for(int[] res:result){
//            System.out.println(res[0] + " - " + res [1]);
//        }

    //    [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
    //    [[0,4],[1,4],[2,2],[1,3],[4,0],[3,1]]

//            WordBreak wordBreak = new WordBreak();
//            HashSet<String> wordDict = new HashSet<>();
//            wordDict.add("a"); wordDict.add("aa"); wordDict.add("aaa"); wordDict.add("aaaa"); wordDict.add("aaaaa"); wordDict.add("aaaaaa"); wordDict.add("aaaaaaa"); wordDict.add("aaaaaaaa");
//            System.out.println(wordBreak.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",wordDict));

//        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
//        System.out.println(topKFrequentElements.topKFrequent(new int[]{1,1,1,2,2,2,2,2,3,4,4,4,4,4,4,4},4));

//        Combinations combinations = new Combinations();
//        System.out.println(combinations.combine(4,2));

//        char[][] board = new char[][]{
//                {'A','B','C','E'},
//                {'S','F','C','S'},
//                {'A','D','E','E'}
//        };
//
//
//
//        WordSearchI wordSearchI = new WordSearchI();
//        System.out.println(wordSearchI.exist(board,"ABCCED"));
//        System.out.println(wordSearchI.exist(board,"SEE"));
//        System.out.println(wordSearchI.exist(board,"ABCB"));

//        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
//        System.out.println(palindromePartitioning.partition("aab"));


//        HashMap<String,Integer> names = new HashMap<>();
//        names.put("John",10);
//        names.put("Jon",3);
//        names.put("Davis",2);
//        names.put("Kari",3);
//        names.put("Johnny",11);
//        names.put("Carlton",8);
//        names.put("Carleton",2);
//        names.put("Jonathan",9);
//        names.put("Carrie",5);
//
//        List<String[]> synonyms = new ArrayList<>();
//        synonyms.add(new String[]{"Jonathan","John"});
//        synonyms.add(new String[]{"Jon","Johnny"});
//        synonyms.add(new String[]{"Johnny","John"});
//        synonyms.add(new String[]{"Kari","Carrie"});
//        synonyms.add(new String[]{"Carleton","Carlton"});
//
//        BabyNames babyNames = new BabyNames();
//        System.out.println(babyNames.merge(names,synonyms));

//        String s = "ADOBECODEBANC";
//        String t = "ABC";
//
//        System.out.println(new MinimumWindowSubstring().minWindow(s,t));

//        new Candy().candy(new int[]{5,3,1});

//        int [][] dungeon = new int[][]{
//                {-2,-3,3},
//                {-5,-10,1},
//                {10,30,-5}
//        };
//
//        System.out.println(new DungeonGame().calculateMinimumHP(dungeon));

//        RandomMatrix randomMatrix = new RandomMatrix();
//        int c = 6;
//        while(c>=0) {
//            int[][] mat = randomMatrix.generateMatrix();
//            for (int i = 0; i < 4; i++) {
//                for (int j = 0; j < 4; j++) {
//                    System.out.print(mat[i][j]);
//                }
//                System.out.println();
//            }
//            System.out.println("==============");
//            c--;
//        }

//        TrappingRainWater rainWater = new TrappingRainWater();
//        System.out.println(rainWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
//        System.out.println(rainWater.trap(new int[]{4,2,3}));
//        System.out.println(rainWater.trap(new int[]{2,0,2}));

//        Subsets subsets = new Subsets();
//        System.out.println(subsets.subsets(new int[]{1,2,3}));

        //System.out.println(new SortCharactersByFrequency().frequencySort("Aabb"));

//        ExpressionAddOperators expressionAddOperators = new ExpressionAddOperators();
//        System.out.println(expressionAddOperators.addOperators("105",5));

//        BoxedHashQueue test = new BoxedHashQueue();
    }
}
