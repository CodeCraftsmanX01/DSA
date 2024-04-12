package trees;

import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;

 public class BinaryTreeLevelOrdertraversal
    {
        int data;
        BinaryTreeLevelOrdertraversal left;
        BinaryTreeLevelOrdertraversal right;
        BinaryTreeLevelOrdertraversal(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    //building tree first
    public static BinaryTreeLevelOrdertraversal createBinaryTree(){
        BinaryTreeLevelOrdertraversal rootNode =new BinaryTreeLevelOrdertraversal(4);
        BinaryTreeLevelOrdertraversal node20=new BinaryTreeLevelOrdertraversal(20);
        BinaryTreeLevelOrdertraversal node10=new BinaryTreeLevelOrdertraversal(10);
        BinaryTreeLevelOrdertraversal node30=new BinaryTreeLevelOrdertraversal(30);
        BinaryTreeLevelOrdertraversal node60=new BinaryTreeLevelOrdertraversal(60);
        BinaryTreeLevelOrdertraversal node50=new BinaryTreeLevelOrdertraversal(50);
        BinaryTreeLevelOrdertraversal node70=new BinaryTreeLevelOrdertraversal(70);
 
        rootNode.left=node20;
        rootNode.right=node60;
 
        node20.left=node10;
        node20.right=node30;
 
        node60.left=node50;
        node60.right=node70;
 
        return rootNode;
    }
    
    
    // prints in level order
    public static void levelOrderTraversal(BinaryTreeLevelOrdertraversal startNode) {
        Queue<BinaryTreeLevelOrdertraversal> queue=new LinkedList<BinaryTreeLevelOrdertraversal>();
        queue.add(startNode);
        while(!queue.isEmpty())
        {
            BinaryTreeLevelOrdertraversal tempNode=queue.poll();
            if(tempNode==null) {
            	System.out.println();
            }
            else {
            System.out.printf("%d ",tempNode.data);
            if(tempNode.left!=null) {
                queue.add(tempNode.left);
            	}
            if(tempNode.right!=null) {
                queue.add(tempNode.right);
            	}
            }
        }
    }
        
    
//main method
    public static void main(String[] args)
    {
        // Creating a binary tree
        BinaryTreeLevelOrdertraversal rootNode=createBinaryTree();
        System.out.println("Level Order traversal of binary tree will be:");
        levelOrderTraversal(rootNode);
    }
 
    }