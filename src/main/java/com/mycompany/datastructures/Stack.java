/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructures;
import java.util.ArrayList;


/**
 *
 * @author PC
 */
public class Stack {
    private int[] stack;
    private int maxSize;
    private int top;
    
    
    
    public Stack(int size) {
        this.maxSize = size;
        this.stack = new int[this.maxSize];
        this.top = -1;
    }
    
    
    public void push(int num) {
        if(this.top == this.maxSize - 1) {
            System.out.println("Error, Stack is FULL");
            return;
        }
        
        this.top++;
        this.stack[top] = num;
    }
    
    
    
    public int peek() { 
        if(this.top ==  -1) {
            System.out.println("Error, stack is empty");
            return -1;
        }    
        return this.stack[top];
    }
    
    
    
    public int pop() {
        if(this.top == -1) {
            System.out.println("Error, stack is empty");
            return -1;
        } else {
            int removedItem = this.stack[top];
            this.top--;
            return removedItem;
        }
        
        
    }
    
    
    
    public boolean isEmpty() {
        return this.top == -1;
    }
    
    
    public boolean isFull() {
        return this.top == this.maxSize - 1;
    }
    
    
    
}
