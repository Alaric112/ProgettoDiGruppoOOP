/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppo06.fare;

import gruppo06.fornite.DriveWheelType;
import gruppo06.fornite.TruckType;

/**
 *
 * @author patap
 */
public class BoxTruck extends Truck {
    
   private final boolean lutonBody;

    public BoxTruck(boolean lutonBody, String chassisID, DriveWheelType dw, int year, int month, int DayOfMonth, TruckType tt, int truckClass) {
        super(chassisID, dw, year, month, DayOfMonth, tt, truckClass);
        this.lutonBody = lutonBody;
    }
   
      public BoxTruck(String chassisID, DriveWheelType dw, int year, int month, int DayOfMonth, TruckType tt, int truckClass) {
        super(chassisID, dw, year, month, DayOfMonth, tt, truckClass);
        this.lutonBody = false;
    }

    public boolean hasLutonBody() {
        return lutonBody;
    }
    
    @Override
    public boolean validateTruck(){
        
        String regex = "^B[A-z]{3}[0-9]{3}$";
            
        if(!((regex.equals(this.getChassisID())) || ((this.getTruckClass()< 9) && this.getTruckClass() > 0))){
        
            
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        
        StringBuffer s = new StringBuffer();
        s.append("BoxTruck\n");
        s.append(super.toString());
        
    if(lutonBody){    

        s.append("\nwith luton Body");
    }    
        

       return s.toString();
    }
    
    
    
}
