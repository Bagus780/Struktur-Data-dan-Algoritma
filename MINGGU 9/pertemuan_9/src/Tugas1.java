/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Tugas1 {

    public int size;
    public int top;
    char[] stack;

    public Tugas1(int size) {
        this.size = size;
        top = -1;
        stack = new char[size];
    }

    public void push(char r) {
        top++;
        stack[top] = r;
    }

    public void ProsesBalik(String RN) {
        for (int i = 0; i < size; i++) {
            char temp = RN.charAt(i);
            push(temp);
        }
    }

    public void PrintBalik(String D) {
        ProsesBalik(D);
        for (int i = (size - 1); i >= 0; i--) {
            System.out.print(stack[i]);
        }
    }
}
