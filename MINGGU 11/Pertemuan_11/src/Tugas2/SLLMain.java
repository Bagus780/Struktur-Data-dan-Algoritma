/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author ASUS
 */
public class SLLMain {
        public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();

        singLL.print();
        singLL.addFirst('A');
        singLL.print();

        singLL.addLast('E');
        singLL.print();

        singLL.insertAt(1, 'C');
        singLL.print();

        singLL.insertAfter('A', 'B');
        singLL.print();

        singLL.insertBefore('E', 'D');
        singLL.print();
    }

}
