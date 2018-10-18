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
public class BinaryTree<T> {
    
    private Node root;
    
    public Node insertNode(T data) {
        return this.insertNode(new Node(data), root);
    }
    
    private Node insertNode(Node child, Node parent) {
        if(root == null) {
            root = child;
            return root;
        }
        
        if(parent != null) {
            if(child.getData() < parent.getData()){
                parent.setLeftChild(this.insertNode(child, parent.getLeftChild()));
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

 
    
}
