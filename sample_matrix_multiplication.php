<?php
$n1 = array(
    array(1, 2, 3),
    array(4, 5, 6),
    array(1, 1, 1)
);

$n2 = array(
    array(1, 2, 3),
    array(4, 5, 6),
    array(1, 1, 1)
);

for ($i = 0; $i < count($n1); $i++) {
    for ($j = 0; $j < count($n2[0]); $j++) {
        $res = 0;
        for ($k = 0; $k < count($n1[0]); $k++) {
            $res += $n1[$i][$k] * $n2[$k][$j];
        }
        echo $res . " ";
    }
    echo "\n";
}
?>