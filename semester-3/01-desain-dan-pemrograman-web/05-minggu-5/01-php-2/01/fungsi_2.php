<?php

function hitungUmur($thn_lahir, $thn_sekarang) {
    return $thn_sekarang - $thn_lahir;
}

function perkenalan($nama, $salam="Assalamualaikum") {
    echo "
        $salam, <br>
        Perkenalkan, nama saya $nama <br>
        Saya berusia " . hitungUmur(1990, 2024) . "<br>
        Senang berkenalan dengan anda <br><br>
    ";
}

perkenalan("Budi");