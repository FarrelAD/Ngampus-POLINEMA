package belajar1;

public class Student extends Manusia {
    private String nim;

    public void setBiodata(String nama) {
        super.setNama(nama);
    }

    public void setBiodata(String nama, int umur, String alamat, String nim) {
        super.setBiodata(nama, umur, alamat);
        this.nim = nim;
    }
}
