package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

public class Imenik {
    private HashMap<String, TelefonskiBroj> mapaKorisnika = new HashMap<>();

    public final void dodaj(String ime, TelefonskiBroj broj) {
        mapaKorisnika.put(ime, broj);
    }

    public final String dajBroj(String ime) {
        return mapaKorisnika.get(ime).ispisi();
    }

    public final String dajIme(TelefonskiBroj broj) {
        for(Map.Entry<String,TelefonskiBroj> par: mapaKorisnika.entrySet()) {
            if (par.getValue().equals(broj)) return par.getKey();
        }
        return "";
    }
    public final String naSlovo(char s) {
        int br=0;
        String s1="";
        for(Map.Entry<String,TelefonskiBroj> par: mapaKorisnika.entrySet()) {
            if(par.getKey().charAt(0)==s) {
                br++;
                s1+=br+". "+par.getKey()+" - "+par.getValue().ispisi();
            }
        }
        return s1;
    }
    public final Set<String> izGrada(FiksniBroj.Grad g) {
        TreeSet<String> rez=new TreeSet<>();
        for(Map.Entry<String,TelefonskiBroj> par: mapaKorisnika.entrySet()) {
            if(par.getValue() instanceof FiksniBroj && ((FiksniBroj) par.getValue()).getGrad().equals(g))
                rez.add(par.getKey());
        }
        return rez;
    }
    public final Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        Set<TelefonskiBroj> rez= new TreeSet<>();
        for(Map.Entry<String,TelefonskiBroj> par: mapaKorisnika.entrySet()) {
            if(par.getValue() instanceof FiksniBroj && ((FiksniBroj) par.getValue()).getGrad().equals(g))
                rez.add(par.getValue());
        }
        return rez;
    }
}