package src.pemanasan;

public class Makan {
    private String jenis;
    private Makanan makanan;

    public Makan(String jenis, Makanan makanan) {
        this.jenis = jenis;
        this.makanan = makanan;
    }

    public String getJenis() {
        return jenis;
    }

    public Makanan getMakanan() {
        return makanan;
    }
    
}
