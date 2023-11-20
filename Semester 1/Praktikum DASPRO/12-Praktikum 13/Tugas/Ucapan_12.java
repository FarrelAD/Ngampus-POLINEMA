import java.util.Scanner;
public class Ucapan_12 {
    public static String PenerimaUcapan() {
        Scanner sc12 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc12.nextLine();
        sc12.close();
        return namaOrang;
    }
    public static void main(String[] args) {
        // String nama = PenerimaUcapan();
        // System.out.println("Thank you " + nama + "\nMay the force be with you.");
        System.out.println("Thank you " + PenerimaUcapan() + "\nMay force be with you.");
    }
}
