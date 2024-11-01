<?php

require_once __DIR__ . "/Manusia.php";
require_once __DIR__ . "/Mahasiswa.php";

$man = new Manusia("Bejo",23,"New York City");
$mhs1 = new Mahasiswa("Alexander",25,"Kolkata", "129812981");

$man->printBiodata();
$mhs1->printBiodata();

$man->tambahEnergi();
$mhs1->tambahEnergi();

$mhs1->tambahNilai(87);
$mhs1->tambahNilai(65, 70);
