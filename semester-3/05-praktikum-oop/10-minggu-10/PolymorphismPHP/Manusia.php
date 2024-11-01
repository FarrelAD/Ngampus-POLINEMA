<?php

class Manusia {
    public $nama, $usia, $alamat, $energi;

    public function __construct(string $nama, int $usia, string $alamat) {
        $this->nama = $nama;
        $this->usia = $usia;
        $this->alamat = $alamat;
        $this->energi = 85;
    }

    public function tambahEnergi() : void {
        $this->energi += 10;
        echo "Manusia telah ditambahkan energinya sebanyak 10" . PHP_EOL;
        echo "Jumlah energi saat ini: $this->energi" . PHP_EOL;
    }

    public function printBiodata() : void {
        echo "Nama: ". $this->nama . PHP_EOL;
        echo "Usia: " . $this->usia . PHP_EOL;
        echo "Alamat: ". $this->alamat . PHP_EOL;
    }
}