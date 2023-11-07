import java.util.Scanner;

public class DoWhileCuti12 {
    public static void main(String[] args) {
        Scanner scan12 = new Scanner(System.in);

        // Deklarasi variabel
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = scan12.nextInt();

        // Proses looping menggunakan 'DO-WHILE'
        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = scan12.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = scan12.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi.");
                    System.out.print("Apakah Anda ingin mencoba lagi (y/t)? ");
                    String cobaLagi = scan12.next();
                    if (cobaLagi.equalsIgnoreCase("t")) {
                        System.out.println("Terima kasih! Program berhenti.");
                        break; // Menghentikan program jika pengguna memilih 't'
                    }
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                System.out.println("Terima kasih! Program berhenti.");
                break; // Menghentikan program jika pengguna memilih 't'
            } else {
                System.out.println("Pilihan tidak valid. Masukkan 'y' atau 't'.");
            }
        } while (jatahCuti > 0);

        if (jatahCuti <= 0) {
            System.out.println("Anda telah menggunakan semua jatah cuti Anda.");
        }
    }
}
