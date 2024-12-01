package Practice;

import java.util.LinkedList;
import java.util.Queue;


class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class Tree {

	static TreeNode root;
	int size;

	public void push(int val) {
		TreeNode newNode = new TreeNode(val);
		if (root == null) {
			root = newNode;
			return;
		}

		TreeNode current = root;
		if (val <= current.val) {
			if (current.left == null) {
				current.left = newNode;
				return;
			} else {
				pushTraverse(current.left, val, newNode);
			}
		} else {
			if (current.right == null) {
				current.right = newNode;
				return;
			} else {
				pushTraverse(current.right, val, newNode);
			}
		}
		// left < val < right
	}

	public static void pushTraverse(TreeNode current, int val, TreeNode newNode) {
		if (val <= current.val) {
			if (current.left == null) {
				current.left = newNode;
				return;
			} else {
				pushTraverse(current.left, val, newNode);
			}
		} else {
			if (current.right == null) {
				current.right = newNode;
				return;
			} else {
				pushTraverse(current.right, val, newNode);
			}
		}
	}

	public void pop(int val) {
		if (root == null) {
			System.out.println("Tree is empty.");
			return;
		}

		if (root.val == val) {
			root = null;
			return;
		}

		TreeNode current = root;
		if (val < current.val) {
			if (current.left == null) {
				return;
			} else {
				popTraverse(current.left, val, current);
				return;
			}
		} else {
			if (current.right == null) {
				return;
			} else {
				popTraverse(current.right, val, current);
				return;
			}
		}
		// left < val < right
	}

	public static void popTraverse(TreeNode current, int val, TreeNode parent) {
		if (current.val == val) {
			if (current.val < parent.val) {
				if (current.left == null && current.right == null) {
					parent.left = null;
					System.out.println(current.val + " deleted.");
					return;
				} else {
					if (current.left == null) {
						parent.left = current.right;
						return;
					} else if (current.right == null) {
						parent.left = current.left;
						return;
					} else {
						parent.left = current.right;
						return;
					}
				}
			} else {
				if (current.left == null && current.right == null) {
					parent.right = null;
					System.out.println(current.val + " deleted.");
					return;
				} else {
					if (current.left == null) {
						parent.right = current.right;
						return;
					} else if (current.right == null) {
						parent.right = current.left;
						return;
					} else {
						parent.right = current.right;
						return;
					}
				}
			}
		}

		if (val < current.val) {
			if (current.left == null) {
				return;
			} else {
				popTraverse(current.left, val, current);
				return;
			}
		} else {
			if (current.right == null) {
				return;
			} else {
				popTraverse(current.right, val, current);
				return;
			}
		}
	}

	public void preOrderTraversal(TreeNode root) {
		if (root == null) {
//			System.out.println("Tree is empty.");
			return;
		}

		System.out.print(root.val + " ");
		size++;
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);

	}

	public void inOrderTraversal(TreeNode root) {
		if (root == null) {
//			System.out.println("Tree is empty.");
			return;
		}

		inOrderTraversal(root.left);
		System.out.print(root.val + " ");
		size++;
		inOrderTraversal(root.right);

	}

	public void postOrderTraversal(TreeNode root) {
		if (root == null) {
//			System.out.println("Tree is empty.");
			return;
		}

		System.out.print(root.val + " ");
		size++;
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);

	}

	public void BSFTraversal(TreeNode root) {
		if (root == null) {
			System.out.println("Tree is empty.");
			return;
		}

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode current = queue.poll();
			System.out.print(current.val + " ");
			if (current.left != null) {
				queue.add(current.left);
			}

			if (current.right != null) {
				queue.add(current.right);
			}
		}

	}
	
	public void ReverseBSFTraversal(TreeNode root) {
		if (root == null) {
			System.out.println("Tree is empty.");
			return;
		}

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode current = queue.poll();
			System.out.print(current.val + " ");
			
			if (current.right != null) {
				queue.add(current.right);
			}
			
			if (current.left != null) {
				queue.add(current.left);
			}
			
		}

	}

//	public void traverse() {
//		inOrderTraversal(root);
//	}
//	
	public static void main(String[] args) {
		Tree tree = new Tree();

		tree.inOrderTraversal(root);

		System.out.println("Push 10");
		tree.push(10);
		tree.inOrderTraversal(root);
		System.out.println("\n");

		System.out.println("Push 20");
		tree.push(20);
		tree.inOrderTraversal(root);
		System.out.println("\n");

		System.out.println("Push 9");
		tree.push(9);
		tree.inOrderTraversal(root);
		System.out.println("\n");

		System.out.println("Push 18");
		tree.push(18);
		tree.inOrderTraversal(root);
		System.out.println("\n");

		System.out.println("Push 15");
		tree.push(15);
		tree.inOrderTraversal(root);
		System.out.println("\n");

		System.out.println("Push 25");
		tree.push(25);
		tree.inOrderTraversal(root);
		System.out.println("\n");

		System.out.println("Push 22");
		tree.push(22);
		tree.inOrderTraversal(root);
		System.out.println("\n");

		System.out.println("Push 19");
		tree.push(19);
		tree.inOrderTraversal(root);
		System.out.println("\n");

		System.out.println("Push 26");
		tree.push(26);
		tree.inOrderTraversal(root);
		System.out.println("\n");

		System.out.println("BSF : ");
		tree.BSFTraversal(root);
		System.out.println("\n");
		
		System.out.println("Reverse BSF : ");
		tree.ReverseBSFTraversal(root);
		System.out.println("\n");

//		System.out.println("Pop 25");
//		tree.pop(25);
//		tree.inOrderTraversal(root);
//		System.out.println("\n");

	}

}
