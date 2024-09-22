<?php

$harga_produk = 120000;
$jumlah_belanja = 1;
$diskon = 0.2;
$batas_minimum = 100000;

$harga_dibayar = $harga_produk * $jumlah_belanja;
if ($harga_produk > $batas_minimum) {
    $harga_dibayar = $harga_produk -  $harga_produk * $diskon;
}

echo "Harga yang harus dibayar: $harga_dibayar";