/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2017.contest1.gruppo06;

/**
 *
 * @author patap
 */
public class CodeCheckEN implements CodeChecker {
 
        @Override
    public boolean check(String codice) {

       // formato ITAADDD EN è fisso DD sono due numeri AA due lettere generiche
        
       String regex = "^EN[0-9]{2}[A-z]{2}$";
       return codice.matches(regex);

    }
    
}
