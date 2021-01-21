/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Lil Shil
 */
public class Prescription {
    String pID;
    String cID;
    String eID;
    String drName;
    String drQuan;
    String drNote;
    String drTotal;
    String prDate;
    public Prescription(){
        
    }

    public void setpID(String pID) {
        this.pID = pID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public void seteID(String eID) {
        this.eID = eID;
    }

    public void setDrName(String drName) {
        this.drName = drName;
    }

    public void setDrQuan(String drQuan) {
        this.drQuan = drQuan;
    }

    public void setDrNote(String drNote) {
        this.drNote = drNote;
    }

    public void setDrTotal(String drTotal) {
        this.drTotal = drTotal;
    }

    public void setPrDate(String prDate) {
        this.prDate = prDate;
    }
    
    public String getpID() {
        return pID;
    }

    public String getcID() {
        return cID;
    }

    public String geteID() {
        return eID;
    }

    public String getDrName() {
        return drName;
    }

    public String getDrQuan() {
        return drQuan;
    }

    public String getDrNote() {
        return drNote;
    }

    public String getDrTotal() {
        return drTotal;
    }

    public String getPrDate() {
        return prDate;
    }
    
}
