/*  Nama File   : Titik.java 
 *  Deskripsi   : berisi atribut dan methid untuk class titik
 *  Pembuat     : Laurensius Brian Prayoga
 *  Tanggal     : 19 Februari 2026
*/
 
public class Titik {
    /*Atribut*/
    double absis;
    double ordinat;

    /*Method*/
    //Konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    //Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }
    
    //Mengembalikan nilai absis
    double getOrdinat(){
        return ordinat;
    }
    
    //mengeset absos titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset absos titik dengan nilai baru x
    void setordinat(double y){
        ordinat = y;
    }

    //Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //Mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}