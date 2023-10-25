import java.util.Scanner;
public class ForVar312 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int bil, n;
    boolean berhenti = false;
    for (n = 0; !berhenti; n++) {
        System.out.print("Masukkan bilangan: ");
        bil = sc.nextInt();
        System.out.println("Bilangan yang Anda masukkan: " + bil);
        if (bil < n) {
            berhenti = true;
        }
    }
    System.out.println("Program berakhir");
    }
}
