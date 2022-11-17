/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.test;

import it.unisa.diem.oop.developed.EQReport;
import it.unisa.diem.oop.developed.MagnitudeComparator;

/**
 *
 * @author gruppo06
 */
public class EQRTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        EQReport eq = EQReport.readFromTextFile("query");
        
        System.out.println(eq);
        
        eq.sort(new MagnitudeComparator());
        
        EQReport.printToTextFile(eq, "sorted");
        
        
        // TODO code application logic heres
    }
    
}
