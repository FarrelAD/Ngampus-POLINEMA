<?php

$data_siswa = [
    ['Alice', 85],
    ['Bob', 92],
    ['Charlie', 78],
    ['David', 64],
    ['Eva', 90]
];

$total_nilai_siswa = 0;

foreach ($data_siswa as $data) {
    $total_nilai_siswa += $data[1];
}

$rata_rata_nilai = $total_nilai_siswa / count($data_siswa);


echo "Nilai rata-rata: $rata_rata_nilai <br>";
echo "Daftar siswa yang nilai ujian matematika lebih dari rata-rata: ";
echo "<ol>";
foreach ($data_siswa as $data) {
    if ($data[1] > $rata_rata_nilai) {
        echo "<li>$data[0] - $data[1]</li>";
    }
}
echo "</col>";