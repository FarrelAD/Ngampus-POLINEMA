package praktikum6;

public class DaftarGaji {
    public Pegawai[] listPegawai;
    private int jumlahPegawaiSaatIni = 0;

    private DaftarGaji(int total) {
        this.listPegawai = new Pegawai[total];
    }

    private void addPegawai(Pegawai pegawai) {
        listPegawai[jumlahPegawaiSaatIni] = pegawai;
        jumlahPegawaiSaatIni++;
    }

    public void printSemuaGaji() {
        for (Pegawai pegawai : listPegawai) {
            System.out.println(pegawai.nama);
            System.out.println(pegawai.nip);
            System.out.println(pegawai.alamat);
            // System.out.println(gaji ???????);
        }
    }
}
