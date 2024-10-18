package praktikum5;
public class Main {
    public static void main(String[] args) {
        Mahasiswa farrel = new Mahasiswa(
            "Farrel", 
            new Ktm(
                "Farrel", 
                "2341720081", 
                "D4 Teknik Informatika")
        );
        farrel.setStnk(
            new Stnk(
                "A 123 B", 
                "Agus", 
                "Kawasaki", 
                "1AN123", 
                "Ungu Terong", 
                200)
        );
        farrel.setMotor(
            new Motor(
                "Kawasaki", 
                "A 123 B", 
                "Ungu Terong", 
                200)
        );

        Mahasiswa kibar = new Mahasiswa(
            "Kibar", 
            new Ktm(
                "Candra", 
                "1231231231", 
                "D4 Teknik Informatika")
        );
        kibar.setMotor(
            new Motor(
                "Kawasaki", 
                "K 999 HH", 
                "Emas", 
                250)
        );

        PetugasParkir jaka = new PetugasParkir("Jaka", "123456");
        PetugasParkir tingkir = new PetugasParkir("Tingkir", "669933");

        farrel.keluarParkiran(tingkir);
        kibar.keluarParkiran(jaka);
    }
}
