/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

/**
 *
 * @author ASUS
 */
public class BinaryTreeArrayMain {

    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.println("Menggunakan In Order");
        bta.traverseInOrder(0);
        System.out.println();
        System.out.println("Menggunakan Post Order");
        bta.traversePostOrder(0);
        System.out.println();
        System.out.println("Menggunakan Pre Order");
        bta.traversePreOrder(0);
    }
}

