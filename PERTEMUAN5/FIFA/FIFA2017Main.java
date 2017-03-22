public class FIFA2017Main extends FIFA2016 {
	String rilis = "18 Desember 2016";

	FIFA2017Main(String pengembang) {
		super(pengembang);
	}
	
    public void visual() {
		System.out.println("Fitur Realistic Visual 		: FIFA 2016 menggunakan Cry Engine untuk membuat game FIFA");
	}

    public void Super() {
        visual();
        super.visual();
		System.out.println("Tanggal Rilis FIFA 2017  : "+rilis);
        System.out.println("Tanggal Rilis FIFA 2016  : "+super.rilis);
    }

    public static void main(String[] args) {
        FIFA2017Main bola = new FIFA2017Main("EA Sports");
		System.out.println("FIFA2016 dan FIFA2017\n");
		bola.platform();
		bola.visual();
        bola.Super();
		bola.developer();
    }
}