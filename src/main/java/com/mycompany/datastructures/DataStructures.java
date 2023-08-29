/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datastructures;

/**
 *
 * @author PC
 */
public class DataStructures {

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        
        priorityQueue.enqueue("Task 1", 3);
        priorityQueue.enqueue("Task 2", 1);
        priorityQueue.enqueue("Task 3", 5);
        priorityQueue.enqueue("Task 4", 2);
        
        System.out.println(priorityQueue);
    }
}
