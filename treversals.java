package trees;

import java.util.Stack;

public class treversals{
	 static Node root;
	 
	//preorder traversal
	
	static void iterativePreorder(Node node){
	 
	        // Base Case
	        if (node == null) {
	            return;
	        }
	 
	        // Create an empty stack and push root to it
	        Stack<Node> nodeStack = new Stack<Node>();
	        nodeStack.push(root);
	 
	        /* Pop all items one by one. Do following for every popped item
	         a) print it
	         b) push its right child
	         c) push its left child
	         Note that right child is pushed first so that left is processed first */
	        while (nodeStack.empty() == false) {
	 
	            // Pop the top item from stack and print it
	            Node mynode = nodeStack.peek();
	            System.out.print(mynode.data + " ");
	            nodeStack.pop();
	 
	            // Push right and left children of the popped node to stack
	            if (mynode.right != null) {
	                nodeStack.push(mynode.right);
	            }
	            if (mynode.left != null) {
	                nodeStack.push(mynode.left);
	            }
	        }
	    }
	
	//postorder traversal
	static void iterativePostorder(Node node){
		 
		 Stack<Node> stack = new Stack<>();
	        while(true) {
	            while(root != null) {
	                stack.push(root);
	                stack.push(root);
	                root = root.left;
	            }
	             
	            // Check for empty stack
	            if(stack.empty()) return;
	            root = stack.pop();
	             
	            if(!stack.empty() && stack.peek() == root) root = root.right;
	             
	            else {
	                 
	                System.out.print(root.data + " "); root = null;
	            }
	        }
    }
	
	
	//Inorder traversal
	static void iterativeInorder(Node node){
		     // create an empty stack
		     Stack<Node> stack = new Stack<>();
		    
		     // start from the root node (set current node to the root node)
		        Node curr = root;
		    
		        // if the current node is null and the stack is also empty, we are done
		        while (!stack.empty() || curr != null)
		        {
		            // if the current node exists, push it into the stack (defer it)
		            // and move to its left child
		            if (curr != null)
		            {
		                stack.push(curr);
		                curr = curr.left;
		            }
		            else {
		                // otherwise, if the current node is null, pop an element from
		                // the stack, print it, and finally set the current node to its
		                // right child
		                curr = stack.pop();
		                System.out.print(curr.data + " ");
		    
		                curr = curr.right;
		            }
		        }
    }
	public static void main(String[] args) {
		 treversals tree = new treversals();
	        tree.root = new Node(10);
	        tree.root.left = new Node(8);
	        tree.root.right = new Node(2);
	        tree.root.left.left = new Node(3);
	        tree.root.left.right = new Node(5);
	        tree.root.right.left = new Node(2);
	        System.out.println("preorder traversal of tree :-");
	        tree.iterativePreorder(root);
	        System.out.println();
	        System.out.println("postorder traversal of tree :-");
	        tree.iterativePostorder(root);
	        System.out.println();
	        System.out.println("Inorder traversal of tree :-");
	        tree.iterativeInorder(root);

	}

}
