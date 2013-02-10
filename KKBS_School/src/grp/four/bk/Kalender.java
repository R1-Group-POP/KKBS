/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grp.four.bk;

import grp.four.klr.Korelaerer;
import grp.four.klr.KorelaererKatalog;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Patrick
 */
public class Kalender {

    private ArrayList<Dag> dage;
    
    public Kalender() {
        dage = new ArrayList<>();
        addDefaultDags();
    }
    
    private void addDefaultDags() {
        dage.add(new Dag("21-04-2013"));
        dage.add(new Dag("22-04-2013"));
        dage.add(new Dag("23-04-2013"));
        dage.add(new Dag("24-04-2013"));
        dage.add(new Dag("25-04-2013"));
        dage.add(new Dag("26-04-2013"));
        dage.add(new Dag("27-04-2013"));
    }
    
    public ArrayList<String> hentLedigeDage() {
        ArrayList<String> ledigeDage = new ArrayList<>();
        
        for(Dag d : dage) {
            if(!d.isBooked()) {
                ledigeDage.add(d.getDato());
            }
        }
        return ledigeDage;
    }
    
    public ArrayList<String> hentBookedeDage() {
        ArrayList<String> bookedeDage = new ArrayList<>();
        
        for(Dag d : dage) {
            if(d.isBooked()) {
                bookedeDage.add(d.getDato() + " : Kategori " + d.getKategori());
            }
        }
        return bookedeDage;
    }
    
    public void bookDag(String dato, String kategori, Korelaerer korelaerer, String[] elever) {
        for(Dag d : dage) {
            if(d.getDato().equals(dato)) {
                d.setKategori(kategori);
                d.setElever(elever);
                d.setKorelaerer(korelaerer);
                d.setBooked(true);
            }
        } 
    }
    
    public ArrayList<Dag> hentDage() {
        return dage;
    }
    
    public Dag hentDag(String dato) {
        for(Dag d : dage) {
            if(d.getDato().equals(dato)) {
                return d;
            }
        }
        return null;
    }
    
}
