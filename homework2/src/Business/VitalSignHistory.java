 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import java.util.ArrayList;


/**
 *
 * @author jauzh
 */
public class VitalSignHistory {
    private ArrayList<VitalSign> vitalSignList;
    public VitalSignHistory(){
        vitalSignList=new ArrayList<>();
    }
    public ArrayList<VitalSign> getVitalSignList(){
        return vitalSignList;
    }
    public void setVitalSignList(ArrayList<VitalSign> vitalSignList){
        this.vitalSignList=vitalSignList;
    }
    public void addVitalSign(VitalSign vitalSign){
        this.vitalSignList.add(vitalSign);
    }
    
    public void deleteVitalSign(VitalSign vitalSign){
        vitalSignList.remove(vitalSign);
    }
        
}
