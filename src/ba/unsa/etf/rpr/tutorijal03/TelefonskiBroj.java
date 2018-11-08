package ba.unsa.etf.rpr.tutorijal03;

public abstract class TelefonskiBroj implements Comparable<TelefonskiBroj> {
    String broj;
    public abstract String ispisi();
    public abstract int hashCode();
}
