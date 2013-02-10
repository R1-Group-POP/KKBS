/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grp.four.klr;

/**
 *
 * @author Patrick
 */
public class Korelaerer {
    private String klId;
    private String navn;
    private String compCvr;
    private String tlf;
    
    public Korelaerer(String klId, String navn, String compCvr, String tlf) {
      this.klId = klId;
      this.compCvr = compCvr;
      this.navn = navn;
      this.tlf = tlf;
    }
    
    public String getKlId() {
        return klId;
    }
    
    public void setKlId(String klId) {
        this.klId = klId;
    }
    public String getNavn() {
        return navn;
    }
    
    public void setNavn(String navn) {
        this.navn = navn;
    }
    public String getCompCvr() {
        return compCvr;
    }
    
    public void setCompCvr(String compCvr) {
        this.compCvr = compCvr;
    }
    public String getTlf() {
        return tlf;
    }
    
    public void setTlf(String tlf) {
        this.tlf = tlf;
    }
    public String toString() {
        return "Navn: " + navn + " Firma CVR Nr: " + compCvr + " Telefon: " + tlf + " KL ID: " + klId + "\n";
    }
}
