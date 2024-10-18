package praktikum7;

public class Komputer {
    public String merk, jenisProcessor;
    public int kecProcessor, sizeMemory;

    public Komputer(String merk, String jenisProcessor, int kecProcessor, int sizeMemory) {
        this.merk = merk;
        this.jenisProcessor = jenisProcessor;
        this.kecProcessor = kecProcessor;
        this.sizeMemory = sizeMemory;
    }

    public Komputer() { }

    public void tampilData() {
        System.out.printf(
            """
            Merk: %s
            Jenis processor: %s
            Kecepatan processor: %d
            Size memory: %d
            """,
            this.merk,
            this.jenisProcessor,
            this.kecProcessor,
            this.sizeMemory
        );
    }
}
