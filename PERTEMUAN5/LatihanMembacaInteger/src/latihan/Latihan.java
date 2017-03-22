package latihan;

import java.util.Scanner;

public class Latihan {
	
	public static void main (String[] args){
            int N, x = 0;
            char pilih;
                
            int input_bil, max = 0, min = 0, jml = 0;
                
            Scanner input = new Scanner(System.in);
	
            System.out.print("N = ");
            N = input.nextInt();
            System.out.println();
            System.out.println("A. Nilai Minimum");
            System.out.println("B. Nilai Maksimum");
            System.out.print("Pilihan = ");
            pilih = input.next().charAt(0);
            if (pilih == 'A'){
                pilihanA(N);
            } else if(pilih == 'B'){
                pilihanB(N);
            }
	}	
	
	public static void pilihanA(int N){
            int input_bil, x = 0, jml = 0, min = 0;
            
            Scanner input = new Scanner(System.in);
            
            do {
                System.out.print("Input nilai : ");
                input_bil = input.nextInt();
                if (x == 0){
                    min = input_bil;
                }else {
                if (input_bil < min) {
                    min = input_bil;
                    if (input_bil == x){
                        jml++;
                    }
                }
                }
             x++;
             }while (x < N);
             System.out.println("Nilai minimum = " + min);
             System.out.println("Banyaknya kemunculan nilai minimum = " + jml);
	}
	
	public static void pilihanB(int N){
            int input_bil, max = 0, x = 0, jml = 0;
            
            Scanner input = new Scanner(System.in);
            
            do {
                System.out.print("Input nilai : ");
                input_bil = input.nextInt();
                if (x == 0){
                    max = input_bil;
                }else {
                if (input_bil < max) {
                    max = input_bil;
                    if (input_bil == x){
                        jml++;
                    }
                }
                }
            x++;
            }while (x < N);
            System.out.println("Nilai maksimum = " + max);
            System.out.println("Banyaknya kemunculan nilai maksimum = " + jml);	
	}
}