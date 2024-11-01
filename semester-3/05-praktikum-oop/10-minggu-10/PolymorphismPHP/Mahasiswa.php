<?php

require_once __DIR__ . "/Manusia.php";

class Mahasiswa extends Manusia {
    public $nim, $nilai_semester;

    public function __construct(string $nama, int $usia, string $alamat, string $nim) {
        parent::__construct($nama, $usia, $alamat);
        $this->nim = $nim;
        $this->nilai_semester = 0;
    }

    /**
     * menginputkan nilai baru dan menjummlahkannya ke dalam $nilai_semester
     * @param int $nilai_asli [wajib] 
     * @param int $nilai_remidi [opsional]
     * @return void
     */
    public function tambahNilai(int $nilai_asli, int $nilai_remidi = -1) : void {
        $nilai_baru = ($nilai_remidi != -1) ? ($nilai_asli + $nilai_remidi) / 2 : $nilai_asli;
        $this->nilai_semester = $nilai_baru;
        echo "Nilai baru saja ditambahkan. Nilai saat ini: $this->nilai_semester" . PHP_EOL;
    }

    // Overriding
    public function tambahEnergi() : void {
        $this->energi += 5;
        echo "Manusia telah ditambahkan energinya sebanyak 5" . PHP_EOL;
        echo "Jumlah energi saat ini: $this->energi" . PHP_EOL;
    }

    // Overriding
    public function printBiodata() : void {
        echo "NIM : ". $this->nim . PHP_EOL;
    }
}
