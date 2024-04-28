package TugasAkhir;

public class Queue {
    Pembeli[] antrian;
    int front, rear, size, max;

    public Queue(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        return size == max - 1;
    }

    public void enqueue(Pembeli antri) {
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

            antrian[rear] = antri;
            size++;
            System.out.println("Telah di enqueue");
        }
    }

    public Pembeli dequeue() {
        Pembeli data = new Pembeli();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(0);
        } else {
            data = antrian[front];
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

        return data;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong!");
        } else {
            int nomor = 1;
            int x = front;
            System.out.println("--Data seluruh antrian--");
            while (x != rear) {
                System.out.println(
                    "\nData ke-" + nomor +
                    "\n   - Nama : " + antrian[x].nama + 
                    "\n   - No HP : " + antrian[x].noHp
                );
                x = (x + 1) % max;
                nomor++;
            }
            System.out.println(
                "\nData ke-" + nomor +
                "\n   - Nama : " + antrian[x].nama + 
                "\n   - No HP : " + antrian[x].noHp
            );
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong!");
        } else {
            System.out.println("Data paling depan: " + antrian[front].nama + ", " + antrian[front].noHp);
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong!");
        } else {
            Pembeli dataBelakang;
            // Array sementara untuk menampung data yang diambil
            Pembeli[] dataSementara = new Pembeli[size];
            int totalData = 0;

            // Proses dequeue sampai menyentuh index `rear`
            while (front != rear) {
                dataSementara[totalData] = dequeue(); 
                totalData++;

            }
            // Data di elemen terakhir disimpan di variable 
            dataBelakang = antrian[front];

            // Proses dequeue data terakhir
            dataSementara[totalData] = dequeue();
            totalData++;

            // Mengembalikan data ke data aslinya
            for (int i = 0; i < totalData; i++) {
                enqueue(dataSementara[i]);
            }

            System.out.println("Data paling belakang: " + dataBelakang.nama + ", " + dataBelakang.noHp);
        }
    }
    

    public void peekPosition(String nama) {
        int posisiData = -1;
        Pembeli dataSementara[] = new Pembeli[size];
        int totalData = 0;

        while (front != rear) {
            if (antrian[front].nama.equals(nama)) {
                posisiData = front;
            }
            // Proses pengambilan data dari antrian
            dataSementara[totalData] = dequeue();
            totalData++;
        }

        // Proses dequeue data terakhir
        dataSementara[totalData] = dequeue();
        totalData++;
        
        // Proses pengembalian data ke tempat aslinya
        for (int i = 0; i < totalData; i++) {
            enqueue(dataSementara[i]);
        }

        if (posisiData == -1) {
            System.out.println("Data " + nama + " tidak ditemukan di dalam antrian");
        } else {
            System.out.println("Data " + nama + " berada di posisi: " + (posisiData + 1));
        }
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong!");
        } else {
            int nomor = 1;
            int x = front;
            System.out.println("--Data seluruh antrian--");
            while (x != rear) {
                System.out.println(
                    "\nData ke-" + nomor +
                    "\n   - Nama : " + antrian[x].nama + 
                    "\n   - No HP : " + antrian[x].noHp
                );
                x = (x + 1) % max;
            }
            System.out.println(
                "\nData ke-" + nomor +
                "\n   - Nama : " + antrian[x].nama + 
                "\n   - No HP : " + antrian[x].noHp
            );
        }
    }
}
