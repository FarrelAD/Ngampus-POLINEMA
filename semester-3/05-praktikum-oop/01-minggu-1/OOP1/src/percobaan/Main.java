package percobaan;

public class Main {
	String nama;

	public static void main(String[] args) {
		String mhs1 = mahasiswa("Budi", "Laki-laki");
		System.out.println(mhs1);
		System.out.println(mahasiswa("Alex", "Laki-laki"));
	}
	
	public static String mahasiswa(String nama, String jk) {
		return "Nama = " + nama + " berjenis kelamin = " + jk; 
	}
}