<?php
  echo date("F j, Y");

  $randomstring = substr(md5(microtime()), 0, 5);
  echo $randomstring;

?>
