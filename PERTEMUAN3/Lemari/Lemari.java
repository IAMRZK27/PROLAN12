class LemariPakaianBaju{
		String jenisBaju;
		String warnaBaju;
		int hargaBaju;

    public LemariPakaianBaju(String jenisBaju, String warnaBaju, int hargaBaju) {
        this.jenisBaju = jenisBaju;
        this.warnaBaju = warnaBaju;
        this.hargaBaju = hargaBaju;
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

class LemariPakaianCelana{
	String jenisCelana;
	String warnaCelana;
	int hargaCelana;

	public LemariPakaianCelana(String jenisCelana, String warnaCelana, int hargaCelana) {
		this.jenisCelana = jenisCelana;
		this.warnaCelana = warnaCelana;
		this.hargaCelana = hargaCelana;
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

class Lemari{
	public static void main(String[] args){
		LemariPakaianBaju Baju = new LemariPakaianBaju("Kaos Lengan Panjang","Biru",50000);
		LemariPakaianCelana Celana = new LemariPakaianCelana("Celana Jeans","Hitam",30000);
		LemariBuku Buku = new LemariBuku("PROLAN","Ilham Rizki",15000,101);
		
		Baju.tampilJenisBaju();
		Baju.tampilWarnaBaju();
		Baju.tampilHargaBaju();
        System.out.println("Baju telah ditambahkan. Jumlah baju anda = " + Baju.tambahBaju(1, 1));
		Celana.tampilJenisCelana();
		Celana.tampilWarnaCelana();
		Celana.tampilHargaCelana();
        System.out.println("Celana telah ditambahkan. Jumlah celana anda = " + Celana.tambahCelana(1, 3));
		System.out.println();
		Buku.tampilKodeBuku();
		Buku.tampilJudulBuku();
		Buku.pengarangBuku();
		Buku.tampilHargaLKS();
	}
}
