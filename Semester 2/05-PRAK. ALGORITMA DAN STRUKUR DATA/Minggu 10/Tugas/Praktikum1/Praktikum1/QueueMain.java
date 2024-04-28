package Praktikum1;
import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);

        int pilihanMenu;

        System.out.print("Masukkan kapasitas queue: ");
        int n = sc12.nextInt();
        Queue Q = new Queue(n);

        do {
            menu();
            pilihanMenu = sc12.nextInt();
            switch (pilihanMenu) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc12.nextInt();
                    Q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3: 
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                default:
                    break;
            }
        } while (pilihanMenu == 1 || pilihanMenu == 2 || pilihanMenu == 3 || pilihanMenu == 4 || pilihanMenu == 5);
    }

    public static void menu() {
        System.out.print(
            "\n\nMasukkan operasi yang diinginkan: \n" +
            "   1. Enqueue\n" +
            "   2. Dequeue\n" +
            "   3. Print\n" +
            "   4. Peek\n" +
            "   5. Clear\n" +
            "=====================================\n" +
            " >>> "
        );
    }
}
