/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppo06;

import java.io.Serializable;

/**
 *
 * @author Gruppo 06
 */
public abstract class Question implements Serializable {
    
    private String questionTest;
    private int id=0;

    /**
     * Costruttore della classe astratta Question
     * @param questionTest 
     */
    public Question(String questionTest) {
        this.questionTest = questionTest;
        id++;
    }
    /**
     * Costruttore vuoto della classe astratta Question
     */
    public Question() {
 
    }
    /**
     * Getter dell'attributo questionTest appartenente alla classe Question
     * @return 
     */

    public String getQuestionTest() {
        return questionTest;
    }
    
    /**
     * Setter dell'attributo questionTest appartenente alla classe Question
     * @param questionTest 
     */

    public void setQuestionTest(String questionTest) {
        this.questionTest = questionTest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Question other = (Question) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Question{" + "questionTest=" + questionTest + ", id=" + id + '}';
    }
    
    
    
    
    
    
    
}
