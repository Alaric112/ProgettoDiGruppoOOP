/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondasimu;

import javafx.beans.property.BooleanProperty;

/**
 *
 * @author patap
 */
public class FiltroTipoVolume implements Filtro<Libro> {

    private BooleanProperty scolastico;
    private BooleanProperty giuridico;
    private BooleanProperty universitario;
    
    @Override
    public boolean valido(Libro l) {

        boolean x = false;
        
        if(scolastico.get()){
            //String regex = "^EN[0-9]{2}[A-z]{2}$";
            x = l.getCodVol().startsWith("0");
            
            if(x == true)
                return x;
            
        }

        if(giuridico.get()){
            
            x = l.getCodVol().startsWith("3");
            
            if(x == true)
                return x;
            
        }
        
        if(universitario.get()){
                        
            x = l.getCodVol().startsWith("4");
            
               if(x == true)
                return x;
            
        }
        
        return x;
    }
    
}
