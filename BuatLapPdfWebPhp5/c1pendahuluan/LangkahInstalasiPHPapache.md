
1. Download php-5.x.x-Win32.zip
2. Buka file dan ekstrak file ke `c:\php5\`
3. Salin file php.ini-recommended ke folder c:\Windows dengan nama file `php.ini`.
4. Ubah nilai `register_globals` menjadi off.
5.Buat file info.php pada Web Document Root folder.
6.Ketik baris program di bawah ini:
```php
<?php
phoinfo();
?>
```