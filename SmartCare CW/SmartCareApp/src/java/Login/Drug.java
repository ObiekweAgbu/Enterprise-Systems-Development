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
public class Drug {
    String dID;
    String dName;
    String dPrice;
    String dCat;
    public Drug(){
    
    }

    public void setdID(String dID) {
        this.dID = dID;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public void setdPrice(String dPrice) {
        this.dPrice = dPrice;
    }

    public void setdCat(String dCat) {
        this.dCat = dCat;
    }

    public String getdID() {
        return dID;
    }

    public String getdName() {
        return dName;
    }

    public String getdPrice() {
        return dPrice;
    }

    public String getdCat() {
        return dCat;
    }
    
}
