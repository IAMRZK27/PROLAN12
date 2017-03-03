/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inputoutput4;
import java.util.Scanner;

public class InputOutput4 {
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
