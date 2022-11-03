/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2016.contest1.gruppoXX;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author PC
 */
public class Teacher extends Person{
    private TeacherType type;

    public Teacher(String name, String surname, TeacherType type, int year, int month, int dayOfMonth) {
        super(name, surname, year, month, dayOfMonth);
        this.type = type;
    }

    public TeacherType getType() {
        return type;
    }

    @Override
    public String toString() {
        StringBuffer b = new StringBuffer();
        b.append(super.toString());
        b.append("\nType = ");
        b.append(type);
        return b.toString();
    }
}
