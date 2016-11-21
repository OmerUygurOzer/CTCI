/**
 * Created by Omer on 11/20/2016.
 */
public class SerializeDeserializeBinaryTree {

     public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }



    public String serialize(TreeNode root) {
        StringBuilder stringBuilder = new StringBuilder();
        inOrder(root,stringBuilder);
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }

    private void inOrder(TreeNode node, StringBuilder stringBuilder){
        if(node==null){
            stringBuilder.append("N/");
            return;
        }
        stringBuilder.append(Integer.toString(node.val) + "/");
        inOrder(node.left,stringBuilder);
        inOrder(node.right,stringBuilder);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodes = data.split("/");
        if(nodes.length==1){
            if(nodes[0].equals("N")) {return null;}
            return new TreeNode(Integer.parseInt(nodes[0]));
        }

        TreeNode root = new TreeNode(0);
        load(nodes,root,0);
        return root;
    }

    private int load(String[] data, TreeNode node,int index){
        System.out.print(data[index]);
        node.val = Integer.parseInt(data[index]);
        index++;
        if(!data[index].equals("N")){
            node.left = new TreeNode(0);
            index = load(data,node.left,index);
        }
        index++;
        if(!data[index].equals("N")){
            node.right = new TreeNode(0);
            index = load(data,node.right,index);
        }
        return index;
    }
}
