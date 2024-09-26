<?php

function perkenalan($nama, $salam="Assalamualaikum") {
    echo "
        $salam, <br>
        Perkenalkan, nama saya $nama <br>
        Senang berkenalan dengan anda <br><br>
    ";
}

perkenalan("Budi");
perkenalan("Fergusson");

$saya = "Farrel";
$ucapanSalam = "Selamat sore!";

perkenalan($saya, $ucapanSalam);