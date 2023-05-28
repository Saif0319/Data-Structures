/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructures;

/**
 *
 * @author PC
 */
public class MyLinkedList {
    private class Node {
        private int value;
        private Node next;
        
        
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    
    
    private Node head;
    private int size;

    
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    
    public boolean isEmpty() {
        return this.head == null;
    }
    
    
    public int getSize() {
        return this.size;
    }
    
    
    public void prepend(int value) {
        Node node = new Node(value);
        
        if(isEmpty()) {
            this.head = node;
            this.size++;
        } else {
            node.next = this.head;
            this.head = node;
            this.size++;
        }
    }
    
    
    
    public void append(int value) {
        Node node = new Node(value);
        
        if(isEmpty()) {
            this.head = node;
            this.size++;
        } else {
            Node current = this.head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = node;
            this.size++;
        }
    }
    
    
    
    //Insert at index
    public void insert(int value, int index) {
        
        Node node = new Node(value);
        
        if(index < 0 || index > this.size) {
            System.out.println("Invalid index");
            return;
        } 
        
        if (index == 0) {
            node.next = this.head;
            this.head = node;
            this.size++;
        } else {
            Node current = this.head;
            for(int i=0; i<index - 1; i++) {
                current = current.next;
            }
            
            node.next = current.next;
            current.next = node;
            this.size++;
        }    
    }
    
    
    
    //Remove by index
    public void remove(int index) {   
        
        if(index < 0 || index > this.size) {
            System.out.println("Invalid index");
            return;
        } 
        
        if(index == 0) {
            this.head = this.head.next;
            this.size--;
        } else {
            Node current = this.head;
            
            for(int i=0; i<index-1; i++) {
                current = current.next;
            }
            Node removedItem = current.next;
            current.next = removedItem.next;
            this.size--;  
        }
    }
    
    
    
    
    //Remove by value
    public void removeVal(int value) {
        if(isEmpty()) {
            System.out.println("Empty");
            return;
        }
        
        
        if(this.head.value == value) {
            this.head = this.head.next;
            this.size--;    
            return;
        } else {
            Node current = this.head;
            
            while(current.next != null && current.next.value != value) {
                current = current.next;
            }
            
            if(current.next.value == value) {
                current.next = current.next.next;
                this.size--;
            } else {
                System.out.println("Node does not exist");
                return;
            }
            
        }
    }
    
    
    
    
    //Search by value
    public int search(int value) {
        
        if (isEmpty()) {
            return -1;
        } 
        
        Node current = this.head;
        int index = 0;

        while(current != null) {
            if(current.value == value) {
                return index;
            }
            
            current = current.next;
            index++;
        }
        
        System.out.println("Error 404 Not Found :(");
        return -1;
    }
    
    
    
    public void reverse() {
        Node prev = null;
        Node current = this.head;
        
        while(current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        this.head = prev;
        
    }
    
    
    
    
    public void print() {
        Node current = this.head;
        
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}
