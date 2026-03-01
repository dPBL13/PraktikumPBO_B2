/*  Nama File   : Titik.java 
 *  Deskripsi   : berisi atribut dan methid untuk class titik
 *  Pembuat     : Laurensius Brian Prayoga
 *  Tanggal     : 25 Februari 2026
*/
 
public class Titik {
    /*Atribut*/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /*Method*/
    //konstruktor untuk membuat dengan nilai absis dengan ordinat tertentu
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //Konstruktor untuk membuat titik (0,0)
    public Titik(){
        this(0,0);
    }

    //mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    //Mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }
    
    //Mengembalikan nilai absis
    public double getOrdinat(){
        return ordinat;
    }
    
    //mengeset absos titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    //mengeset absos titik dengan nilai baru x
    public void setordinat(double y){
        ordinat = y;
    }

    //Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //Mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //Mencetak counter titik
    public void printCounterTitik(){
        System.out.println(this.counterTitik);
    }

    //Mengembalikan nilai kuadran
    public int getKuadran(){
        if(absis>0 && ordinat>0){
            return 1;
        }
        else if(absis<0 && ordinat>0){
            return 2;
        }
        else if(absis<0 && ordinat<0){
            return 3;
        }
        else if(absis>0 && ordinat<0){
            return 4;
        }
        else{
            return 0;
        }
    }
    
    //Mengembalikan jarak ke pusat
    public double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    //Mengembalikan jarak 2 titik
    public double getJarak(Titik T){
        return Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
    }

    //Refleksi terhadap sumbu x
    public void refleksiX(){
        this.ordinat = -this.ordinat;
    }

    //Refleksi terhadap sumbu y
    public void refleksiY(){
        this.absis = -this.absis;
    }

    //Mengembalikan koordinat hasil refleksi terhadap sumbu X
    public Titik getRefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    //Mengembalikan koordinat hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY(){
        return new Titik(-this.absis, this.ordinat);
    }
}