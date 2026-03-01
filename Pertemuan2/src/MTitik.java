/*  Nama File   : Titik.java 
 *  Deskripsi   : driver untuk class titik
 *  Pembuat     : Laurensius Brian Prayoga
 *  Tanggal     : 25 Februari 2026
*/

public class MTitik{
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        T1.setAbsis(3); //Mengubah absis T1 dengan nilai 3
        T1.setordinat(4); //Mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //Mencetak koordinat T1 ke layar
        T1.geser(3, 4); //Menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setordinat(10);
        T2.printTitik();

        Titik T3 = new Titik(3,5);
        System.out.println("Jumlah Objek Titik = " + T3.getCounterTitik());
        T3.printTitik();
        T3.setAbsis(10);
        T3.setordinat(10);
        T3.printTitik();

        Titik T4 = new Titik(3, 4);
        Titik T5 = new Titik(-2, 5);

        System.out.println("Titik T4:");
        T4.printTitik();
        System.out.println("Kuadran: " + T4.getKuadran());
        System.out.println("Jarak ke pusat: " + T4.getJarakPusat());

        System.out.println("\nJarak T4 ke T5: " + T4.getJarak(T5));

        System.out.println("\nRefleksi X T4 : ");
        Titik rx = T4.getRefleksiX();
        rx.printTitik();

        System.out.println("\nRefleksi Y T4 : ");
        T4.refleksiY();
        T4.printTitik();
    }    
}