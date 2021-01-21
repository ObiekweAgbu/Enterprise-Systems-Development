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
public class Invoice {
    String iID;
    String cID;
    String sName;
    String dName;
    String total;
    String status;
            
    public Invoice(){
    
    }

    public void setiID(String iID) {
        this.iID = iID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getiID() {
        return iID;
    }

    public String getcID() {
        return cID;
    }

    public String getsName() {
        return sName;
    }

    public String getdName() {
        return dName;
    }

    public String getTotal() {
        return total;
    }

    public String getStatus() {
        return status;
    }
    
}
