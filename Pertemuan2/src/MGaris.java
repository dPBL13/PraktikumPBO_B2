/*  Nama File   : MGaris.java 
 *  Deskripsi   : driver untuk class Garis
 *  Pembuat     : Laurensius Brian Prayoga
 *  Tanggal     : 25 Februari 2026
*/

public class MGaris{
    public static void main(String[] args) {
    // Membuat titik
    Titik T1 = new Titik(-2,0);
    Titik T2 = new Titik(0,4);

    // Membuat garis
    Garis G1 = new Garis(T1, T2);
    
    // Menampilkan informasi
    G1.printGaris();
    
    System.out.println("Panjang Garis : " + G1.getPanjang());
    System.out.println("Gradien       : " + G1.getGradien());
    
    Titik tengah = G1.getTitikTengah();
    System.out.print("Titik Tengah  : ");
    
    tengah.printTitik();
    
    System.out.println("Persamaan     : " + G1.getPersamaan());
    System.out.println("Jumlah Garis  : " + Garis.getCounterGaris());
    }    
}