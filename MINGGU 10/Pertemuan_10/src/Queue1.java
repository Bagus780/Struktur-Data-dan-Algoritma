/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Queue1 {

    public int max, size, front, rear;
    Mahasiswa[] Q;

    public Queue1(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new Mahasiswa[max];
        size = 0;
        front = rear - 1;
    }

    public void Enqueue(Mahasiswa data) {
        if (IsFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }

    public Mahasiswa Dequeue() {
        Mahasiswa data = new Mahasiswa("", "", 0, 0);
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear - 1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Antrian terdepan : " + Q[front].nim + " "
                    + Q[front].nama + " " + Q[front].absen + " " + Q[front].ipk);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Antrian terakhir : " + Q[rear].nim + " "
                    + Q[rear].nama + " " + Q[rear].absen + " " + Q[rear].ipk);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(Q[i].nim + " " + Q[i].nama + " "
                        + Q[i].absen + " " + Q[i].ipk);
                i = (i + 1) % max;
            }
            System.out.println(Q[i].nim + " " + Q[i].nama + " " + Q[i].absen
                    + " " + Q[i].ipk);
            System.out.println("Jumlah Antrian : " + size);
        }
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekPosition(String data) {
        int x = 0;
        for (int i = 0; i <= max - 1; i++) {
            if (data.equals(Q[i].nim)) {
                System.out.println(
                        
            }
        }
    }
}
