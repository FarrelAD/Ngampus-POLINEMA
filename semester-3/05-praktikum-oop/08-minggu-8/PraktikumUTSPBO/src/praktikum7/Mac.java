package praktikum7;

public class Mac extends Laptop {
    public String security;

    public Mac(String merk, String jenisProcessor, int kecProcessor, int sizeMemory, String jenisBaterai, String security) {
        super(merk, jenisProcessor, kecProcessor, sizeMemory, jenisBaterai);
        this.security = security;
    }

    public Mac() { }

    public void tampilMac() {
        super.tampilLaptop();
        System.out.println("Security: " + this.security);
    }
}
