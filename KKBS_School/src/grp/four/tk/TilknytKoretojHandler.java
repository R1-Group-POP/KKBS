/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grp.four.tk;

import grp.four.bk.Dag;
import grp.four.bk.Kalender;
import grp.four.ktr.Koretoj;
import grp.four.ktr.KoretojsKatalog;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patrick
 */
public class TilknytKoretojHandler {

    private Kalender kalender;
    private KoretojsKatalog koretojsKatalog;

    public TilknytKoretojHandler(Kalender kalender, KoretojsKatalog koretojsKatalog) {
        this.kalender = kalender;
        this.koretojsKatalog = koretojsKatalog;
    }

    public ArrayList<String> hentBookedeDage() {
        return kalender.hentBookedeDage();
    }

    public ArrayList<Dag> hentDage() {
        return kalender.hentDage();
    }

    public Dag hentDag(String dato) {
        return kalender.hentDag(dato);
    }

    public void fjernKoretojFraDag(String dato, String fdmNo) {
        kalender.hentDag(dato).removeKoretoj(fdmNo);
    }

    public ArrayList<Koretoj> hentTilfojedeKoretojer(String dato) {
        return kalender.hentDag(dato).getKoretojer();
    }

    public int hentAntalTilfojedeKoretojer(String dato) {
        ArrayList<Koretoj> tilfojedeKoretojer = new ArrayList<>();
        try {
            tilfojedeKoretojer = kalender.hentDag(dato).getKoretojer();
            return tilfojedeKoretojer.size();
        } catch (NullPointerException e) {
            return 0;
        }
    }

    public ArrayList<Koretoj> hentKoretojer() {
        return koretojsKatalog.hentKoretojer();
    }

    public Koretoj hentKoretoj(String fdmNo) {
        return koretojsKatalog.hentKoretoj(fdmNo);
    }

    public boolean tilfojKoretojTilDag(List koretojsListe, String dato) {

        Dag dag = hentDag(dato);
        ArrayList<Koretoj> tilfojedeKoretojer = hentTilfojedeKoretojer(dag.getDato());

        if (koretojsListe.size() + tilfojedeKoretojer.size() > 6) {
            return false;
        } else {
            for (Object o : koretojsListe) {
                dag.addKoretoj(hentKoretoj(o.toString()));
            }
            return true;
        }
    }
}