import java.util.Scanner;

class InputOutput4{
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String nama;
		char jeniskelamin;
		int tinggibadan;
		boolean menikah;
		
        System.out.print("Masukkan nama = ");
		nama = input.nextLine();
		System.out.print("Masukkan jenis kelamin = ");
		jeniskelamin = input.next().charAt(0);
		System.out.print("Masukkan tinggi badan = ");
		tinggibadan = input.nextInt();
		System.out.print("Masukkan status menikah = ");
		menikah = input.nextBoolean();
    }
}