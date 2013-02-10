/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grp.four.ktr;

/**
 *
 * @author Henrikh
 */
public class Koretoj {
    private String fdmNo;
    private String stelNo;
    private String kategori;
    
    public Koretoj(String fdmNo, String stelNo, String kategori){
        this.fdmNo = fdmNo;
        this.stelNo = stelNo;
        this.kategori = kategori;
    }
    
    public String getFdmNo(){
        return fdmNo;
    }
    
    public void setFdmNo(String fdmNo){
        this.fdmNo=fdmNo;
    }
    
    public String toString(){
        return "FdmNo: " + fdmNo + " StelNo: " + stelNo + " Kategori: " + kategori + "\n";
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
}
