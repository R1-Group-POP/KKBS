/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grp.four.ktr;

import java.util.ArrayList;

/**
 *
 * @author Henrikh
 */
public class KoretojsKatalog {
    private ArrayList<Koretoj> koretojer = new ArrayList<>();
    
    public KoretojsKatalog(){};
    
    public String hentKoretojerSomString(){
        String koretojsliste;
        koretojsliste = koretojer.toString();
        return koretojsliste;
    }
    
    public String opretKoretoj(String fdmNo, String stelNo, String kategori){
        Koretoj koretoj = new Koretoj(fdmNo, stelNo, kategori);
        koretojer.add(koretoj);
        String koretojsliste;
        koretojsliste = koretojer.toString();
        return koretojsliste;  
    }
    
    public ArrayList<Koretoj> hentKoretojer() {
        return koretojer;
    }
    
    public Koretoj hentKoretoj(String fdmNo) {
        for(Koretoj k : koretojer) {
            if(k.getFdmNo().equals(fdmNo)) {
                return k;
            }
        }
        return null;
    }
    
}
