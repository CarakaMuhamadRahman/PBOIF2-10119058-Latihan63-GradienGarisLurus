/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan63.gradiengarislurus;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menghitung gradien.
 */
public class PBOIF210119058Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat koordinat = new Koordinat(2,10,5,7);
        System.out.println("Garis yang melalui titik "
                + "("+koordinat.getX1()+","+koordinat.getY1()+") dan "
                        + "("+koordinat.getX2()+","+koordinat.getY2()+")");
        System.out.println("memiliki gradien sebesar "+koordinat.hitungGradien());
        Koordinat koordinat2 = new Koordinat(5,1,3,12);
        System.out.println("Garis yang memiliki titik "
                + "("+koordinat2.getX1()+","+koordinat2.getY1()+") dan "
                         +"("+koordinat2.getX2()+","+koordinat2.getY2()+")");
        System.out.println("memiliki gradien sebesar " + koordinat2.hitungGradien());
    }
    
}
