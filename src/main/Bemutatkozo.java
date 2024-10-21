package main;

import modell.EmberekBemutatkoznak;
import nezet.KozolNezet;
import vezerlo.KozolVezerlo;

public class Bemutatkozo {

    public static void main(String[] args) {
        EmberekBemutatkoznak modell = new EmberekBemutatkoznak();
        KozolNezet nezet = new KozolNezet();
        KozolVezerlo vezerlo = new KozolVezerlo(modell, nezet);
        vezerlo.kezdes();
    }
    
}
