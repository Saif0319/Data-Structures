/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructures;

import java.util.ArrayList;


public class PriorityQueue {
    
    private class Node {
        
        private String value;
        private int priority;
        
        
        public Node(String value, int priority) {
            this.value = value;
            this.priority = priority;
        }
    }
    
    
    private ArrayList<Node> values;
    
    
    public PriorityQueue() {
        this.values = new ArrayList<>();
    }
    
    
    
    public void enqueue(String val, int priority) {
        Node node = new Node(val, priority);
        
        this.values.add(node);
        
        int index = this.values.size() - 1;
        
        while(index > 0) {
            int parentIndex = (index - 1) / 2;
            Node parentNode = this.values.get(parentIndex);
            
            
            if(node.priority >= parentNode.priority) {
                break;
            }
            
            //swap
            this.values.set(index, parentNode);
            this.values.set(parentIndex, node);
            index = parentIndex;
        }
   
    }
    
    
    
    public String dequeue() {
        if(this.values.size() == 1) {
            String val = this.values.get(0).value;
            this.values.remove(0);
            return val;
        }
        
        
        Node first = this.values.get(0);
        Node last = this.values.get(this.values.size() - 1);
        
        this.values.set(0, last);
        this.values.remove(this.values.size() - 1);
        
        int index = 0;
        boolean swap = false;
        
        while(true) {
            int parentIndex = 2 * index + 1;
            Node left;
            Node right;
            
            this.values.set(index, last);
            
            if(parentIndex < this.values.size()) {
                left = this.values.get(parentIndex);
                right = this.values.get(parentIndex + 1);
                
                if(left.priority < last.priority && swap == false && left.priority > right.priority) {
                    this.values.set(index, left);
                    this.values.set(parentIndex, last);
                    swap = true;
                }
            }
            
            
            if(parentIndex + 1 < this.values.size()) {
                right = this.values.get(parentIndex + 1);
                
                if(right.priority < last.priority && swap == false) {
                    this.values.set(index, right);
                    this.values.set(parentIndex, last);
                    swap = true;
                }
                
            }
            
            if(swap == false) {
                break;
            }
            
        }
        
        
        return first.value;
    }
    
    
    
    public String toString() {
        return this.values.toString();
    }

}
