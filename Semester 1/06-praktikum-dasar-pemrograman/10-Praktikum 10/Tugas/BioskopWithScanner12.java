import java.util.Scanner;
public class BioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next, menuLagi = "Y";

        String[][] penonton = new String [4][2];

        while (menuLagi.equalsIgnoreCase("Y")) {
            System.out.println("Silakan pilih opsi menu: ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Menu yang dipilih: ");
            menu = scan1.nextInt();
            
            switch (menu) {
                case 1:
                while (true) {
                System.out.println("ANDA MEMILIH MENU INPUT DATA PENONTON");
                System.out.print("Masukkan nama: ");
                nama = scan2.nextLine();
                System.out.print("Masukkan baris: ");
                baris = scan2.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = scan2.nextInt();
                scan2.nextLine();

                // Pengecekan ketersediaan kursi di bioskop
                if (baris <= 4 && kolom <= 2) {
                    if (penonton[baris - 1][kolom - 1] == null) {
                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.print("Input penonton lainnya? (Y/T) : ");
                        next = scan2.nextLine();

                        if (next.equalsIgnoreCase("t")) {
                            break;
                        }
                    } else {
                        System.out.println("Kursi telah terisi");
                    }
                } else {
                    System.out.println("Kursi tidak tersedia");
                }
            
                }
                break; // Akhir dari case 1
                case 2: 
                System.out.println("ANDA MEMILIH MENU DAFTAR PENONTON");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[0].length; j++) {
                        if (penonton[i][j] == null) {
                            penonton[i][j] = "***";
                        }
                    }
                }
                System.out.println("Daftar penonton: ");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
                }
                break; 
                case 3: 
                System.out.println("ANDA MEMILIH MENU EXIT");
                menuLagi = "t";
                break;
                default:
                System.out.println("INPUT INVALID");
                break;
            }
            if (!menuLagi.equalsIgnoreCase("Y") ) {
                break;
            }

        }
        
        
    }
}
