package ba.unsa.etf;

public class Datum {
    private int dan,mjesec,godina;

    public Datum(int d, int m, int g) {
        this.dan=d; this.mjesec=m; this.godina=g;
    }
    public void ispisiDatum(){
        System.out.println(dan + "." + mjesec+ "." + godina + ".");
    }

    public int getDan() {
        return dan;
    }

    public int getMjesec() {
        return mjesec;
    }

    public int getGodina() {
        return godina;
    }
}
