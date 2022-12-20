/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppo06;

/**
 *
 * @author darbo
 */
public class TFQuestionUserAttempt extends TFQuestion {
    
    private TFQuestion question;
    private boolean givenAnswer;   //risposta contrassegnata dall'utente come esatta

    /**
     * Costruttore vuoto
     */
    public TFQuestionUserAttempt() {
    }
<<<<<<< HEAD
=======
    
    /**
     * Costruttore appartenente alla classe TFQuestionUserAttemtpt
     * @param questionTest
     * @param answer
     * @param question
     * @param givenAnswer 
     */
>>>>>>> 570071c95c7dbd73eae37fb8b57158dc260140df

    public TFQuestionUserAttempt(String questionTest, boolean answer, TFQuestion question, boolean givenAnswer) {
        
        super(questionTest, answer);
        this.question = question;
        this.givenAnswer = givenAnswer;
    }
    
    /**
     * Getter dell'attributo question appartenente alla classe TFQuestion
     * @return 
     */

    public TFQuestion getQuestion() {
        return question;
    }

    /**
     * Getter dell'attributo givenAnswer appartenente alla classe TFQuestion
     * @return 
     */
    public boolean isGivenAnswer() {
        return givenAnswer;
    }
  
    public boolean isCorrect(){
        
        return givenAnswer == answer;
        
    }
    
    public String getResult(){
        
        if(givenAnswer == answer){
            
            return "Corretta";
            
        }
        
        else return "Sbagliata";
        
    }
    
    
    
}
