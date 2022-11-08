/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppoxx;

/**
 *
 * @author patap
 */
public class BoxTruck extends Truck {
    
    private boolean lutonBody;

    public BoxTruck(boolean lutonBody, String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, TruckType tt, int truckClass) {
        super(chassisID, dw, year, month, dayOfMonth, tt, truckClass);
        this.lutonBody = lutonBody;
    }
    
        public BoxTruck(String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, TruckType tt, int truckClass) {
        this(false, chassisID, dw, year, month, dayOfMonth, tt, truckClass);

    }

    public boolean hasLutonBody() {
        return lutonBody;
    }
    
    @Override
    public boolean validateTruck(){
        
        if((getTruckClass() >= 1) || (getTruckClass() <= 8)) {
        
           String regex =  "^B[A-z]{3}[0-9]{3}$"; 
           return getChassisID().equals(regex);
        }
        
        return false;
    }

    @Override
    public String toString() {


        StringBuffer s = new StringBuffer();

        s.append("BoxTruck\n");
        s.append(super.toString());
        
        if (lutonBody){
            
            s.append("\nwith Luton Body");
            
        }
        
        return s.toString();
    }
    
}
