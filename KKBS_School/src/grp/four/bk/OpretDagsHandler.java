/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grp.four.bk;

import grp.four.klr.Korelaerer;
import grp.four.klr.KorelaererKatalog;
import java.util.ArrayList;

/**
 *
 * @author Patrick
 */
public class OpretDagsHandler {
    
    private Kalender kalender;
    private KorelaererKatalog korelaererKatalog;
    private ArrayList<String> elever = new ArrayList<>();

    public OpretDagsHandler(Kalender kalender, KorelaererKatalog korelaererKatalog) {
        this.kalender = kalender;
        this.korelaererKatalog = korelaererKatalog;
    }
    
    public ArrayList<String> startKursusBooking() {
        return kalender.hentLedigeDage();
    }
    
    public void angivKursusOplysninger(String dato, String kategori, Korelaerer korelaerer, String[] elever) {
        kalender.bookDag(dato, kategori, korelaerer, elever);
    }

    public ArrayList<String> hentElever() {
        return elever;
    }

    public boolean tilføjElev(String e) {
        return elever.add(e);
    }

    public boolean fjernElev(Object o) {
        return elever.remove(o);
    }
    
    public void resetElever() {
        elever = new ArrayList<String>();
    }

    public boolean elevListeEr6() {
        if(elever.size() >= 6) {
            return true;
        }
        return false;
    }
    
    public boolean elevListeEr0() {
        if(elever.size() == 0) {
            return true;
        }
        return false;
    }
    
    public boolean korerlaererKatalogEr0() {
        if(korelaererKatalog.hentKørelærer().size() == 0) {
            return true;
        }
        return false;
    }
    
    public Korelaerer hentKorelaerer(String name) {
        for(Korelaerer k : korelaererKatalog.hentKørelærer()) {
            if(k.getNavn().equalsIgnoreCase(name)) {
                return k;
            }
        }
        return null;
    }
    
    public ArrayList<Korelaerer> hentKorelaerer() {
        return korelaererKatalog.hentKørelærer();
    }
    
    
}
