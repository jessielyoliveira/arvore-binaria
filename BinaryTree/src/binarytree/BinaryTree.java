/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author jessiely
 */
public class BinaryTree {
    
    private Node root;

    public BinaryTree() {
        this.root = null;
    }
    
    public Node getRoot() {
        return root;
    }
    

    /**
     * 
     * @param data O valor a ser inserido
     * @return Um nó com o valor de data
     */
    public Node insertNode(int data) {
        return this.insertNode(new Node(data), root);
    }
    
    /**
     * 
     * @param child O nó a ser inserido
     * @param parent O nó pai que receberá child
     * @return 
     */
    public Node insertNode(Node child, Node parent) {
        if(root == null) {
            root = child;
            return root;
        }
        
        if(parent != null) {
            if(child.getData() < parent.getData()) {
                parent.setLeftChild(this.insertNode(child, parent.getLeftChild()));
            } else if(child.getData() > parent.getData()) {
                parent.setRightChild(this.insertNode(child, parent.getRightChild()));
            } 
        } else {
            parent = child;
        }
        return parent;
    }
    
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree tree = new BinaryTree();
                
        tree.insertNode(10);
        tree.insertNode(20);
        tree.insertNode(5);
        tree.insertNode(3);
        tree.insertNode(6);

        
        
        
    
    }

}
