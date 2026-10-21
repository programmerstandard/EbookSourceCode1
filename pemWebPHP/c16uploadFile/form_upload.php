<html>
<head>
 <title>Form untuk Input Nama File</title>
</head>
<body>
 <h1>Input Nama File Untuk Upload</h1>
 <br>Klik tombol Browse untuk memilih!
 <form action="do_upload.php" enctype="multipart/form-data" method="post">
   <input type="hidden" name="MAX_FILE_SIZE" value="10000">
   Nama File : <input type="file" name="file1" size="30">
   <br>
   <input type="submit" value="Upload">
 </form>
</body>
</html>