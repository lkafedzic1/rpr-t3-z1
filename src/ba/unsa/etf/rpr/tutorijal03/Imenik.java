package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Map;

public class Imenik {
    private HashMap<String, TelefonskiBroj>  mapaKorisnika = new HashMap<>();

    void dodaj(String ime, TelefonskiBroj broj) {
        mapaKorisnika.put(ime,broj);
    }
    String dajBroj(String ime) {
     return mapaKorisnika.get(ime).ispisi();
    }
    String dajIme(TelefonskiBroj broj) {
    return mapaKorisnika.get(broj).ispisi();

    }
  /*  String naSlovo(char s) {
        for(Map.Entry<String,TelefonskiBroj> par: mapaKorisnika.entrySet()) {
            if(par.getKey().startsWith(s)) {
                int redni_broj=0;
                System.out.println(redni_broj + ". ");
                dajIme(par.getValue());
                System.out.println(" - ");
                dajBroj(par.getKey());
            }
        }
    }*/
    //Set<String> izGrada(Grad g);
    //Set<TelefonskiBroj> izGradaBrojevi(Grad g);



}
