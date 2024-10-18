package praktikum7;

public class Laptop extends Komputer {
    public String jenisBaterai;

    public Laptop(String merk, String jenisProcessor, int kecProcessor, int sizeMemory, String jenisBaterai) {
        super(merk, jenisProcessor, kecProcessor, sizeMemory);
        this.jenisBaterai = jenisBaterai;
    }

    public Laptop() { }

    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jenis baterai: " + this.jenisBaterai);
    }
}
