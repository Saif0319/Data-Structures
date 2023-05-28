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

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        System.out.println("Original List:");
        list.print();

        System.out.println("Reversed List:");
        list.reverse();
        list.print();
        

    }
}
