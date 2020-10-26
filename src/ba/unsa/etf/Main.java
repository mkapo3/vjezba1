package ba.unsa.etf;
import java.util.Scanner;

    public class Main {
        public static void main(String [] args){
        Datum d=new Datum (1,2,2000);
        d.ispisiDatum();
        int a=d.getGodina(),b=d.getDan(),c=d.getMjesec();
        System.out.println(a + " " + b + " " +c);
        }
    }
