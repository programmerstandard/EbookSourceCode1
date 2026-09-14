<?php
define("FPDF_FONTPATH','fpdf/font/');
require('fpdf/fpdf.php');
$pdf=new FPDF();
$pdf->Open();
$pdf->AddPage();
$pdf->Cell(0,2,'Percobaan PDF yang pertama');
$pdf->Output();
?>