/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructures;

class Node {
        public int value;
        public Node right;
        public Node left;
        
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
}

public class BinarySearchTree {
   public Node root;
   
   
   public BinarySearchTree() {
       this.root = null;
   }
   
   
   
   
   public Node insert(int value) {
       Node node = new Node(value);
       
       if(this.root == null) {
           this.root = node;
           return node;
       } else {
           Node current = this.root;
           while(true) {
               
               if(node.value == current.value) {
                   return null;
               }
               
               if(node.value < current.value) {
                   if(current.left == null) {
                       current.left = node;
                       return node;
                   } else {
                       current = current.left;
                   }
               } else if (node.value > current.value) {
                   if(current.right == null) {
                       current.right = node;
                       return node;
                   } else {
                       current = current.right;
                   }
               }
           }
       }
           
    }
   
   
   
   
   public boolean find(int value) {
       
       if(this.root == null) {
           return false;
       }
       
       if(this.root.value == value) {
           return true;
       }
       
       Node current = this.root;
       
       while (true) {
           
           //left
           if(value < current.value) {
               if(current.left == null) {
                   break;
               } else if (current.left.value == value) {
                   return true;
               } else {
                   current = current.left;
               }
           }
           
       
           //right
           if(value > current.value) {
               if(current.right == null) {
                   break;
               } else if(current.right.value == value) {
                   return true;
               } else {
                   current = current.right;
               }
           }
       }
                  
       return false;
   }
   
   
   
   
}
