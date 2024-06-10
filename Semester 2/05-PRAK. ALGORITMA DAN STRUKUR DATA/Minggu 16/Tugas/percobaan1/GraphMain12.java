package percobaan1;
import java.util.Scanner;

public class GraphMain12 {
    static Scanner sc12 = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        Graph12 gedung = new Graph12(6);

        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1, 3);
        gedung.printGraph();

        // Pertanyaan percobaan 1
        char ulangiMenu = 'y';
        do {
            menu();
            int selectedMenu = sc12.nextInt();
            switch (selectedMenu) {
                case 1:
                    addEdge(gedung);
                    break;
                case 2:
                    removeEdge(gedung);
                    break;
                case 3:
                    degree(gedung);
                    break;
                case 4:
                    gedung.printGraph();
                    break;
                case 5:
                    cekEdge(gedung);
                    break;
                case 6:
                    updateJarak(gedung);
                    break;
                case 7:
                    gedung.hitungEdge();
                    break;
                default:
                    System.out.println("Input ivalid!");
                    break;
            }

            System.out.print("\nUlangi menu: ");
            ulangiMenu = sc12.next().charAt(0);
        } while (ulangiMenu == 'y' || ulangiMenu == 'Y');
    }

    private static void menu() {
        System.out.print(
            "Pilih menu\n" + 
            "-----------------------\n" +
            "   1. Add egde\n" + 
            "   2. Remove edge\n" +
            "   3. Degree\n" +
            "   4. Print Graph\n" +
            "   5. Cek Edge\n" +
            "   6. Update jarak\n" +
            "   7. Hitung edge\n" +
            ">>> "
        );
    }

    private static void addEdge(Graph12 gedung) {
        System.out.print("Masukkan gedung asal: ");
        int inputGedungAsal = sc12.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int inputGedungTujuan = sc12.nextInt();
        System.out.print("Masukkan jarak antar gedung: ");
        int inputJarakGedung = sc12.nextInt();
        gedung.addEdge(inputGedungAsal, inputGedungTujuan, inputJarakGedung);
    }

    private static void removeEdge(Graph12 gedung) throws Exception {
        System.out.print("Masukkan gedung asal: ");
        int inputGedungAsal = sc12.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int inputGedungTujuan = sc12.nextInt();
        gedung.removeEdge(inputGedungAsal, inputGedungTujuan);
    }

    private static void degree(Graph12 gedung) throws Exception {
        System.out.print("Masukkan gedung asal: ");
        int inputGedungAsal = sc12.nextInt();
        gedung.degree(inputGedungAsal);
    }

    private static void cekEdge(Graph12 gedung) {
        System.out.print("Masukkan gedung asal: ");
        int inputGedungAsal = sc12.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int inputGedungTujuan = sc12.nextInt();
        gedung.checkEdge(inputGedungAsal, inputGedungTujuan);
    }

    private static void updateJarak(Graph12 gedung) {
        System.out.print("Masukkan gedung asal: ");
        int inputGedungAsal = sc12.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int inputGedungTujuan = sc12.nextInt();
        System.out.print("Masukkan jarak terbaru: ");
        int jarakTerbaru = sc12.nextInt();
        gedung.updateJarak(inputGedungAsal, inputGedungTujuan, jarakTerbaru);
    }
}