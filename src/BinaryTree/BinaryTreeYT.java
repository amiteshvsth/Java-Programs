package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

//Build a Tree from its Preorder traversal
public class BinaryTreeYT {

    static class Node {
        int data; 
        Node left;
        Node right;

        // constructor initializing the variables values
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        //initializing it with -1 because we are incrementing it when building a tree so that our index starts from 0
        static int idx = -1;

        //return type is Node
        public static Node buildTree(int nodes[]) {
            //every time we call build tree recursively it increases its index
            idx++;
            //base case 
            if (nodes[idx] == -1) {
                return null;
            }
            //creating a object of node class storing left and right node in that
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        //printing current node data
        System.out.print(root.data + " ");
        //traversing left subtree
        preorder(root.left);
        //traversing right subtree
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        //traversing left subtree
        inorder(root.left);
         //printing current node data
        System.out.print(root.data + " ");
        //traversing right subtree
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        //traversing left subtree
        postorder(root.left);
        //traversing right subtree
        postorder(root.right);
         //printing current node data
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        //creating object q of Queue class 
        //creating a LinkedList of queue type
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        //loop till q is not empty
        while (!q.isEmpty()) {
            //first removing every node and then printing
            Node curr = q.remove();

            //here if curr node points to null print next line
            if (curr == null) {
                System.out.println();

                // if the queue becomes empty after null exiting the loop
                if (q.isEmpty()) {
                    break;
                } else {
                    //here adding last element to queue so to print nextline for next level
                    q.add(null);
                }
            } else {
                //when curr node is not pointing to null printing node data
                System.out.print(curr.data + " ");

                //here curr refers to the root node
                if (curr.left != null) {

                    //if curr node's left is not null adding left node to the queue
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    //if curr node's right is not noull adding right node to the queue
                    q.add(curr.right);
                }
            }
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        //recursively going to the leftmost node
        int leftHeight = height(root.left);

        //recursively going to the rightmost node
        int rightHeight = height(root.right);

        //returning max height from both nodes because levels can differ and adding 1 for root node  later
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        //calculating diameter at every node
        int diam1 = height(root.left) + height(root.right) + 1;
        //diameter of left subtree
        int diamLeft = diameter(root.left);
        //diameter of right subtree
        int diamRight = diameter(root.right);
        return Math.max(diam1, Math.max(diamLeft, diamRight));
    }

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        //diameter of left subtree
        TreeInfo left = diameter2(root.left);
        //diameter of right subtree
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.ht + right.ht + 1;
        int diamLeft = left.diam;
        int diamRight = right.diam;
        
        int myDiam = Math.max(diam1, Math.max(diamLeft, diamRight));
        return new TreeInfo(myHeight, myDiam);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        //this function mathches subroot if root mathches
        public boolean isIdentical(TreeNode root, TreeNode subRoot) {
            //if both the nodes which we are searching and the one in the tree are null 
            if (subRoot == null && root == null) {
                return true;
            }
            //if either of them is null
            if (root == null || subRoot == null) {
                return false;
            }
            //if both matches 
            if (root.val == subRoot.val) {
                //mathches left subtree of that subtree
                return isIdentical(root.left, subRoot.left) &&
                //matches right subtree of that tree
                        isIdentical(root.right, subRoot.right);
            }
            return false;
        }

        //here subroot refers to the node which we are checking 
        //and root refers to that node of that tree in which we are cheking
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {

            //if the node which we are checking is null it is always true 
            //coz null node exists in every tree
            if (subRoot == null) {
                return true;
            }
            //if the node doesnt exist/it is null we cannot compare
            if (root == null) {
                return false;
            }
            //this function mathches subroot if root mathches
            if (isIdentical(root, subRoot)) {
                return true;
            }
            //recursively calling it for left subtree of every node 
            //and right subtree of every node 
            //if any found true returns true else false
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(root.data);
    }
}
