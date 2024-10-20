package tugas.kelompok.oop;

import java.util.Scanner;

public class Main {
	private static int opsiNgitung = 0;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int pilihan = 1;
		while (pilihan > 0 && pilihan < 5) {
			showMenu();
			pilihan = sc.nextInt();
			switch (pilihan) {
				case 1:
					showOpsi();
					BujurSangkar bs = new BujurSangkar();
					System.out.print("Panjang sisi: ");
					float sisiInput = sc.nextFloat();
					bs.setSisi(sisiInput);
					if (opsiNgitung == 1) {
						System.out.println("\nLuas bujur sangkar: " + bs.hitungLuas());
					} else if (opsiNgitung == 2) {
						System.out.println("\nKeliling bujur sangkar: " + bs.hitungKeliling());
					}
				break;
			case 2:
				showOpsi();
				Segitiga sg = new Segitiga();
				System.out.print("Panjang alas: ");
				float alas = sc.nextFloat();
				System.out.print("Panjang tinggi: ");
				float tinggi = sc.nextFloat();
				System.out.print("Panjang sisi ketiga: ");
				float sisiKetiga = sc.nextFloat();
				sg.setAlas(alas);
				sg.setSisiLain(sisiKetiga);
				sg.setTinggi(tinggi);
				if (opsiNgitung == 1) {
					System.out.println("\nluas segitiga: " + sg.hitungLuas());
				} else if (opsiNgitung == 2) {
					System.out.println("\nKeliling segitiga: " + sg.hitungKeliling());
				}
				break;
			case 3:
				showOpsi();
				PersegiPanjang pp = new PersegiPanjang();
				System.out.print("Panjang : ");
				float panjang = sc.nextFloat();
				System.out.print("Lebar: ");
				float lebar = sc.nextFloat();
				pp.setLebar(lebar);
				pp.setPanjang(panjang);
				if (opsiNgitung == 1) {
					System.out.println("\nluas persegi panjang: " + pp.hitungLuas());
				} else if (opsiNgitung == 2) {
					System.out.println("\nKeliling persegi panjang: " + pp.hitungKeliling());
				}
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("SALAH PILIHAN WOY");
			}
		}
	}
	
	private static void showMenu() {
		System.out.print("\n\n\n1. Bujur sangkar \n2. Segitiga\n3. Persegi panjang\n4. KELUAR\n>> ");
	}
	
	private static void showOpsi() {
		System.out.print("1. Luas\n2. Keliling\n>> ");
		opsiNgitung = sc.nextInt();
	}
	
	

}
