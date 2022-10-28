/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2016.contest1.gruppoXX;

/**
 *
 * @author 39334
 */
public class SelectStudentFilter implements PersonFilter {
   
    @Override
    public boolean checkPerson(Person p){
        
        return p instanceof Student;
        
    }
    
}
