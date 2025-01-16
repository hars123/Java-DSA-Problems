class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int value) {
        val = value;
        left = right = null;
    }
}

public class BinaryTree {

    TreeNode root;

    // Inorder Traversal (Left -> Root -> Right)
    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.val + " ");
            inorderTraversal(node.right);
        }
    }

    // Preorder Traversal (Root -> Left -> Right)
    // public void preorderTraversal(TreeNode node) {
    //     if (node != null) {
    //         System.out.print(node.val + " ");
    //         preorderTraversal(node.left);
    //         preorderTraversal(node.right);
    //     }
    // }

    // // Postorder Traversal (Left -> Right -> Root)
    // public void postorderTraversal(TreeNode node) {
    //     if (node != null) {
    //         postorderTraversal(node.left);
    //         postorderTraversal(node.right);
    //         System.out.print(node.val + " ");
    //     }
    // }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Creating a sample binary tree
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Inorder Traversal:");
        tree.inorderTraversal(tree.root);

        // System.out.println("\nPreorder Traversal:");
        // tree.preorderTraversal(tree.root);

        // System.out.println("\nPostorder Traversal:");
        // tree.postorderTraversal(tree.root);
    }
}
