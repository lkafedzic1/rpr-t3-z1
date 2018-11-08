package ba.unsa.etf.rpr.tutorijal03;

public class MedjunarodniBroj extends TelefonskiBroj {
    private String drzava;
    private String broj;
    //konstruktor: string drzava sadrži kompletan pozivni broj za državu npr. "+387".
    public MedjunarodniBroj (String d, String br) {
        this.drzava = d;
        this.broj = br;
    }
    @Override
    public final int compareTo(TelefonskiBroj obj) {return 0;}
    @Override
    public final String ispisi(){
        return drzava+broj;
    }
    @Override
    public final int hashCode() {
        return Integer.parseInt(drzava);
    }
}
