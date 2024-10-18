package praktikum7;

public class Windows extends Laptop {
    public String fitur;

    public Windows(String merk, String jenisProcessor, int kecProcessor, int sizeMemory, String jenisBaterai,
            String fitur) {
        super(merk, jenisProcessor, kecProcessor, sizeMemory, jenisBaterai);
        this.fitur = fitur;
    }

    public Windows() { }

    public void tampilWindows() {
        super.tampilLaptop();
        System.out.println("Fitur: " + fitur);
    }
}
