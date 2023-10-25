import java.util.Scanner;
/**
 * TugasIndividu2
 */
public class TugasIndividu2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //String username, password;//

        System.out.print("Masukkan username anda : ");
        String username = sc.nextLine();
        
        System.out.print("Masukkan password anda : ");
        String password = sc.nextLine();

        if (username.equals("Farrel") && password.equals("123")) {
            System.out.println("Selamat masuk ke system");
        } else {
            System.out.println("Peringatan username atau Password anda salah!");
        }

    }
}