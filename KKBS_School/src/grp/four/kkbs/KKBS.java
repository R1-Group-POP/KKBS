/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grp.four.kkbs;

import grp.four.bk.BKGUI;
import grp.four.bk.Kalender;
import grp.four.bk.OpretDagsHandler;
import grp.four.klr.KLRGUI;
import grp.four.klr.KorelaererKatalog;
import grp.four.klr.OpretKorelaererHandler;
import grp.four.ktr.KTRGui;
import grp.four.ktr.KoretojsKatalog;
import grp.four.ktr.OpretKoretojHandler;
import grp.four.tk.TKGUI;
import grp.four.tk.TilfojKoretojerGUI;
import grp.four.tk.TilknytKoretojHandler;

/**
 *
 * @author Henrikh
 */
public class KKBS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BKGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BKGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BKGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BKGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        KoretojsKatalog koretojsKatalog = new KoretojsKatalog();
        final OpretKoretojHandler koretojHandler = new OpretKoretojHandler(koretojsKatalog);
        final KTRGui kTRGui = new KTRGui(koretojHandler);

        KorelaererKatalog korelaererKatalog = new KorelaererKatalog();
        final OpretKorelaererHandler korelaererHandler = new OpretKorelaererHandler(korelaererKatalog);
        final KLRGUI kLRGUI = new KLRGUI(korelaererHandler);

        Kalender kalender = new Kalender();
        final OpretDagsHandler dagsHandler = new OpretDagsHandler(kalender, korelaererKatalog);
        final BKGUI bKGUI = new BKGUI(dagsHandler);
        
        final TilknytKoretojHandler tilknytKoretojHandler = new TilknytKoretojHandler(kalender, koretojsKatalog);
        final TilfojKoretojerGUI tilfojKoretojerGUI = new TilfojKoretojerGUI(tilknytKoretojHandler);
        final TKGUI tKGUI = new TKGUI(tilknytKoretojHandler, tilfojKoretojerGUI);
        tilfojKoretojerGUI.setTkGUI(tKGUI);


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HovedMenuGui(kTRGui, koretojHandler, kLRGUI, korelaererHandler, bKGUI, dagsHandler, tKGUI, tilknytKoretojHandler).setVisible(true);
            }
        });
    }
}
