/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructures;

/**
 *
 * @author PC
 */
public class HashMap {
    private int[] table;
    private int size;
    
    
    public HashMap(int size) {
        this.size = size;
        this.table = new int[this.size];
    }
    
    
    public int hash(String key) {
        int total = 0;
        
        for(int i=0; i < key.length(); i++) {
            total += key.charAt(i);
        }
        
        return total % this.size;
    }
    
    
    
    public void set(String key, int value) {
        int index = this.hash(key);
        
        this.table[index] = value;
    }
    
    
    public int get(String key) {
        int index = this.hash(key);
        
        return this.table[index];
    }
    
    
    public void remove(String key) {
        int index = this.hash(key);
        this.table[index] = 0;
    }
}
