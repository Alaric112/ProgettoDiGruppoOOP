/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppo06.fare;

/**
 *
 * @author patap
 */
public class Tanker extends truck{
    private final int capacity;
    private final Tanktype ttype;

    public Tanker(TankType ttype, int capacity, String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, TruckType tt, int truckClass){
        super(chassisID, dw, year,month, dayOfMonth,tt,truckClass);
        this.ttype = ttype;
        this.capacity = capacity;
    }

    public Tanker(TankType ttype, int capacity, String chassisID, DriveWheelType dw, int year, int month, int dayOfMonth, int truckClass) {
        super(chassisID, dw, year,month, dayOfMonth,truckClass);
        this.ttype = ttype;
        this.capacity = capacity;      
    }

    public int getCapacity() {
        return capacity;
    }

    public Tanktype getTtype() {
        return ttype;
    }
    
    public boolean validateTruck(){
       String regex = "^T[A-z]{3}[0-9]{3}$";
       return this.;
    }
    
    
}
