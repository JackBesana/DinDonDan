/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esdindondan;

/**
 *
 * @author besana_giacomo
 */
public class DatiCondivisi {

    int numDin;
    int numDon;
    int numDan;

    public DatiCondivisi(int numDin, int numDon, int numDan) {
        this.numDin = numDin;
        this.numDon = numDon;
        this.numDan = numDan;
    }

    public DatiCondivisi() {
        this.numDin = 0;
        this.numDon = 0;
        this.numDan = 0;
    }

    public void setNumDin(int numDin) {
        this.numDin = numDin;
    }

    public void setNumDon(int numDon) {
        this.numDon = numDon;
    }

    public void setNumDan(int numDan) {
        this.numDan = numDan;
    }

    public int getNumDin() {
        return numDin;
    }

    public int getNumDon() {
        return numDon;
    }

    public int getNumDan() {
        return numDan;
    }

    
    @Override
    public String toString() {
        return "Conteggio: " + "Din=" + numDin + ", Don=" + numDon + ", Dan=" + numDan + '}';
    }
    
    public boolean vincita(String prev) {
       
    return false;
    }
}
