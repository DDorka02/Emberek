package modell;

import java.util.ArrayList;

public class Ember {
	/* Jellemzők = adattagok */
    private String nev;
    private int szulEv;
    private ArrayList<String> nyelvek;

	/* Kstr */
    public Ember(String nev, int szulEv) {
        this(nev, szulEv, "magyar");
}

    public Ember(String nev, int szulEv, String anyanyelv) {
        this(nev, szulEv, new ArrayList<>());
        this.nyelvek.add(anyanyelv);
    }
    
    public Ember(String nev, int szulEv, ArrayList<String> nyelvek) {
        this.nev = nev;
        this.szulEv = szulEv;
        this.nyelvek = nyelvek;
    }

    public String getNev() {
        return nev;
    }

    public int getSzulEv() {
        return szulEv;
    }
    
    public int getKor() {
        return 2024 - szulEv;
    }

    public String[] getNyelvek() {
        String[] ny = new String[nyelvek.size()];
        return nyelvek.toArray(ny);
    }
    
    public void ujNyelv(String nyelv){
        this.nyelvek.add(nyelv);
    }
    
    public void ujNyelv(ArrayList<String> nyelvek){
        for (String nyelv : nyelvek) {
            ujNyelv(nyelv);        
        }
    }

    public String bemutatkozas() {
        String s = nev + " vagyok, anyanyelvem: " + nyelvek.get(0);
        int kor = 2024-this.getSzulEv();
        String beszelt = "\nSajnos más nyelvet nem beszélek";
        if(nyelvek.size() > 1){
            beszelt = "\nBeszélt nyelvek:";
            for (String nyelv : nyelvek) {
                beszelt += "\n" + nyelv;
            }
        }
        s += "\nkorom " + kor;
        s += beszelt;
        return s;
    }
}
