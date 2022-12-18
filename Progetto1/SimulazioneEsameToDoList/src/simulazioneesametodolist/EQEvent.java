/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulazioneesametodolist;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author patap
 */
public class EQEvent implements Serializable, Comparable<EQEvent> {
     
   private static int id=0;
   private LocalDate data;
   private String descrizione;

    public EQEvent(LocalDate data, String descrizione) {
        this.id++;
        this.data = data;
        this.descrizione = descrizione;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public int compareTo(EQEvent o) {

     int x = this.getData().compareTo(o.getData());
     
     if(x == 0){
         
         return this.getId()-o.getId();
     }
     
        return x;
    }

    @Override
    public String toString() {
        return "EQEvent{" + "data=" + data + ", descrizione=" + descrizione + '}';
    }
        
}
