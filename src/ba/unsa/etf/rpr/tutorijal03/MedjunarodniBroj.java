package ba.unsa.etf.rpr.tutorijal03;

public class MedjunarodniBroj extends TelefonskiBroj {
    String drzava;
    String broj;

    //konstruktor: string drzava sadrži kompletan pozivni broj za državu npr. "+387".
    public MedjunarodniBroj (String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }
    @Override
    public String ispisi(){
        return drzava+broj;
    }
    @Override
    public int hashCode() {
        return Integer.parseInt(drzava);
    }
}
