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
public class Patient {
    String cName;
    String cDOB;
    String cAddress;
    String cPO;
    String Type;
    public Patient(){
    
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setcDOB(String cDOB) {
        this.cDOB = cDOB;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public void setcPO(String cPO) {
        this.cPO = cPO;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
    public String getcName() {
        return cName;
    }

    public String getcDOB() {
        return cDOB;
    }

    public String getcAddress() {
        return cAddress;
    }

    public String getcPO() {
        return cPO;
    }

    public String getType() {
        return Type;
    }
    
}
