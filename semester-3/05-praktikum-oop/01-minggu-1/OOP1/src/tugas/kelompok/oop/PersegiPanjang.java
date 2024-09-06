package tugas.kelompok.oop;

public class PersegiPanjang {

    private float panjang;
    private float lebar;
    
    public PersegiPanjang() {
    	
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public float hitungLuas() {
        return panjang * lebar;
    }
}