package vezerlo;


import modell.Ember;
import modell.EmberekBemutatkoznak;
import nezet.KozolNezet;

public class KozolVezerlo {
    private EmberekBemutatkoznak modell;
    private KozolNezet nezet;


    public KozolVezerlo(EmberekBemutatkoznak modell, KozolNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
    }

    public void kezdes() {
        String adat = this.modell.bemutatkozas();
        this.nezet.kiiras(adat);
        
        modell.nyelvtanfolyam();
        nezet.kiiras("\nTanfolyam után: \n");
        nezet.kiiras(modell.bemutatkozas());
        
        nezet.kiiras(modell.egyEmberbemutatkozasa(0));
    }
    
    public String bemutatkozasosszeallitas(){
        String s = "*** Bemutatkozás ***";
        for (Ember ember : modell.getEmberek()) {
            s += "\n" + ember.bemutatkozas();
            s += "\n-------------";
        }
        
        return s;
    }
    public String bemutatkozasosszeallitas(Ember ember){
        return "";
    }
    public String bemutatkozasosszeallitas(int i){
        return "";
    }
 
}
