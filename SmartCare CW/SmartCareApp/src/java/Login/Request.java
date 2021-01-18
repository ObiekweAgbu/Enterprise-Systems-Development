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
public class Request {
    String ID;
    String Name;
    String DOB;
    String Address;
    String PO;
    String Uname;
    String PW;
    String Job;
    public Request(){
    
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPO(String PO) {
        this.PO = PO;
    }

    public void setUname(String Uname) {
        this.Uname = Uname;
    }

    public void setPW(String PW) {
        this.PW = PW;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getDOB() {
        return DOB;
    }

    public String getAddress() {
        return Address;
    }

    public String getPO() {
        return PO;
    }

    public String getUname() {
        return Uname;
    }

    public String getPW() {
        return PW;
    }

    public String getJob() {
        return Job;
    }
    
}
