/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;


/**Respiratory rate
2. Heart rate
3. Systolic blood pressure
4. Weight in pounds
5. The time
 *
 * @author jauzh
 */
public class VitalSign {
    private int respiratoryRate;
    private int heartRate;
    private int systolicBloodPressure;
    private int weight;
    private String time;
    private boolean isNormal;
    
    public VitalSign(int respiratoryRate, int heartRate, int systolicBloodPressure, int weight, String time){
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.systolicBloodPressure=systolicBloodPressure;
        this.weight=weight;
        this.time=time;
        
    }
    
    public int getRespiratoryRate(){
        return respiratoryRate;
    }
    public void setRespiratoryRate(int respiratoryRate){
        this.respiratoryRate=respiratoryRate;
    }
    public int getHeartRate(){
        return heartRate;
    }
    public void setHeartRate(int heartRate){
        this.heartRate=heartRate;
    }
    public int getSystolicBloodPressure(){
        return systolicBloodPressure;        
    }
    public void setSystolicBloodPressure(int systolicBloodPressure){
        this.systolicBloodPressure=systolicBloodPressure;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public String getTime(){
        return time;
    }
    public void setTime(String time){
        this.time=time;
    }
    public boolean getIsNormal(){
        return isNormal;
    }
    public void setIsNormal(boolean isNormal){
        this.isNormal=isNormal;
    }
    
    public void diagnose(int age){
        
        int rrMax = 0;
        int rrMin = 0;
        int hrMax = 0;
        int hrMin = 0;
        int spMax = 0;
        int spMin = 0;
        int wpMax = 0;
        int wpMin = 0;
        
        if(age >= 1 && age <= 3){
            rrMax = 30;
            rrMin = 20;
            hrMax = 130;
            hrMin = 80;
            spMax = 110;
            spMin = 80;
            wpMax = 31;
            wpMin = 22;
        } else if (age >= 4 && age <= 5){
            rrMax=30;
            rrMin=20;
            hrMax = 120;
            hrMin = 80;
            spMax = 110;
            spMin = 80;
            wpMax = 40;
            wpMin = 31;
        } else if (age >= 6 && age <= 12){
            rrMax=30;
            rrMin=20;
            hrMax = 110;
            hrMin = 70;
            spMax = 120;
            spMin = 80;
            wpMax = 92;
            wpMin = 41;
        } else if (age >= 13){
            rrMax=20;
            rrMin=11;
            hrMax = 105;
            hrMin = 55;
            spMax = 110;
            spMin = 120;
            wpMax = Integer.MAX_VALUE;
            wpMin = 110;
        }
                
        boolean isnorm = true;
        
        if (respiratoryRate > rrMax || respiratoryRate < rrMin) isnorm = false;
        if (heartRate > hrMax || heartRate < rrMin) isnorm = false;
        if(systolicBloodPressure > spMax || systolicBloodPressure < spMin) isnorm = false;
        if (weight> wpMax || weight< wpMin) isnorm=false;
   
        this.isNormal = isnorm;
    }  
    
     @Override
    public String toString(){
        return getTime();
    
    }
}
