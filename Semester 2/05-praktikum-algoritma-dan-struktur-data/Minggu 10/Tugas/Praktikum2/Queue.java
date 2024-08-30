package Praktikum2;

import TugasAkhir.Pembeli;

public class Queue {
    Nasabah[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue (int n) {
        max = n;
        data = new Nasabah[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        // From jobsheet
        // if (size == 0) {
        //     return true;
        // } else {
        //     return false;
        // }

        // Opsi lain menggunakan ternary operator
        return size == 0;
    }

    public boolean isFull() {
        // From jobsheet 
        // if (size == max) {
        //     return true;
        // } else {
        //     return false;
        // }

        // Opsi lain menggunakan ternary operator
        return size == max;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].norek + " " + data[front].nama +
            " " + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong!");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + 
                    " " + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + 
                " " + data[i].umur + " " + data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void enqueue(Nasabah dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(0);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }

            data[rear] = dt;
            size++;
        }
    }

    public Nasabah dequeue() {
        Nasabah dt = new Nasabah();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(0);
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }

        return dt;
    }

    public Nasabah peekRear() {
        Nasabah result = new Nasabah();
        if (isEmpty()) {
            System.out.println("Queue masih kosong!");
        } else {
            // Array sementara untuk menampung data yang diambil
            Nasabah[] dataSementara = new Nasabah[size];
            int totalData = 0;

            // Proses dequeue sampai menyentuh index `rear`
            while (front != rear) {
                dataSementara[totalData] = dequeue(); // Memanfaatkan method 'dequeue' untuk mengeluarkan data
                totalData++;

            }
            // Data di elemen terakhir disimpan di variable 
            result = data[front];

            // Proses dequeue data terakhir
            dataSementara[totalData] = dequeue();
            totalData++;

            // Mengembalikan data ke data aslinya
            for (int i = 0; i < totalData; i++) {
                enqueue(dataSementara[i]);
            }

        }
        return result;
    }
}