//lemari pakaian & lemari buku
class LemariPakaian{
	String jenisBaju;
	String jenisCelana;
	
	void tampilBaju(){
		System.out.println("Baju yang ada di lemari saat ini " + jenisBaju);
	}
		
	void tampilCelana(){
		System.out.println("Celana yang ada di lemari saat ini " + jenisCelana);
	}
}

class LemariBuku{
	String judulBuku;
	String jenisBuku;
	
	void tampilJudulBuku(){
		System.out.println("Judul buku yang ada di lemari adalah " + judulBuku);
	}
	void tampilJenisBuku(){
		System.out.println("Jenis bukunya adalah " + jenisBuku);
	}
}

class Lemari{
	public static void main(String args[]){
		LemariPakaian Baju;
		LemariPakaian Celana;
		LemariBuku jdlBuku;
		LemariBuku jnsBuku;
		Baju = new LemariPakaian();
		Celana = new LemariPakaian();
		jdlBuku = new LemariBuku();
		jnsBuku = new LemariBuku();
		
		Baju.jenisBaju = "Kaos Lengan Panjang";
		Celana.jenisCelana = "Celana Jeans";
		jdlBuku.judulBuku = "PEMOGRAMAN LANJUTAN 12";
		jnsBuku.jenisBuku = "Buku Paket";
		
		Baju.tampilBaju();
		Celana.tampilCelana();
		jdlBuku.tampilJudulBuku();
		jnsBuku.tampilJenisBuku();
	}
}