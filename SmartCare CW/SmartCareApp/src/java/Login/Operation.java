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
public class Operation {
    String oID;
    String eID;
    String cID;
    String oDate;
    String oTime;
    String nSlot;
    String charge;
    String status;
    String sName;
    public Operation(){
    
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getStatus() {
        return status;
    }

    public String getsName() {
        return sName;
    }
    
    
    public void setoID(String oID) {
        this.oID = oID;
    }

    public void seteID(String eID) {
        this.eID = eID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public void setoDate(String oDate) {
        this.oDate = oDate;
    }

    public void setoTime(String oTime) {
        this.oTime = oTime;
    }

    public void setnSlot(String nSlot) {
        this.nSlot = nSlot;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }
    
    
    
    public String getoID() {
        return oID;
    }

    public String geteID() {
        return eID;
    }

    public String getcID() {
        return cID;
    }

    public String getoDate() {
        return oDate;
    }

    public String getoTime() {
        return oTime;
    }

    public String getnSlot() {
        return nSlot;
    }

    public String getCharge() {
        return charge;
    }
    
    
    
}
