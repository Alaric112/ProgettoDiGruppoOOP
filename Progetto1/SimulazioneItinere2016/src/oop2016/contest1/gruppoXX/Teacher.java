/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2016.contest1.gruppoXX;

/**
 *
 * @author 39334
 */
public class Teacher extends Person {
    
    private TeacherType type;

    public Teacher(String name, String surname, TeacherType type, int year, int month, int dayOfMonth) {
        super(name, surname, year, month, dayOfMonth);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "Type = " + type + '\n';
    }
    
}
