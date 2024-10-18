package praktikum5;

import java.util.Scanner;

public class PetugasParkir {
    private String nama, idPetugas;

    public PetugasParkir(String nama, String idPetugas) {
        this.nama = nama;
        this.idPetugas = idPetugas;
    }

    public String getNama() {
        return nama;
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public void cekStnk(Mahasiswa mhs) {
        Stnk stnk = mhs.getStnk();
        Motor motor = mhs.getMotor();

        if (stnk != null && motor != null) {
            if (stnk.getNomorStnk().equals(motor.getPlatKendaraan())) {
                System.out.println(
                    """
                    Plat nomor kendaraan dan nomor STNK sesuai!
                    Mahasiswa diperkenankan keluar dari area parkir
                    """
                );
            } else {
                System.out.printf(
                    """
                    [!] Plat nomor kendaraan:  %s tidak sesuai dengan nomor STNK: %s [!]
    
                    Mahasiswa dimohon membuktikan data diri untuk membuktikan dia adalah mahasiswa asli Polinema
                    """,
                    motor.getPlatKendaraan(),
                    stnk.getNomorStnk()
                );
                konfirmasiCekKtm(mhs);
            }
        } else if (stnk == null && motor == null) {
            System.out.println(
                """
                [!] Mahasiswa tidak memiliki STNK dan motor [!]
                Tidak dapat melanjutkan proses pengecekan kendaraan bermotor
                """
            );
        } else if (stnk == null) {
            System.out.println(
                """
                [!] Mahasiswa tidak memiliki STNK [!]
                Tidak dapat melanjutkan proses pengecekan kendaraan bermotor
                """
            );
            konfirmasiCekKtm(mhs);
        } else if (motor == null) {
            System.out.println(
                """
                [!] Mahasiswa tidak memiliki motor [!]
                Tidak dapat melanjutkan proses pengecekan kendaraan bermotor
                """
            );
        }
    }

    private void konfirmasiCekKtm(Mahasiswa mhs) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cek KTM ? (y/t): ");
        char konfirmasi = sc.next().charAt(0);

        if (konfirmasi == 'y') {
            cekKtm(mhs);
        }
        sc.close();
    }

    private void cekKtm(Mahasiswa mhs) {
        if (mhs.getKtm() != null) {
            Ktm ktm = mhs.getKtm();
            if (ktm.getNama().equals(mhs.getNama())) {
                System.out.println(
                    """
                    Data valid! 
                    Mahasiswa diperkenankan keluar area parkir
                    """
                );
            } else {
                System.out.println(
                    """
                    Data tidak valid!
                    Mahasiswa tidak diperkenankan keluar area parkir
                    """
                );
            }
        }
    }
}
