/*  Nama File   : Garis.java 
 *  Deskripsi   : berisi atribut dan methid untuk class garis
 *  Pembuat     : Laurensius Brian Prayoga
 *  Tanggal     : 25 Februari 2026
*/
 
public class Garis {
    /*Atribut*/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /*Method*/
    // Konstruktor
    //Konstruktor untuk membuat garis tanpa parameter
    public Garis(){
        this.titikAwal = new Titik(0,0);
        this.titikAkhir = new Titik(1,1);
        counterGaris++;
    }
    
    //konstruktor untuk membuat dengan (parameter) nilai koordinat tertentu
    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }


    // Getter
    //Mengembalikan nilai Titik Awal
    public Titik getTitikAwal(){
        return titikAwal;
    }
    
    //Mengembalikan nilai Titik Akhir
    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    //mengembalikan nilai counterGaris
    public static int getCounterGaris(){
        return counterGaris;
    }
    

    // Setter
    //mengeset titik awal garis dengan nilai baru titik awal
    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    //mengeset titik akhir garis dengan nilai baru titik akhir
    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }


    // Method-Method Lainnya
    //mengembalikan nilai panjang garis
    public double getPanjang(){
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    //menfembalikan gradien garis
    public double getGradien(){
        if(titikAwal.getAbsis() == titikAkhir.getAbsis()){
            return Double.NaN;
        }

        double x = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double y = titikAkhir.getOrdinat() - titikAkhir.getOrdinat();
        
        return y/x;
    }

    //mengembalikan titik tengah
    public Titik getTitikTengah(){
        double xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) /2;
        double yTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(xTengah, yTengah);
    }

    //mengecek kesejajaran 2 garis
    public boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    //mengecek ketegak lurusan 2 garis
    public void printGaris(){
        System.out.println("Titik Awal : ");
        titikAwal.printTitik();
        System.out.println("Titik Akhir : ");
        titikAkhir.printTitik();
    }

    //menampilkan persamaan garis y = mx + c
    public String getPersamaan(){
        double x = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());

        if(x==0){ //jika garis vertikal
            return "x= " + titikAwal.getAbsis();
        }
        
        if(c>=0){
            return "y = " + m + "x + " + c;
        }
        else{
            return "y = " + m + "x - " + Math.abs(c);
        }
    }
}