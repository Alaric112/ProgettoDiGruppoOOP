/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2016.contest1.gruppoXX;

import java.time.LocalDate;

/**
 *
 * @author 39334
 */
public class Person implements Comparable<Person> {
    
    
    private final String name, surname;
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
        
        LocalDate t = birthDate;
        
        return t;
    }

    @Override
    public String toString() {
        return "Name = " + name + "\nSurname = " + surname + "\nBirth Date = " + birthDate + '\n';
    }
    
    @Override
    public int compareTo(Person p){
        
        
        System.out.println(birthDate.compareTo(p.getBirthDate()));
        return this.birthDate.compareTo(p.getBirthDate());
        
        //return p.getBirthDate().compareTo(this.birthDate);
    }
        
    
}
