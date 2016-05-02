/**
 * 
 */
package tree;

/**
 * @author sundaramtiwari
 *
 */
public class BinaryTreeImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

}

class BinaryTree {

	// Reference to the root;
	private Node root;
	private int treeCount;

	public BinaryTree() {
		root = new Node(null);
		treeCount = 0;
	}

	public void add(Object data) {
		Node node = new Node(data);

		// traverse the tree to find correct position to insert this node
		Node currentNode = root;

		// check if root doesn't exists, create node and return
		if (!root.exists()) {
			root.data = data;
			root.leftChild = null;
			root.rightChild = null;
		} else {
			// Traverse through root till find correct position to add new node
			while (currentNode.hasChildren()) {
				currentNode = currentNode.getLeftChild();
			}
		}
		
	}

	private class Node {

		// Data content of this node.
		private Object data;

		// Reference to the left child of this node
		private Node leftChild;

		// Reference to the right child of this node
		private Node rightChild;

		public boolean exists() {
			return this.data != null;
		}

		public boolean hasChildren(){
			return this.leftChild.exists() || this.rightChild.exists();
		}

		public boolean hasOneChild() {
			return this.leftChild.exists() && !this.rightChild.exists();
		}

		public boolean isLeaf() {
			return !this.leftChild.exists() && !this.rightChild.exists();
		}

		public Node(Object data) {
			this.data = data;
			leftChild = null;
			rightChild = null;
		}

		public Node(Object data, Node leftChild, Node rightChild) {
			this.data = data;
			this.leftChild = leftChild;
			this.rightChild = rightChild;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		public Node getLeftChild() {
			return leftChild;
		}

		public void setLeftChild(Node leftChild) {
			this.leftChild = leftChild;
		}

		public Node getRightChild() {
			return rightChild;
		}

		public void setRightChild(Node rightChild) {
			this.rightChild = rightChild;
		}
	}
}
