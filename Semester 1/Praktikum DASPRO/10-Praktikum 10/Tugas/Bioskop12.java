public class Bioskop12 {
    public static void main(String[] args) {
        // Deklarasi variabel array string penonton
        String[][] penonton = new String[4][2];
        // Mengisi variabel
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Dela";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        // Menampilkan semua isi elemen array string penonton
        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        System.out.println("===================================================================="); // Pembatas

        // Menampilkan berapa panjang dari nilai pada array
        System.out.println(penonton.length);
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);

        System.out.println("===================================================================="); // Pembatas

        // Menampilkan panjang setiap baris pada array
        System.out.println(penonton.length);
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-"+ (i+1) + ": " + penonton[i].length);
        }

        System.out.println("===================================================================="); // Pembatas

        // Menampilkan panjang setiap baris pada array menggunakan foreach loop
        System.out.println(penonton.length);
        for (String[] barisPentonton : penonton) {
            System.out.println("Panjang baris: " + barisPentonton.length);
        }
        
        System.out.println("===================================================================="); //Pembatas

        // Menampilkan nama penonton pada baris ke-3 menggunakan for loop
        System.out.println("Penonton pada baris ke-3: ");
        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }

        System.out.println("===================================================================="); //Pembatas

        // Modifikasi code untuk menampilkan baris ke-3 menggunakan for-each loop
        System.out.println("Penonton pada baris ke-3: ");
        for (String i : penonton[2]) {
            System.out.println(i);
        }

        System.out.println("===================================================================="); //Pembatas

        // Modifikasi code untuk menampilkan nama penonton untuk setiap baris
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
        }


    }
}