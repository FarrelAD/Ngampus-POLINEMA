package percobaan;

public class Sepeda {
	String merk;
	float harga;
	int kecepatan;
	int gear;
	
	public Sepeda(String merk, float harga, int kecepatan, int gear) {
		this.merk = merk;
		this.harga = harga;
		this.kecepatan = kecepatan;
		this.gear = gear;
	}
	
	public Sepeda() {
		
	}
	
	
	public String getMerk() {
		return this.merk;
	}
	
	public int getKecepatan() {
		return this.kecepatan;
	}
	
	public float getHarga() {
		return this.harga;
	}
	
	public void setMerk(String merk) {
		this.merk = merk;
	}
	
	public void setHarga(float harga) {
		this.harga = harga;
	}
	
	public void addSpeed(int kecepatan) {
		this.kecepatan += kecepatan;
	}
}
