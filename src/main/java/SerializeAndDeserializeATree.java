import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeATree {


    public String serialize(TreeNode root) {
        StringBuilder result = new StringBuilder();
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while(nodes.size()!=0){
            TreeNode head = nodes.remove();
            if(head == null){
                result.append("n ");
            }
            else{
                nodes.add(head.left);
                nodes.add(head.right);
                result.append(head.val+" ");
            }
        }
        return result.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("n ")) return null;
        Queue<TreeNode> nodes = new LinkedList<>();
        String[] serialNodes = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(serialNodes[0]));
        nodes.add(root);
        int track = 0;
        while(nodes.size()!=0){
            TreeNode head = nodes.remove();
            if(head != null) {
                TreeNode leftNode;
                TreeNode rightNode;
                String leftVal = serialNodes[2 * track + 1];
                String rightVal = serialNodes[2 * track + 2];
                if (!leftVal.equals("n")) {
                    leftNode = new TreeNode(Integer.parseInt(leftVal));
                    head.left = leftNode;
                    nodes.add(leftNode);
                } else {
                    nodes.add(null);
                }
                if (!rightVal.equals("n")) {
                    rightNode = new TreeNode(Integer.parseInt(rightVal));
                    head.right = rightNode;
                    nodes.add(rightNode);
                } else {
                    nodes.add(null);
                }
                track++;
            }
        }
        return root;
    }

}
