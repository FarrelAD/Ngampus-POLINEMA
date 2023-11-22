import java.util.Scanner;
public class Kubus_12 {
    static Scanner scan12 = new Scanner (System.in);
    static int sisiKubus, luasSisi;
    public static void main(String[] args) {
        System.out.print("Inputkan nilai sisi panjang kubus: ");
        sisiKubus = scan12.nextInt();
        VolumeKubus(sisiKubus);
        LuasPermukaanKubus();
    }
    public static int VolumeKubus(int sisiKubus) {
        luasSisi  = sisiKubus * sisiKubus;
        int volumeKubus = luasSisi * sisiKubus;
        System.out.print("Volume kubus anda: " + volumeKubus);
        System.out.println("");
        return luasSisi;
    }
    public static void LuasPermukaanKubus() {
        int luasPermukaanKubus = luasSisi * 6;
        System.out.print("Luas permukaan kubus anda: " + luasPermukaanKubus);
    }
}