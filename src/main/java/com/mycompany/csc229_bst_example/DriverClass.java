/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc229_bst_example;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
    public static void main(String a[]) {
 
        BinarySearchTree  Bst = new BinarySearchTree();
        Bst.insert(8);
        Bst.insert(10);
        Bst.insert(14);
        Bst.insert(3);
        Bst.insert(6);
        Bst.insert(7);
        Bst.insert(1);
        Bst.insert(4);
        Bst.insert(13);
        System.out.println("\n-------------------");
        System.out.println("In Order Traversal");
        Bst.inOrderTraversal();
        
        Bst.print();
    }
}
