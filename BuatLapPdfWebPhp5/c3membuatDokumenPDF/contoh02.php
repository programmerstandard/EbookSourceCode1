<?php
define("FPDF_FONTPATH','fpdf/font/');
require('fpdf/fpdf.php');
$pdf=new FPDF();
$pdf->Open();
$pdf->AddPage();
$pdf->SetFont('Arial','B',22);
$pdf->Cell(0,2,'Percobaan PDF yang pertama!');
$pdf->Output()?>