package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String broj;
    //Konstruktor: oznaka mobilne mreže predstavlja drugu i treću cifru pozivnog broja tj. 60-67.
    public MobilniBroj(int mobMreza, String br) {
        this.mobilnaMreza = mobMreza;
        this.broj = br;
    }
    //Metoda ispisi vraća broj istog oblika "061/987-654"
    @Override
    public final String ispisi(){
        return "0"+mobilnaMreza+"/"+broj;

    }
    @Override
    public final int hashCode() {
        return mobilnaMreza;
    }
    @Override
    public final int compareTo(TelefonskiBroj obj) {
        return 0;
    }

}
