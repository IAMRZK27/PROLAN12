/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectlemari;

class Lemari{
        
	public static void main(String[] args){
		LemariPakaianBaju Baju = new LemariPakaianBaju("Kaos Lengan Panjang","Biru",50000);
		LemariPakaianCelana Celana = new LemariPakaianCelana("Celana Jeans","Hitam",30000);
		
		Baju.tampilJenisBaju();
		Baju.tampilWarnaBaju();
		Baju.tampilHargaBaju();
                Baju.pintuLemari();
                Baju.warnaLemari();
                Baju.jenisKayuLemari();
                System.out.println("Baju telah ditambahkan. Jumlah baju anda = " + Baju.tambahBaju(1, 1));
                System.out.println();
		Celana.tampilJenisCelana();
		Celana.tampilWarnaCelana();
		Celana.tampilHargaCelana();
                Celana.pintuLemari();
                Celana.warnaLemari();
                Celana.jenisKayuLemari();
                System.out.println("Celana telah ditambahkan. Jumlah celana anda = " + Celana.tambahCelana(1, 3));
		System.out.println();
	}
}
