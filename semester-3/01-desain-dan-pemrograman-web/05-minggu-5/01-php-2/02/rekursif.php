<?php

function tampilkanHaloDunia(int $jumlah, int $indeks = 1) {
    echo "Hallo dunia! <br>";

    if ($indeks < $jumlah) {
        tampilkanHaloDunia($jumlah, $indeks + 1);
    }
}

tampilkanHaloDunia(20);