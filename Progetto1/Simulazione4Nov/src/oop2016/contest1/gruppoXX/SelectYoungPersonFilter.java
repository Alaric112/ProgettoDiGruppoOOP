/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2016.contest1.gruppoXX;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author darbo
 */
public class SelectYoungPersonFilter implements PersonFilter {
    
    private final LocalDate maxDate;

    public SelectYoungPersonFilter(int year, int month, int dayOfMonth) {
        maxDate=LocalDate.of(year, month, dayOfMonth);
    }
    
 

    @Override
    public boolean checkPerson(Person p) {
     
        return p.getBirthDate().isAfter(maxDate);
        
    }
    
}
