package Praktikum2;
import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc12.nextInt();
        Queue antri = new Queue(jumlah);

        int pilihMenu;
        do {
            menu();
            pilihMenu = sc12.nextInt();
            sc12.nextLine();
            switch (pilihMenu) {
                case 1:
                    System.out.print("No rekening: ");
                    String norek = sc12.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc12.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc12.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc12.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc12.nextDouble();
                    sc12.nextLine();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    antri.enqueue(nb);
                    break;
                case 2:
                    Nasabah data = antri.dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) &&
                        data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian terakhir: " + data.norek + " " + data.nama + " "
                            + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    Nasabah data2 = antri.peekRear();
                    if (!"".equals(data2.norek) && !"".equals(data2.nama) && !"".equals(data2.alamat) &&
                        data2.umur != 0 && data2.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data2.norek + " " + data2.nama + " "
                            + data2.alamat + " " + data2.umur + " " + data2.saldo);
                        break;
                    }
                    break;
                default:
                    break;
            }
        } while (pilihMenu == 1 || pilihMenu == 2 || pilihMenu == 3 || pilihMenu == 4);
    }

    public static void menu() {
        System.out.print(
            "\n\nPilihan menu: \n" +
            "   1. Antrian baru\n" +
            "   2. Antrian keluar\n" +
            "   3. Cek antrian terdepan\n" +
            "   4. Cek semua antrian\n" + 
            "   5. Cek antrian paling belakang\n" +
            "=====================================\n" +
            " >>> "
        );
    }
}
