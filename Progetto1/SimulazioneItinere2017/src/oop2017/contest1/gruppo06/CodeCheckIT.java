/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2017.contest1.gruppo06;

/**
 *
 * @author patap
 */
public class CodeCheckIT implements CodeChecker {

    @Override
    public boolean check(String codice) {

       // formato ITAADDD IT è fisso AA sono due generiche lettere DDD tre numeri generici
        
       String regex = "^IT[A-z]{2}[0-9]{3}$";
       return codice.matches(regex);

    }
  
}
