/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.developed.group06;
import it.unisa.diem.oop.provided.DeviceFilter;


/**
 *
 * @author patap
 */
public class NotebookFilter implements DeviceFilter{

 @Override
 public boolean checkDevice(Device d){
     
     return d instanceof Notebook;
     
 }
    
}
