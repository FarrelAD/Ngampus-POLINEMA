package tugas.kelompok.oop;

public class BujurSangkar {
	
	private float sisi;
	
	public BujurSangkar() {
		
	}
	
	public float hitungLuas() {
		return sisi * sisi;
	}
	
	public float hitungKeliling() {
		return 4 * sisi;
	}
	
	public void setSisi(float sisi) {
		this.sisi = sisi;
	}	
}