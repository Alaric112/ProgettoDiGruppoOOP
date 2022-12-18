/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulazionenumerotelefono;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patap
 */
public class GenerateOTP implements Runnable {

    private int otp;
    private boolean attivo;

    public GenerateOTP(boolean attivo) {
        this.attivo = attivo;
    }
            
    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public boolean isAttivo() {
        return attivo;
    }

    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }
            
    @Override
    public void run() {
       
        File f = new File("otp.txt");
    
    while(attivo){        
        
        try(PrintWriter o = new PrintWriter(new BufferedWriter(new FileWriter(f)))){
                        
            codeGenerator();
            o.print("Il codice di sblocco OTP è: "+ otp);
            
        }catch(Exception e){
            
            System.out.println("Luca greco");
            
        }
        
            try {
                sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GenerateOTP.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
    }
    
    protected void codeGenerator(){
        
        otp = new Random().nextInt(500);
        
    }
    
    
}
