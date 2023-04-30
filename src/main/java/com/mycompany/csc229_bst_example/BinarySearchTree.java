package com.mycompany.csc229_bst_example;

//package com.mycompany.csc229_bst_example;
/**
 *
 * @author MoaathAlrajab
 */
import com.mycompany.csc229_bst_example.BstNode;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private BstNode root;

    public boolean isEmpty() {
        return (this.root == null);
    }

    public void insert(Integer data) {

        System.out.print("[input: " + data + "]");
        if (root == null) {
            this.root = new BstNode(data);
            System.out.println(" -> inserted: " + data);
            return;
        }
        insertNode(this.root, data);
        System.out.print(" -> inserted: " + data);
        System.out.println();
    }

    private BstNode insertNode(BstNode root, Integer data) {

        BstNode tmpNode = null;
        System.out.print(" ->" + root.getData());
        if (root.getData() >= data) {
            System.out.print(" [L]");
            if (root.getLeft() == null) {
                root.setLeft(new BstNode(data));
                return root.getLeft();
            } else {
                tmpNode = root.getLeft();
            }
        } else {
            System.out.print(" [R]");
            if (root.getRight() == null) {
                root.setRight(new BstNode(data));
                return root.getRight();
            } else {
                tmpNode = root.getRight();
            }
        }
        return insertNode(tmpNode, data);
    }
    
    
   // ToDo 1: complete InOrder Traversal 
    public void inOrderTraversal() {
        doInOrder(this.root);
    }

    private void doInOrder(BstNode root) {
    if (root != null) {
        doInOrder(root.getLeft());
        System.out.print(root.getData() + " ");
        doInOrder(root.getRight());
    }
     
    }
    
    
       // ToDo 2: complete the pre-order travesal . 
        public void preOrderTraversal() {
     doPreOrder(this.root);
       
     
    }
        private void doPreOrder(BstNode root){
      if (root != null) {
            System.out.print(root.getData() + " ");
            doPreOrder(root.getLeft());
            doPreOrder(root.getRight());
        
    }
    
        }
        //Height//
public int findHeight() {
    return getHeight(this.root);
}
    private int getHeight(BstNode root) {
if (root == null) {
        return -1;
    } else {
        int leftHeight = getHeight(root.getLeft());
        int rightHeight = getHeight(root.getRight());
        return 1 + Math.max(leftHeight, rightHeight);
    }
    }
    
    
    //ToDo 4: complete getDepth of a node 

    public int findDepth(){
        return getDepth(this.root);
    }

    private int getDepth(BstNode node) {
        
        if (node == null) {
        return 0;
    }
    int leftDepth = getDepth(node.getLeft());
    int rightDepth = getDepth(node.getRight());
    return Math.max(leftDepth, rightDepth) + 1;
    }
    
    
    
      // ToDo 5: complete the print of the BST
   public void print() {
       System.out.println("\n==== BST Print ===== \n");
    System.out.print("In-order Traversal: ");
    doInOrder(this.root);
    System.out.println();

    // Level-order traversal
    System.out.print("Pre-order Traversal: ");
    doPreOrder(this.root);
    System.out.println();
    
    //Height//
    System.out.println("Tree height: " + findHeight());
    
    //Depth//
    System.out.println("Tree depth: " + findDepth());
        
    
  
      
    }

}


