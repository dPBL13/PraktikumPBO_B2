/*  Nama File   : Titik.java 
 *  Deskripsi   : berisi atribut dan methid untuk class titik
 *  Pembuat     : Laurensius Brian Prayoga
 *  Tanggal     : 19 Februari 2026
*/

public class Mtitik{
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //Mengubah absis T1 dengan nilai 3
        T1.setordinat(4); //Mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //Mencetak koordinat T1 ke layar
        T1.geser(3, 4); //Menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser
    }    
}