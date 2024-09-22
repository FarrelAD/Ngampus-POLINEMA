<?php

$nilai_siswa = [85, 92, 78, 64, 90, 55, 88, 79, 70, 96];

$nilai_lulus = [];

foreach ($nilai_siswa as $nilai) {
    if ($nilai >= 70) {
        $nilai_lulus[] = $nilai;
    }
}

echo "Daftar nilai siswa yang lulus: " . implode(", ", $nilai_lulus);

echo "<br><br>";

$daftar_karyawan = [
    ['Alice', 7],
    ['Bob', 3],
    ['Charlie', 9],
    ['David', 5],
    ['Eva', 6]
];

$karyawan_pengalaman_lima_tahun = [];

foreach ($daftar_karyawan as $karyawan) {
    if ($karyawan[1] > 5) {
        $karyawan_pengalaman_lima_tahun[] = $karyawan[0];
    }
}

echo "Daftar karyawan dengan pengalaman kerja lebih dari 5 tahun: " . implode(', ', $karyawan_pengalaman_lima_tahun);

echo "<br><br>";

$daftar_nilai = [
    'Matematika' => [
        ['Alice', 85],
        ['Bob', 92],
        ['Charlie', 78]
    ],
    'Fisika' => [
        ['Alice', 90],
        ['Bob', 88],
        ['Charlie', 75]
    ],
    'Kimia' => [
        ['Alice', 92],
        ['Bob', 80],
        ['Charlie', 85]
    ]
];

$mata_kuliah = 'Fisika';

echo "Daftar nilai mahasiswa dalam mata kuliah $mata_kuliah: <br>";

foreach ($daftar_nilai[$mata_kuliah] as $nilai) {
    echo "Nama: {$nilai[0]}, nilai: {$nilai[1]} <br>";
}