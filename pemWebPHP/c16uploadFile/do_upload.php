<html>
<head>
 <title></title>
</head>
<body>
 <h1>Simpan File yanh diupload!</h1>
 <?php 
 $namafile = $HTTP_POST_FILES['file1']['name'];
 ?>
 <p>Nama File: <?php echo $file1; ?></p>
 <br>
 <?php
   if ($file1!="none") {
     copy("$file1","hasilupload.txr") or die ("No files!");
   }
   else {
    die("Tidak ada file yang diupload!");
   }
 ?>
</body>
</html>