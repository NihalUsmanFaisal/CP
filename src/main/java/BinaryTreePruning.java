public class BinaryTreePruning {

    private boolean solution(TreeNode node){
        if(node == null) return false;
        boolean leftNodeEligibilty =  solution(node.left);
        boolean rightNodeEligibility = solution(node.right);
        if(!leftNodeEligibilty) node.left = null;
        if(!rightNodeEligibility) node.right = null;
        return (node.val == 1) || leftNodeEligibilty || rightNodeEligibility;
    }

    public TreeNode pruneTree(TreeNode root) {
        if(!solution(root)) return null;
        return root;

    }

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val,TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
}
