/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2016.contest1.gruppoXX;

import java.util.Collections;
import java.util.LinkedList;

/**
 *extends LinkedList<Person>
 * @author patap
 */
public class Department extends LinkedList<Person> implements Sortable, Filterable {

    @Override
    public void sort() {
        Collections.sort(this);

       }

    @Override
    public Department filter(PersonFilter f) {
        Department list = new Department();

        for(Person x : this) {

            if(f.checkPerson(x)) list.add(x);
        }

        return list;


      }

    @Override
    public String toString() {

   
        return super.toString();


    }
 
    
}
