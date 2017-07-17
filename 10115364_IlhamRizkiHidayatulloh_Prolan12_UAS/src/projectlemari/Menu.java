package projectlemari;

import java.util.Scanner;

/**
 *
 * @author Ilham Rizki H
 */
public class Menu {
    public static void main (String[] args){
        Lemari lemari = new Lemari();
        jenisLemari jenislemari = new jenisLemari();
        
        int menu = 0;
        int pilih;
        
        Scanner input = new Scanner(System.in);
        
        while(menu == 0){
            System.out.println("===========================\n"
                    + "MENU LEMARI\n"
                    + "1. Lihat Isi Lemari Baju dan Celana\n"
                    + "2. Lihat Jenis Lemari\n"
                    + "3. Keluar Program\n"
                    + "===========================\n");
            System.out.println("Masukkan pilihan kamu : ");
            pilih = input.nextInt();
            if(pilih < 1 || pilih > 3){
                System.out.println("Input Salah!!!");
            }
            
            switch(pilih){
                case 1 :
                    System.out.println("ISI LEMARI ANDA");
                    System.out.println("========================");
                    lemari.tampil();
                    break;
                case 2 :
                    System.out.println("LEMARI ANDA");
                    System.out.println("========================");
                    jenislemari.pintuLemari();
                    jenislemari.warnaLemari();
                    jenislemari.jenisKayuLemari();
                    break;
                case 3 :
                    System.exit(0);
                    break;
            }
        }
    }
}
