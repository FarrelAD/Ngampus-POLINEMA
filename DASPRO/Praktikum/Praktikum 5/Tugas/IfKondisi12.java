import java.util.Scanner;
public class IfKondisi12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.print("Masukkan Suhu: ");
        int suhu = sc12.nextInt();

        if (suhu < 16) {
            System.out.println("Silakan menggunakan jaket");
        } else if (suhu < 20) {
            System.out.println("Silakan pakai baju tebal");
        } else {
            System.out.println("Silakan pakai topi");
        }
        
        
    }
    
}
