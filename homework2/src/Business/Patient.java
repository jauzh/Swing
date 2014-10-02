/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

/**
 *
 * @author jauzh
 */
public class Patient {
    String name;
    String id;
    int age;
    String doctorName;
    String pharmacy;
    VitalSignHistory vitalSignHistory;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getDoctorName(){
        return doctorName;
    }
    public void setDoctorName(String doctorName){
        this.doctorName=doctorName;
    }
    public String getPharmacy(){
        return pharmacy;
    }
    public void setPharmacy(String pharmacy){
        this.pharmacy=pharmacy;
    }
    public VitalSignHistory getVitalSignHistory(){
        return vitalSignHistory;
    }
    public void setVitalSignHistory(VitalSignHistory vitalSignHistory){
        this.vitalSignHistory=vitalSignHistory;
    }
}
