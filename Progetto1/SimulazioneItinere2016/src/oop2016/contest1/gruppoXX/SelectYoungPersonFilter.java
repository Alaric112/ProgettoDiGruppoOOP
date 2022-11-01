/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2016.contest1.gruppoXX;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author 39334
 */
public class SelectYoungPersonFilter implements PersonFilter {
    
    private LocalDate minData;

    public SelectYoungPersonFilter(int day, int month, int dayOfMonth) {
        this.minData = LocalDate.of(day, month, dayOfMonth);
    }
    
    @Override
    public boolean checkPerson(Person p){
        
        return p.getBirthDate().isAfter(minData);
        
    }
    
}
