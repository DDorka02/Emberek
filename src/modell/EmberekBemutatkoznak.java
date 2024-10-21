package modell;

import java.util.ArrayList;
import java.util.Arrays;

public class EmberekBemutatkoznak {
    private Ember[] emberek;

    public EmberekBemutatkoznak() {
        Ember e1 = new Ember("Pál", 2000);
        Ember e2 = new Ember("John", 2000, "angol");
        
        ArrayList<String>nyelvek = new ArrayList<>();
        nyelvek.add("francia");
        nyelvek.add("német");
        nyelvek.add("olasz");
        Ember e3 = new Ember("Ede", 1983, nyelvek);
        emberek = new Ember[3];
        emberek[0] = e1;
        emberek[1] = e2;
        emberek[2] = e3;
    }

    public Ember[] getEmberek() {
        return Arrays.copyOf(emberek,emberek.length);
    }
    
    public String bemutatkozas(){
        String s = "*** Bemutatkozás ***";
        for (Ember ember : emberek) {
            s += "\n" + ember.bemutatkozas();
            s += "\n-------------";
        }
        return s;
    }
    
    public void nyelvtanfolyam(){
        emberek[0].ujNyelv("angol");
    }
    
    public String egyEmberbemutatkozasa(int i){
        Ember ember = null;
        if (i <emberek.length){
            ember = emberek[i];
        }
        return egyEmberbemutatkozasa(emberek[i]);
    }
    
    public String egyEmberbemutatkozasa(Ember ember){
        String s = "";
        if (ember != null) {
            s = ember.bemutatkozas();
        }
        return s;
    }
}
