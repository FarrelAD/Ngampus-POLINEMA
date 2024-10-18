package praktikum7;

public class Pc extends Komputer {
    public int ukuranMonitor;

    public Pc(String merk, String jenisProcessor, int kecProcessor, int sizeMemory, int ukuranMonitor) {
        super(merk, jenisProcessor, kecProcessor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }

    public Pc() { }

    public void tampilPc() {
        super.tampilData();
        System.out.println("Ukuran monitor: " + ukuranMonitor);
    }
}
