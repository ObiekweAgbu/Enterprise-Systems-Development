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
public class Booking_OBJ {
    String sID;
    String cID;
    String sTime;
    String sName;
    String sSlot;
    String eID;
    String sDate;
    public Booking_OBJ(){
    
    }

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }
    
    public String geteID() {
        return eID;
    }

    public void seteID(String eID) {
        this.eID = eID;
    }
    
    public String getsSlot() {
        return sSlot;
    }

    public void setsSlot(String sSlot) {
        this.sSlot = sSlot;
    }
    
    public void setsID(String sID) {
        this.sID = sID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public void setsTime(String sTime) {
        this.sTime = sTime;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsID() {
        return sID;
    }

    public String getcID() {
        return cID;
    }

    public String getsTime() {
        return sTime;
    }

    public String getsName() {
        return sName;
    }
    
}
