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

        int[][] rectangles = new int[][]{
                {1,1,3,3},
                {3,1,4,2},
                {1,3,2,4},
                {2,2,4,4},
        };

        PerfectRectangle perfectRectangle = new PerfectRectangle();

        System.out.println(perfectRectangle.isRectangleCover(rectangles));

    }
}
