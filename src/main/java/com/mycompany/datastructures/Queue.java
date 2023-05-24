/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructures;

/**
 *
 * @author PC
 */
public class Queue {
    private int[] queue;
    private int maxSize;
    private int currentSize;
    private int front;
    private int rear;
    
    
    
    public Queue(int size) {
        this.maxSize = size;
        this.queue = new int[this.maxSize];
        this.currentSize = 0;
        this.front = 0;
        this.rear = -1;
    }
    
    
    
    public void enqueue(int num) {
        if(this.currentSize == this.maxSize ) {
            System.out.println("Error, queue is full");
            return;
        } else {
            this.rear = (this.rear + 1) % this.maxSize;
            this.queue[rear] = num;
            this.currentSize++;
        }
        
        
    }
    
    
    public int dequeue() {
        if(this.currentSize == 0) {
            System.out.println("Error, queue is empty");
            return -1;
        }
        
        int removedItem = this.queue[front];
        this.front = (this.front + 1) % this.maxSize;
        this.currentSize--;
        
        return removedItem;
    } 
    
    
    public int peek() {
        if(this.currentSize == 0) {
            System.out.println("Error, queue is empty");
            return -1;
        }
        
        return this.queue[front];
    }
    
    
    public boolean isEmpty() {
        return this.currentSize == 0;
    }
    
    
    public boolean isFull() {
        return this.currentSize == this.maxSize;
    }
}
