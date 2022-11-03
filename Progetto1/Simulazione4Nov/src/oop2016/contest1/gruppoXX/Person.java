/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2016.contest1.gruppoXX;

import java.time.LocalDate;

/**
 *
 * @author patap
 */
public class Person implements Comparable<Person> {
    
    private final String name;
    private final String surname;
    private final LocalDate birthDate;

    public Person(String name, String surname, int year, int month, int dayOfMonth) {
        this.name = name;
        this.surname = surname;
        this.birthDate = LocalDate.of(year, month, dayOfMonth);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthDate() {
        
        LocalDate date = LocalDate.of(birthDate.getYear(), birthDate.getMonth(), birthDate.getDayOfMonth());
        return date;
    }

    @Override
    public String toString() {

        StringBuffer s = new StringBuffer();
        
        s.append("Name = ");
        s.append(name);
        s.append("\nSurname = ");
        s.append(surname);
        s.append("Birth date = ");
        s.append(birthDate);

        return s.toString();
        
    }
    
    @Override
    public int compareTo(Person p){
        
        return this.birthDate.compareTo(p.birthDate);
           
    }
    
}
