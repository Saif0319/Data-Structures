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
        MyLinkedList list = new MyLinkedList();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Initial list:");
        list.print();

        // Removing elements by value
        list.removeVal(20);
        //list.removeVal(10);
        //list.removeVal(20);

        System.out.println("Updated list after removals:");
        list.print();
        

    }
}
