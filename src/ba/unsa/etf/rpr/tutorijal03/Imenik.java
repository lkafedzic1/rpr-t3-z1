package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

public class Imenik {
    private HashMap<String, TelefonskiBroj> mapaKorisnika = new HashMap<>();

    void dodaj(String ime, TelefonskiBroj broj) {
        mapaKorisnika.put(ime, broj);
    }

    public String dajBroj(String ime) {
        return mapaKorisnika.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj) {
        for(Map.Entry<String,TelefonskiBroj> par: mapaKorisnika.entrySet()) {
            if (par.getValue().equals(broj)) return par.getKey();
        }
        return "";
    }
    public String naSlovo(char s) {
        int br=0;
        String s1=new String();
        for(Map.Entry<String,TelefonskiBroj> par: mapaKorisnika.entrySet()) {
            if(par.getKey().charAt(0)==s) {
                br++;
                s1+=br+". "+par.getKey()+" - "+par.getValue().ispisi();
            }
        }
        return s1;
    }
    public Set<String> izGrada(FiksniBroj.Grad g) {
        TreeSet<String> rez=new TreeSet<>();
        for(Map.Entry<String,TelefonskiBroj> par: mapaKorisnika.entrySet()) {
            if(par.getValue() instanceof FiksniBroj && ((FiksniBroj) par.getValue()).getGrad().equals(g));
        }
        return rez;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        Set<TelefonskiBroj> rez= new TreeSet<>();
        for(Map.Entry<String,TelefonskiBroj> par: mapaKorisnika.entrySet()) {
            if(par.getValue() instanceof FiksniBroj && ((FiksniBroj) par.getValue()).getGrad().equals(g))
                rez.add(par.getValue());
        }
        return rez;
    }
}