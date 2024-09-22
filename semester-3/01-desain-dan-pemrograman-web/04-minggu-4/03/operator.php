<?php

$a = 10;
$b = 5;

$hasilTambah = $a + $b;
$hasilKurang = $a - $b;
$hasilKali = $a * $b;
$hasilBagi = $a / $b;
$sisaBagi = $a % $b;
$pangkat = $a ** $b;

echo "
    <h1>Inisialisasi Nilai</h1>
    <p>a = {$a}</p>
    <p>b = {$b}</p>
    <hr>
    <h1>Hasil operasi aritmatika sederhana</h1>
    <ul>
        <li>Penjumlahan: {$hasilTambah}</li>
        <li>Pengurangan: {$hasilKurang}</li>
        <li>Perkalian: {$hasilKali}</li>
        <li>Pembagian: {$hasilBagi}</li>
        <li>Sisa hasil bagi: {$sisaBagi}</li>
        <li>Perpangkatan (a^b): {$pangkat}</li>
    </ul> 
";

$hasilSama = $a == $b;
$hasilTidakSama = $a != $b;
$hasilLebihKecil = $a < $b;
$hasilLebihBesar = $a > $b;
$hasilLebihKecilSama = $a <= $b;
$hasilLebihBesarSama = $a >= $b;

echo "
    <br><hr>
    <h1>Membandingkan suatu nilai di PHP</h1>
    <ol>
        <li>Apakah nilainya sama: ";  var_dump($hasilSama); echo "</li>
        <li>Apakah nilainya tidak sama: "; var_dump($hasilTidakSama); echo "</li>
        <li>Apakah hasil lebih kecil: "; var_dump($hasilLebihKecil); echo "</li>
        <li>Apakah hasil lebih besar: "; var_dump($hasilLebihBesar); echo "</li>
        <li>Apakah hasil lebih kecil atau sama dengan: "; var_dump($hasilLebihKecilSama); echo "</li>
        <li>Apakah hasil lebih besar atau dama dengan: "; var_dump($hasilLebihBesarSama); echo "</li>
    </ol>
";

$hasilAnd = $a && $b;
$hasilOr = $a || $b;
$hasilNotA = !$a;
$hasilNotB = !$b;

echo "
    <br><hr>
    <h1>Operasi AND, OR, dan NOT</h1>
    <ul>
        <li>Hasil operasi AND: "; var_dump($hasilAnd); echo "</li>
        <li>Hasil operasi OR: "; var_dump($hasilOr); echo "</li>
        <li>Hasil operasi NOT - A: "; var_dump($hasilNotA); echo "</li>
        <li>Hasil operasi NOT - B: "; var_dump($hasilNotB); echo "</li>
    </ul>
";

echo "
    <br><hr>
    <h1>Compound Assigment</h1>
    <ul>
        <li>Hasil dari $a += $b => "; $a += $b; echo $a . "</li>
        <li>Hasil dari $a -= $b => "; $a -= $b; echo $a . "</li>
        <li>Hasil dari $a *= $b => "; $a *= $b; echo $a . "</li>
        <li>Hasil dari $a /= $b => "; $a /= $b; echo $a . "</li>
        <li>Hasil dari $a %= $b => "; $a %= $b; echo $a . '</li>
    </ul>
';

$hasilIdentik = $a === $b;
$hasilTidakIdentik = $a !== $b;

echo "
    <br><hr>
    <h1>Pengecekan Keidentikan sebuah Nilai</h1>
    <ul>
        <li>Apakah variabel <b>a</b> identik dengan variabel <b>b</b>: "; var_dump($hasilIdentik); echo "</li>
        <li>Apakah variabel <b>a</b> tidak identik dengan variabel <b>b</b>: "; var_dump($hasilTidakIdentik); echo "</li>
    </ul>
";

?>