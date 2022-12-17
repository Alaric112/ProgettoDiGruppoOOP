/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondasimu;

/**
 *
 * @author patap
 */
public class FiltroAnno implements Filtro<Libro> {

    private int min;
    private int max;

    public FiltroAnno(int min, int max) {
        this.min = min;
        this.max = max;
    }
    
    
    
    @Override
    public boolean valido(Libro l) {

        min = min%100;
        max = max%100;
        
        
        int annolibro = l.getAnno(); 
        
//        System.out.println("Intervallo minimo" + min);
//        System.out.println("Intervallo massimo" +max);
        System.out.println("Anno libro corrente" +annolibro);
        
        if(annolibro >= 0 && annolibro <= 64){
            
            if(max>64)
                return false;
            
            int Newmin = min-64;
            int Newmax = max;  
            
//            System.out.println("Intervallo Newmin" + Newmin);
//            System.out.println("Intervallo Newmax" +Newmax);
//            
//            System.out.println(annolibro>=Newmin);
//            System.out.println(annolibro<=Newmax);
            
            if((annolibro >= Newmin) && (annolibro<= Newmax)){
                
                System.out.println("sono dentro il secondo if");
                return true;
            }
            
        }else{
            
            if(annolibro >= min && annolibro<= max){
                
                return true;
            }
            
        }
        
        return false;
        
    }
        
}
