package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    int mobilnaMreza;
    String broj;
    //Konstruktor: oznaka mobilne mreže predstavlja drugu i treću cifru pozivnog broja tj. 60-67.
    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }
    //Metoda ispisi vraća broj istog oblika "061/987-654"
    @Override
    public String ispisi(){
        String ispis = 0+mobilnaMreza+"/"+broj;
        return ispis;
    }
    @Override
    public int hashCode() {
        return mobilnaMreza;
    }

}
