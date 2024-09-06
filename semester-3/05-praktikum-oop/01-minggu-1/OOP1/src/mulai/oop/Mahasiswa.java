package mulai.oop;

public class Mahasiswa {
	private String nama;
	private int umur;
	private String nim;
	
	public Mahasiswa(String nama, int umur, String nim) {
		this.nama = nama;
		this.umur = umur;
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}
	
	public String getNim() {
		return nim;
	}
	
	public int getUmur() {
		return umur;
	}
	
	public void setNama(String namaBaru) {
		nama = namaBaru;
	}
	
	public void setUmur(int umurBaru) {
		umur = umurBaru;
	}
	
	public void setNim(String nimBaru) {
		nim = nimBaru;
	}
}
