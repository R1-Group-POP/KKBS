/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grp.four.klr;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Patrick
 */
public class OpretKorelaererHandler {
    private KorelaererKatalog korelaererKatalog;

    public OpretKorelaererHandler(KorelaererKatalog korelaererKatalog) {
        this.korelaererKatalog = korelaererKatalog;
    }
    
    public String startKørelærerRegistrering() {
        return korelaererKatalog.hentKørelærerListe();
    }
    
    public String angivKørelærerOplysninger(String klId, String navn, String compCvr, String tlf) {
        return korelaererKatalog.opretKørelærer(klId, navn, compCvr, tlf);
    }
    
    public DefaultComboBoxModel hentKørelærerSomModel() {
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        
        for(Korelaerer k : korelaererKatalog.hentKørelærer()) {
            dcbm.addElement(k.getNavn());
        }
        
        return dcbm;
    }
}
