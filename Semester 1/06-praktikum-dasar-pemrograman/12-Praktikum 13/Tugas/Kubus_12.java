import java.util.Scanner;
public class Kubus_12 {
    static Scanner scan12 = new Scanner (System.in);
    static int  luasSisi;
    public static void main(String[] args) {
        System.out.print("Inputkan nilai sisi panjang kubus: ");
        int sisiKubus = scan12.nextInt();
        // Langsung memanggil fungsi
        // VolumeKubus(sisiKubus); 
        // LuasPermukaanKubus();
        // Mencetak sekaligus memanggil fungsi VolumeKubus
        System.out.printf("Volume kubusnya adalah: %d\n", VolumeKubus(sisiKubus)); 
        System.out.printf("Luas permukaan kubusnya adalah: %d", LuasPermukaanKubus());
    }

    // public static void VolumeKubus(int sisiKubus) {
    //     luasSisi  = sisiKubus * sisiKubus;
    //     int volumeKubus = luasSisi * sisiKubus;
    //     System.out.print("Volume kubus anda: " + volumeKubus);
    //     System.out.println("");
    // }

    public static int VolumeKubus(int sisiKubus) {
        luasSisi = sisiKubus * sisiKubus;
        int volumeKubus = luasSisi * sisiKubus;
        return volumeKubus;
    }

    // public static void LuasPermukaanKubus() {
    //     int luasPermukaanKubus = luasSisi * 6;
    //     System.out.print("Luas permukaan kubus anda: " + luasPermukaanKubus);
    // }

    public static int LuasPermukaanKubus() {
        int luasPermukaanKubus = luasSisi * 6;
        return luasPermukaanKubus;
    }
}