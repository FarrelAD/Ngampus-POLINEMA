package mulai.oop;

public class Main {

	public static void main(String[] args) {
		Mahasiswa mhs1 = new Mahasiswa("Bejo", 20, "23412918");
		
		System.out.println("Nama mahasiswa 1 : " + mhs1.getNama());
		System.out.println("NIM mahasiswa 1 : " + mhs1.getNim());
		System.out.println("Umur mahasiswa 1 : " + mhs1.getNim());
		
		String[] spesialisasi1 = {"AI", "Web"};
		Guru guru1 = new Guru("Adi", spesialisasi1);
		
		Mahasiswa mhs2 = new Mahasiswa(null, 0, null);
	}
}