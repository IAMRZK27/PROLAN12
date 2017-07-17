/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectlemari;

class LemariPakaianBaju extends jenisLemari{
	String jenisBaju;
	String warnaBaju;
	int hargaBaju;

    public LemariPakaianBaju(String jenisBaju, String warnaBaju, int hargaBaju) {
        this.jenisBaju = jenisBaju;
        this.warnaBaju = warnaBaju;
        this.hargaBaju = hargaBaju;
    }
                @Override
                public void pintuLemari(){
                        System.out.println("Jenis Lemari 4 Pintu");
                        super.pintuLemari(); //pintuLemari di parent di panggil
                }
                @Override
                public void warnaLemari(){
                        System.out.println("Warna Lemarinya adalah Abu-abu");
                        super.warnaLemari(); //warnaLemari di parent di panggil
                }
                @Override
                public void jenisKayuLemari(){
                        System.out.println("Jenis Kayu Jati");
                        super.jenisKayuLemari(); //jenisKayuLemari di parent di panggil
                }
                
		int tambahBaju(int b1, int b2){
			return b1 + b2;
		}
		void tampilJenisBaju(){
			System.out.println("Baju yang ada di lemari adalah " + jenisBaju);
		}
		void tampilWarnaBaju(){
			System.out.println("Warna bajunya adalah " + warnaBaju);
		}
		void tampilHargaBaju(){
			System.out.println("Harga bajunya adalah Rp." + hargaBaju);
		}
	}