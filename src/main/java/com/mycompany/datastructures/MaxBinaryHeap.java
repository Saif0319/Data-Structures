package com.mycompany.datastructures;

import java.util.ArrayList;

public class MaxBinaryHeap {
    private ArrayList<Integer> values;
    
    
    public MaxBinaryHeap() {
        this.values = new ArrayList<>();
    }
    
    
    public void insert(int val) {
        this.values.add(val);
        
        int index = this.values.size() - 1;
        int element = this.values.get(index);
        
        while(index > 0) {
            
            int parentIndex = (index - 1) / 2;
            int parent = this.values.get(parentIndex);
            
            if(element <= parent) {
                break;
            }
               
            //swap
            this.values.set(parentIndex, element);
            this.values.set(index, parent);

            //update the index and the value
            index = parentIndex;
        }    
    }
    
    
    
    public int extractMax() {
        
        if(this.values.size() == 1) {
            int element = this.values.remove(0);
            System.out.println("Heap is empty now!");
            return element;
        }
        
        int first = this.values.get(0);
        int last = this.values.get(this.values.size() - 1);
        
        this.values.set(0, last);
        this.values.remove(this.values.size() - 1);
        

        int index = 0;
        
        
        while(true) {
            int parentIndex = 2 * index + 1;
            
            int left;
            int right;
            this.values.set(index, last);
            boolean swap = false;
                    
                    
            //make sure it's not out of bound
            if(parentIndex < this.values.size()) {
                left = this.values.get(parentIndex);
                right = this.values.get(parentIndex+1);
                
                //check if the left child is greater than the parent
                if(last < left && swap == false && left > right) {
                    this.values.set(index, left);
                    index = parentIndex;
                    swap = true;
                }
            }
            
            
            //make sure it's not out of bound
            if(parentIndex + 1 < this.values.size()) {
                right = this.values.get(parentIndex + 1);
                
                //check if the right child is greater than the parent
                if(last < right && swap == false) {
                    this.values.set(index, right);
                    index = parentIndex;
                    swap = true;
                }
            }
            
            
            if(swap == false) {
                break;
            }

        }
        
        return first;
    }
    
    
    
    public String toString() {
        return this.values.toString();
    }
}
