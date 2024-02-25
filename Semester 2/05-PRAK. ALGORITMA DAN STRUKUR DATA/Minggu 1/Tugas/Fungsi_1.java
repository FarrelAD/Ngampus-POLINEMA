import java.util.Scanner;

public class Fungsi_1 {
    static int[] stokBungaRG1 = new int[4];
    static int[] stokBungaRG2 = new int[4];
    static int[] stokBungaRG3 = new int[4];
    static int[] stokBungaRG4 = new int[4];

    private static int hitungPendapatan() {
        int totalPendapatan = 0;
        for (int i = 0; i < stokBungaRG1.length; i++) {
            switch (i) {
                case 0:
                    totalPendapatan += 75000 * (stokBungaRG1[0] + stokBungaRG2[0] + stokBungaRG3[0] + stokBungaRG4[0]);
                    break;
                case 1:
                    totalPendapatan += 50000 * (stokBungaRG1[1] + stokBungaRG2[1] + stokBungaRG3[1] + stokBungaRG4[1]);
                    break;
                case 2:
                    totalPendapatan += 60000 * (stokBungaRG1[2] + stokBungaRG2[2] + stokBungaRG3[2] + stokBungaRG4[2]);
                    break;
                case 3:
                    totalPendapatan += 10000 * (stokBungaRG1[3] + stokBungaRG2[3] + stokBungaRG3[3] + stokBungaRG4[3]);
                    break;
                default:
                    break;
            }
        }
        return totalPendapatan;
    }

    private static void tampilStokBunga(int cabang) {
        switch (cabang) {
            case 1:
                System.out.println("Algonema: " + stokBungaRG1[0]);
                System.out.println("Keladi: " + stokBungaRG1[1]);
                System.out.println("Alocasia: " + stokBungaRG1[2]);
                System.out.println("Mawar: " + stokBungaRG1[3]);
                break;
            case 2: 
                System.out.println("Algonema: " + stokBungaRG2[0]);
                System.out.println("Keladi: " + stokBungaRG2[1]);
                System.out.println("Alocasia: " + stokBungaRG2[2]);
                System.out.println("Mawar: " + stokBungaRG2[3]);
                break;
            case 3:
                System.out.println("Algonema: " + stokBungaRG3[0]);
                System.out.println("Keladi: " + stokBungaRG3[1]);
                System.out.println("Alocasia: " + stokBungaRG3[2]);
                System.out.println("Mawar: " + stokBungaRG3[3]);
                break;
            case 4:
                System.out.println("Algonema: " + stokBungaRG4[0]);
                System.out.println("Keladi: " + stokBungaRG4[1]);
                System.out.println("Alocasia: " + stokBungaRG4[2]);
                System.out.println("Mawar: " + stokBungaRG4[3]);
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Memberikan nilai stok bunga pada masing-masing cabang
        stokBungaRG1[0] = 10;
        stokBungaRG1[1] = 5;
        stokBungaRG1[2] = 15;
        stokBungaRG1[3] = 7;

        stokBungaRG2[0] = 6;
        stokBungaRG2[1] = 11;
        stokBungaRG2[2] = 9;
        stokBungaRG2[3] = 12;

        stokBungaRG3[0] = 2;
        stokBungaRG3[1] = 10;
        stokBungaRG3[2] = 10;
        stokBungaRG3[3] = 5;

        stokBungaRG4[0] = 5;
        stokBungaRG4[1] = 7;
        stokBungaRG4[2] = 12;
        stokBungaRG4[3] = 9;

        // Menampilkan pendapatan pada seluruh cabang
        System.out.println("Pendapatan seluruh cabang");
        System.out.println("Rp "+hitungPendapatan());

        System.out.println("===================================");

        // Perubahan pada data toko RoyalGarden4
        stokBungaRG4[0] -= 1;
        stokBungaRG4[1] -= 2;
        stokBungaRG4[3] -= 5;

        // Menampilkan stok bunga
        System.out.print(
            "Pilih cabang yang ingin dipilih: \n" + 
            " 1. RoyalGarden1\n" + 
            " 2. RoyalGarden2\n" +
            " 3. RoyalGarden3\n" +
            " 4. RoyalGarden4\n" +
            ">>> "
        );
        int cabangDipilih = scan.nextInt();

        tampilStokBunga(cabangDipilih);
    }
}
