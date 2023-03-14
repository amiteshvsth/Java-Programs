package BinaryTree;
import java.util.*;

class SumofNodesK {

	static class Node {
		int data;
		Node left;
		Node right;
	};

	// Function to create new Binary Tree Node
	static Node newNode(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.left = null;
		newNode.right = null;
		return newNode;
	};
	
	//sum of all Nodes at Kth level using level order traversal
	static int sumOfNodesAtNthLevel(Node root, int k) {
		// If the current Node is null
		if (root == null)
			return 0;

		// Create Queue
		Queue<Node> que = new LinkedList<>();

		// Enqueue the root Node
		que.add(root);

		// Level is used to track the current level
		int level = 0;

		//sum of Nodes at the Kth level
		int sum = 0;

		// flag is used to break out of  the loop after the sum of all
		// the Nodes at Nth level is found
		int flag = 0;

		// Iterate the queue till its not empty
		while (!que.isEmpty()) {

			// Calculate the number of Nodes in the current level
			int size = que.size();

			// Process each Node of the current
			// level and enqueue their left
			// and right child to the queue
			while (size-- > 0) {
				Node ptr = que.peek();
				que.remove();

				// If the current level matches the
				// required level then calculate the
				// sum of all the Nodes at that level
				if (level == k) {

					// Flag initialized to 1
					// indicates that sum of the
					// required level is calculated
					flag = 1;

					// Calculating the sum of the Nodes
					sum += ptr.data;
				} else {

					// Traverse to the left child till it is null
					if (ptr.left != null)
						que.add(ptr.left);

					// Traverse to the right child till it is null
					if (ptr.right != null)
						que.add(ptr.right);
				}
			}

			// Increment the variable level by 1 for each level
			level++;

			// Break out from the loop after the sum
			// of Nodes at K level is found
			if (flag == 1)
				break;
		}
		return sum;
	}

	public static void main(String[] args) {
		Node root = new Node();

		// Tree Construction
		root = newNode(50);
		root.left = newNode(30);
		root.right = newNode(70);
		root.left.left = newNode(20);
		root.left.right = newNode(40);
		root.right.left = newNode(60);
		root.right.right = newNode(10);
		root.right.left.left = newNode(90);
		root.right.left.right = newNode(60);
		root.right.right.left = newNode(110);
		root.right.right.right = newNode(120);
		int level = 5;
		int result = sumOfNodesAtNthLevel(root, level);

		// Printing the result
		System.out.print(result);
	}
}
