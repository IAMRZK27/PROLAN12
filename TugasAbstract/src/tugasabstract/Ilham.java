/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugasabstract;

/**
 *
 * @author Ilham Rizki H
 */
public class Ilham extends Mahasiswa {

    @Override
    protected void kuliah() {
        System.out.println("Masuk kuliah terus, tugas dikerjakan, dan datang tidak telat");
    }

    @Override
    protected void lulus() {
        System.out.println("Tugas, UTS, dan UAS nilainya diatas rata-rata");
    }

    @Override
    protected void tidakLulus() {
        System.out.println("Gak mau");
    }
    
}
