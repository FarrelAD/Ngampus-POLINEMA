<?php

$menu = [
    [ "nama" =>  "Beranda" ],
    [
        "nama" => "Berita",
        "submenu" => [
            [
                "nama" => "Wisata",
                "submenu" => [
                    [ "nama" => "Pantai" ],
                    [ "nama" => "Gunung" ]
                ]
            ],
            [ "nama" => "Kuliner" ],
            [ "nama" => "Hiburan" ]
        ], 
    ],
    [ "nama" => "Tentang" ],
    [ "nama" => "Kontak" ]
];

function tampilkanMenuBertingkat(array $menu) {
    echo "<ul>";
    foreach ($menu as $key => $item) {
        echo "<li>{$item['nama']}</li>";
        if (count($item) > 1) {
            tampilkanMenuBertingkat($item['submenu']);
        }
    }
    echo "</ul>";
}

tampilkanMenuBertingkat($menu);