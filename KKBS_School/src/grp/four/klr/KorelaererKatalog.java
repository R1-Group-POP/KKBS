/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grp.four.klr;
import java.util.ArrayList;

/**
 *
 * @author Patrick
 */
public class KorelaererKatalog {
    private ArrayList<Korelaerer> korelaererListe;
    
    public KorelaererKatalog() {
        korelaererListe = new ArrayList<>();
    }
    public String hentKørelærerListe() {
        return korelaererListe.toString();
    }
    
    public ArrayList<Korelaerer> hentKørelærer() {
        return korelaererListe;
    }
    
    public String opretKørelærer(String klId, String navn, String compCvr, String tlf) {
        korelaererListe.add(new Korelaerer(klId, navn, compCvr, tlf));
        return hentKørelærerListe();
    }
            
            
            
    
}
