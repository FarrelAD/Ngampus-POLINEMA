import java.util.Scanner;

public class UcapanTerimakasih_12 {
    static Scanner sc12 = new Scanner(System.in);

    public static String PenerimaUcapan() {
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc12.nextLine();
        return namaOrang;
    }

    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void UcapanTambahan(String ucapanTambahan) {
        System.out.println(ucapanTambahan);
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
        System.out.println("Adakah ucapan lain yang ingin ditambahkan?");
        String ucapanTambahan = sc12.nextLine();
        UcapanTambahan(ucapanTambahan);
        sc12.close(); 
    }
}
