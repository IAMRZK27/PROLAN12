class LemariPakaian{
	String jenisBaju;
	String warnaBaju;
	int hargaBaju;
	String jenisCelana;
	String warnaCelana;
	int hargaCelana;
	
	void tampilJenisBaju(){
		System.out.println("Baju yang ada di lemari adalah " + jenisBaju);
	}
	void tampilWarnaBaju(){
		System.out.println("Warna bajunya adalah " + warnaBaju);
	}
	void tampilHargaBaju(){
		System.out.println("Harga bajunya adalah Rp." + hargaBaju);
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
	short hargaLKS;
	byte kodeBuku;
	
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

class Lemari{
	public static void main(String[] args){
		LemariPakaian Baju = new LemariPakaian();
		LemariPakaian Celana = new LemariPakaian();
		LemariBuku Buku = new LemariBuku();
		
		Baju.jenisBaju = "Kaos Lengan Panjang";
		Baju.warnaBaju = "Biru";
		Baju.hargaBaju = 50000;
		Celana.jenisCelana = "Celana Jeans";
		Celana.warnaCelana = "Hitam";
		Celana.hargaCelana = 30000;
		
		Buku.kodeBuku = 101;
		Buku.judulBuku = "PROLAN";
		Buku.pengarangBuku = "Ilham R. H.";
		Buku.hargaLKS = 15000;
		
		Baju.tampilJenisBaju();
		Baju.tampilWarnaBaju();
		Baju.tampilHargaBaju();
		Celana.tampilJenisCelana();
		Celana.tampilWarnaCelana();
		Celana.tampilHargaCelana();
		System.out.println();
		Buku.tampilKodeBuku();
		Buku.tampilJudulBuku();
		Buku.pengarangBuku();
		Buku.tampilHargaLKS();
	}
}