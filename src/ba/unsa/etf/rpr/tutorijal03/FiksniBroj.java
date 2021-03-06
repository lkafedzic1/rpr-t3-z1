package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    @Override
    public final int compareTo(TelefonskiBroj obj) {return 0;}
    public enum Grad {
        TRAVNIK, ORASJE, ZENICA, SARAJEVO, LIVNO,
        TUZLA, MOSTAR, BIHAC, GORAZDE, SIROKI_BRIJEG,
        BRCKO,
        MRKONJIC_GRAD, BANJA_LUKA, PRIJEDOR, DOBOJ, SAMAC,
        BIJELJINA, ZVORNIK, PALE, FOCA, TREBINJE
    }
    private String broj;
    private Grad grad;
    public final String getBroj() {return broj;}
    public final Grad getGrad() {return grad;}
    public FiksniBroj(Grad g, String br) {
        this.grad = g;
        this. broj = br;
    }
    @Override
    public final String ispisi() {
        return  "0"+this.grad.hashCode()+"/"+this.broj;
    }
    @Override
    public final int hashCode() {
        int pozivni_broj = 0;
        switch (grad){
            case TRAVNIK:
                pozivni_broj = 30; break;
            case ORASJE:
                pozivni_broj = 31; break;
            case ZENICA:
                pozivni_broj = 32; break;
            case SARAJEVO:
                pozivni_broj = 33; break;
            case LIVNO:
                pozivni_broj = 34; break;
            case TUZLA:
                pozivni_broj = 35; break;/*
            case MOSTAR:
                pozivni_broj = 36; break;
            case BIHAC:
                pozivni_broj = 37; break;
            case GORAZDE:
                pozivni_broj = 38; break;
            case SIROKI_BRIJEG:
                pozivni_broj = 39; break;
            case BRCKO:
                pozivni_broj = 49; break;
            case MRKONJIC_GRAD:
                pozivni_broj = 50; break;
            case BANJA_LUKA:
                pozivni_broj = 51; break;
            case PRIJEDOR:
                pozivni_broj = 52; break;
            case DOBOJ:
                pozivni_broj = 53; break;
            case SAMAC:
                pozivni_broj = 54; break;
            case BIJELJINA:
                pozivni_broj = 55; break;
            case ZVORNIK:
                pozivni_broj = 56; break;
            case PALE:
                pozivni_broj = 57; break;
            case FOCA:
                pozivni_broj = 58; break;
            case TREBINJE:
                pozivni_broj = 59; break;*/

        }
        return pozivni_broj;
    }

}
