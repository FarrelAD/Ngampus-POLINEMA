<?php

$nilai_siswa = [85, 92, 78, 64, 90, 75, 88, 79, 70, 96];

$nilai_tertinggi = [];
$nilai_terendah = [];

for ($i=0; $i < count($nilai_siswa); $i++) { 
    if ($i == 0) {
        $nilai_tertinggi[] = $nilai_siswa[$i];
        $nilai_terendah[] = $nilai_siswa[$i];
    } else {
        for ($j=0; $j < count($nilai_tertinggi); $j++) { 
            if ($nilai_siswa[$i] > $nilai_tertinggi[$j]) {
                if (count($nilai_tertinggi) == 1) {
                    $nilai_tertinggi[1] = $nilai_siswa[$i];
                } else {
                    if ($j == 0) {
                        if ($nilai_tertinggi[1] != $nilai_siswa[$i]) {
                            $nilai_tertinggi[$j] = $nilai_siswa[$i];
                        }
                    } elseif ($j == 1) {
                        if ($nilai_tertinggi[0] != $nilai_siswa[$i]) {
                            $nilai_tertinggi[$j] = $nilai_siswa[$i];
                        }
                    }
                }
            }
        }

        for ($j=0; $j < count($nilai_terendah); $j++) { 
            if ($nilai_siswa[$i] < $nilai_terendah[$j]) {
                if (count($nilai_terendah) == 1) {
                    $nilai_terendah[1] = $nilai_siswa[$i];
                } else {
                    if ($j == 0) {
                        if ($nilai_terendah[1] != $nilai_siswa[$i]) {
                            $nilai_terendah[$j] = $nilai_siswa[$i];
                        }
                    } elseif ($j == 1) {
                        if ($nilai_terendah[0] != $nilai_siswa[$i]) {
                            $nilai_terendah[$j] = $nilai_siswa[$i];
                        }
                    }
                }
            }
        }
    }
}

$total_nilai_normal = 0;

foreach ($nilai_siswa as $nilai) {
    if ($nilai != $nilai_tertinggi[0] && 
        $nilai != $nilai_tertinggi[1] && 
        $nilai != $nilai_terendah[0] && 
        $nilai != $nilai_terendah[1]) {
        $total_nilai_normal += $nilai;
    }
}

$rata_rata = $total_nilai_normal / (count($nilai_siswa) - 4);

echo "
    <table border=\"1\">
        <tr>
            <td>Nilai keseluruhan</td>";
            foreach($nilai_siswa as $nilai) {
                echo "<td>$nilai</td>";
            }
        echo "</tr>
        <tr>
            <td>Nilai tertinggi</td>";
            foreach ($nilai_tertinggi as $nilai) {
                echo "<td>$nilai</td>";
            }
        echo "</tr>
        <tr>
            <td>Nilai terendah</td>";
            foreach ($nilai_terendah as $nilai) {
                echo "<td>$nilai</td>";
            }
        echo "</tr>
        <tr>
            <td>Total nilai normal</td>
            <td>$total_nilai_normal</td>
        </tr>
        <tr>
            <td>Nilai rata-rata normal</td>
            <td>$rata_rata</td>
        </tr>
    </table>";