<?php

$angka1 = 10;
$angka2 = 5;
$hasil = $angka1 + $angka2;

echo "<p>Hasil penjumlahan $angka1 dan $angka2 adalah $hasil</p>";

$benar = true;
$salah = false;

echo "<p>Variabel benar: $benar, Variabel salah: $salah</p>";

define("NAMA_SITUS", "websiteku.com");
define("TAHUN_PENDIDIKAN", 2023);

echo "<p>Selamat datang di " . NAMA_SITUS . ", situs yang didirikan pada tahun " . TAHUN_PENDIDIKAN . ". </p>";
?>