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
     * Insere uma valor
     * @param data 
     * @return 
     */
    public Node insertNode(int data) {
        return this.insertNode(new Node(data), root);
    }
    
    /**
     * Insere um nó
     * @param child
     * @param parent
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
     * Busca em ordem
     * @param node 
     */
    public void inOrder(Node node) {
        if(node != null) {
            inOrder(node.getLeftChild());
            System.out.print(node.getData() + " ");
            inOrder(node.getRightChild());
        }
    }
    
    /**
     * Busca pré ordem
     * @param node 
     */
    public void preOrder(Node node) {
        if(node != null) {
            System.out.print(node.getData() + " ");
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }
    
    /**
     * Busca pós ordem
     * @param node 
     */
    public void postOrder(Node node) {
        if(node != null) {
            postOrder(node.getLeftChild());
            postOrder(node.getRightChild());
            System.out.print(node.getData() + " ");
        }
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
        tree.insertNode(15);
        tree.insertNode(22);
        tree.insertNode(14);
        tree.insertNode(18);
        
        System.out.print("Busca em ordem: ");
        tree.inOrder(tree.getRoot());
        System.out.print("\nBusca pré ordem: ");
        tree.preOrder(tree.getRoot());
        System.out.print("\nBusca pós ordem: ");
        tree.postOrder(tree.getRoot());
        System.out.println("\n");
        
    
    }

}
