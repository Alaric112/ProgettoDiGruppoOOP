/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.developed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patap
 */
public class EQReport {
    
    
    private final String nome;
    private List<EQEvent> lista;

    public EQReport(String nome) {
        this.nome = nome;
        lista = new LinkedList();
    }
    
    public void addEvent(EQEvent c){
        
        lista.add(c);
        
    }
    
    public void sort(){
    
       lista.sort(null);
    
    }
 
    public void sort(Comparator<EQEvent> c){
        
        //Collections.sort(lista, c);
        
             lista.sort(c);
  
        
    }
    
    public static EQReport readFromTextFile(String filename) {
        
        EQReport report = new EQReport("Report from textfile: " + filename);
       
        try(BufferedReader reader = new BufferedReader(new FileReader(filename) ) ){
            
         String line;
         
         while((line = reader.readLine()) != null){
          
             EQEvent evento = new EQEvent();

             Scanner scan = new Scanner(line);
             
             scan.useLocale(Locale.US);
             
             scan.useDelimiter("\\|");
             
             
             evento.setEventID(scan.next());
             evento.setTime(LocalDateTime.parse(scan.next()));
             evento.setLatitude(scan.nextDouble());
             evento.setLongitude(scan.nextDouble());
             evento.setDepthKm(scan.nextDouble());
             evento.setAuthor(scan.next());
             evento.setCatalog(scan.next());
             evento.setContributor(scan.next());
             evento.setContributorID(scan.next());
             evento.setMagType(scan.next());
             evento.setMagnitude(scan.nextDouble());
             evento.setMagAuthor(scan.next());
             evento.setEventLocationName(scan.next());

             report.addEvent(evento);
             
         } } catch (FileNotFoundException ex) {
            Logger.getLogger(EQReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EQReport.class.getName()).log(Level.SEVERE, null, ex);
        }

        return report;
        
    }
    
    public static void printToTextFile(EQReport eqr, String filename){
              
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename) ) ){
                     
        for(EQEvent i : eqr.lista){
                         
        writer.write(   i.getEventID() + '|' + 
                                        i.getTime()+ '|'+
                                        i.getLatitude() + '|'+
                                        i.getLongitude()+ '|' + 
                                        i.getDepthKm()+ '|' +
                                        i.getAuthor() + '|'+
                                        i.getCatalog()+ '|'+
                                        i.getContributor() +'|'+
                                        i.getContributorID()+ '|'+
                                        i.getMagType()+ '|'+
                                        i.getMagnitude()+ '|'+
                                        i.getMagAuthor() + '|' +
                                        i.getEventLocationName()+ '\n');
             
         } } catch (IOException ex) {
            Logger.getLogger(EQReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
