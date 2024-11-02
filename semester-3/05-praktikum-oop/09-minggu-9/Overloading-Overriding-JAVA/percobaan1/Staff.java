public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;
    
    public int getLembur() {
        return lembur;
    }

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + this.lembur * this.gajiLembur;
    }

    @Override
    public double getGaji() {
        return super.getGaji() + this.lembur * this.gajiLembur;
    }

    public void lihatInfo() {
        System.out.printf(
        """
        NIP: %s
        Nama: %s
        Golongan: %s
        Jumlah lembur: %d
        Gaji lembur: %.0f
        Gaji: %.0f
        """,
        this.getNip(),
        this.getNama(),
        this.getGolongan(),
        this.getLembur(),
        this.getGajiLembur(),
        this.getGaji()
        );
    }
}
