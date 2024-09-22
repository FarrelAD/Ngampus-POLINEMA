<?php

define("TOTAL_KURSI", 45);
$totalKursiTerisi = 28;

$persentaseKursiKosong = (TOTAL_KURSI - $totalKursiTerisi) * 100 / TOTAL_KURSI;

echo "Jumlah persentase kursi kosong:  $persentaseKursiKosong% ";

?>