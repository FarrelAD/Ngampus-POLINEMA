package praktikum6;

public class Dosen extends Pegawai {
    public int jumlahSKS;
    public int TARIF_SKS;

    private Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    private void setSks(int sksBaru) {
        this.jumlahSKS = sksBaru;
    }

    private int getGaji() {
        return 0;
    }
}
