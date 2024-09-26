<?php

$lorem_ipsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi vel scelerisque turpis. Donec malesuada mi eu elit ultricies, ut tempor mi sagittis. Integer pellentesque dolor at porta gravida. Morbi venenatis lorem eget eros vestibulum, id suscipit mi pharetra. Nam dignissim nulla non velit suscipit, in mattis ligula consectetur. Vivamus in leo iaculis, suscipit ex a, gravida ipsum. Mauris gravida vel ex et eleifend. Duis dapibus condimentum ultricies. ";

echo "
    <p>$lorem_ipsum</p>
    Panjang karakter: " . strlen($lorem_ipsum) . "<br>
    Panjang kata : " . str_word_count($lorem_ipsum) . "<br>
    <p>" . strtoupper($lorem_ipsum) . "</p>
    <p>" . strtolower($lorem_ipsum) . "</p>
";