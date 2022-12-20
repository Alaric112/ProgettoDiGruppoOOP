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
    
    

    public TFQuestionUserAttempt(String questionTest, boolean answer, TFQuestion question, boolean givenAnswer) {
        
        super(questionTest, answer);
        this.question = question;
        this.givenAnswer = givenAnswer;
    }

    public TFQuestion getQuestion() {
        return question;
    }

    public boolean isGivenAnswer() {
        return givenAnswer;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
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
