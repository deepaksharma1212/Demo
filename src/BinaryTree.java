
class TreeNode{
	int item;
	TreeNode left,right;
	
	public TreeNode(int item) {
		this.item = item;
		this.left = this.right =null;
	}

	@Override
	public String toString() {
		return "TreeNode [item=" + item + ", left=" + left + ", right=" + right + "]";
	}
	
}

public class BinaryTree {

	TreeNode root;
	
	public static void main(String args[]) {
		BinaryTree  tree = new BinaryTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.Inorder(tree.root);
	}
	
	public int Inorder(TreeNode root) {
		
		if(root == null) return 0;
		
		if(root.left != null) {
			Inorder(root.left);
			System.out.println(root.item);
			if(root.right != null) {
				Inorder(root.right);
			}
		}else {
			System.out.println(root.item);
		}
			
		return 0;
	}
	
}
