import java.util.Scanner;
public class PemilihanPercobaan212 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.print("Nilai UAS     : ");
        float uas = input12.nextFloat();
        System.out.print("Nilai UTS     : ");
        float uts = input12.nextFloat();
        System.out.print("Nilai Kuis    : ");
        float kuis = input12.nextFloat();
        System.out.print("Nilai Tugas   : ");
        float tugas = input12.nextFloat();
        
        
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        /*
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        */
        
        String message;

        if (total > 80) {
            message = "Anda mendapat nilai A";
        } else if (total > 73) {
            message = "Anda mendapat nilai B+";
        } else if (total > 65) {
            message = "Anda mendapat nilai B";
        } else if (total > 60) {
            message = "Anda mendapat nilai C+";
        } else if (total > 50) {
            message = "Anda mendapat nilai C";
        } else if (total > 39) {
            message = "Anda mendapat nilai D";
        } else {
            message = "Anda mendapat nilai E";
        }

        System.out.println("Nilai akhir = " +total+ " sehingga " + message);
    }
    
}
