/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grp.four.bk;

import grp.four.klr.Korelaerer;
import grp.four.ktr.Koretoj;
import java.util.ArrayList;


/**
 *
 * @author Patrick
 */
public class Dag {
    
    private boolean booked;
    private String kategori;
    private String dato;
    private String[] elever;
    private Korelaerer korelaerer;
    private ArrayList<Koretoj> koretojer = new ArrayList<>();

    public Dag(String dato) {
        this.dato = dato;
        booked = false;
    }

    public ArrayList<Koretoj> getKoretojer() {
        return koretojer;
    }

    public void setKoretojer(ArrayList<Koretoj> koretojer) {
        this.koretojer = koretojer;
    }
    
    public void removeKoretoj(String fdmNo) {
        for(Koretoj k : koretojer) {
            if(k.getFdmNo().equals(fdmNo)) {
                koretojer.remove(k);
                break;
            }
        }
    }

    public int koretojerSize() {
        return koretojer.size();
    }

    public boolean isKoretojerEmpty() {
        return koretojer.isEmpty();
    }

    public boolean addKoretoj(Koretoj e) {
        return koretojer.add(e);
    }

    public boolean removeKoretoj(Object o) {
        return koretojer.remove(o);
    }

    public Korelaerer getKorelaerer() {
        return korelaerer;
    }

    public void setKorelaerer(Korelaerer korelaerer) {
        this.korelaerer = korelaerer;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String[] getElever() {
        return elever;
    }

    public void setElever(String[] elever) {
        this.elever = elever;
    }
    
    
}
