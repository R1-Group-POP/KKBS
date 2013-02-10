/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grp.four.ktr;

/**
 *
 * @author Henrikh
 */
public class OpretKoretojHandler {
    private KoretojsKatalog koretojsKatalog;
    
    public OpretKoretojHandler(KoretojsKatalog koretojsKatalog){
        this.koretojsKatalog = koretojsKatalog;
    }
    
    public String startKoretojsRegistrering(){
        String koretojsliste;
        koretojsliste = koretojsKatalog.hentKoretojerSomString();
        return koretojsliste;
    }
    
    public String angivKoretojsOpl(String fdmNo, String stelNo, String kategori){
        String koretojsliste;
        koretojsliste = koretojsKatalog.opretKoretoj(fdmNo, stelNo, kategori);
        return koretojsliste;
    }
}
