/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectlemari;

class LemariPakaianCelana extends jenisLemari{
	String jenisCelana;
	String warnaCelana;
	int hargaCelana;

    public LemariPakaianCelana(String jenisCelana, String warnaCelana, int hargaCelana) {
        this.jenisCelana = jenisCelana;
        this.warnaCelana = warnaCelana;
        this.hargaCelana = hargaCelana;
    }
                @Override
                public void pintuLemari(){
                        System.out.println("Jenis Lemari 3 Pintu");
                        super.pintuLemari();
                }
                @Override
                public void warnaLemari(){
                        System.out.println("Warna Lemarinya adalah Hitam");
                        super.warnaLemari();
                }
                @Override
                public void jenisKayuLemari(){
                        System.out.println("Jenis Kayu Pinus");
                        super.jenisKayuLemari();
                }
    
                int tambahCelana(int b1, int b2){
			return b1 + b2;
		}
		void tampilJenisCelana(){
			System.out.println("Celana yang ada di lemari adalah " + jenisCelana);
		}
		void tampilWarnaCelana(){
			System.out.println("Warna celananya adalah " + warnaCelana);
		}
		void tampilHargaCelana(){
			System.out.println("Harga celananya adalah Rp." + hargaCelana);
		}
	}

	class LemariBuku{
		String judulBuku;
		String pengarangBuku;
		int hargaLKS;
		int kodeBuku;

                public LemariBuku(String judulBuku, String pengarangBuku, int hargaLKS, int kodeBuku) {
                    this.judulBuku = judulBuku;
                    this.pengarangBuku = pengarangBuku;
                    this.hargaLKS = hargaLKS;
                    this.kodeBuku = kodeBuku;
                }
		
		void tampilKodeBuku(){
			System.out.println("Kode Buku = " + kodeBuku);
		}
		void tampilJudulBuku(){
			System.out.println("Judul Buku = " + judulBuku);
		}
		void pengarangBuku(){
			System.out.println("Pengaran Buku = " + pengarangBuku);
		}
		void tampilHargaLKS(){
			System.out.println("Harga LKS = Rp." + hargaLKS);
		}
	}
