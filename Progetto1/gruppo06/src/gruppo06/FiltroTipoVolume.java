/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppo06;

import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;

/**
 *
 * @author patap
 */
public class FiltroTipoVolume implements Filtro<Libro> {

    private Boolean ScolasticoProperty;
    private Boolean GiuridicoProperty;
    private Boolean UniversitarioProperty;

    public FiltroTipoVolume(Boolean ScolasticoProperty, Boolean GiuridicoProperty, Boolean UniversitarioProperty) {
        this.ScolasticoProperty = ScolasticoProperty;
        this.GiuridicoProperty = GiuridicoProperty;
        this.UniversitarioProperty = UniversitarioProperty;
    }           
    
    @Override
    public boolean valido(Libro l) {

        boolean x = false;
                
//        System.out.println("----------------------");
//        System.out.println(ScolasticoProperty);
//        System.out.println(GiuridicoProperty);
//        System.out.println(UniversitarioProperty);
//        System.out.println("----------------------");
        
        if(ScolasticoProperty){
            //String regex = "^EN[0-9]{2}[A-z]{2}$";
            x = l.getTipoVol().startsWith("0");
            
            if(x == true)
                return x;
            
        }

        if(GiuridicoProperty){
            
            x = l.getTipoVol().startsWith("3");
            
            if(x == true)
                return x;
            
        }
        
        if(UniversitarioProperty){
                        
            x = l.getTipoVol().startsWith("4");
            
               if(x == true)
                return x;
            
        }
        
        return x;
    }
    
}
