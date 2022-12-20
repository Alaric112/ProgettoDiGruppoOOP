/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppo06;

/**
 *
 * @author Gruppo 06
 */
public class TFQuestion extends Question{
    
    private boolean answer;  //accesso privato e prevede il getter, BOOLEAN PERCHE' puo essere unicamente vero o falso

    public TFQuestion(String questionTest, boolean answer) {
        
        super(questionTest);
        this.answer = answer;
    }
    
    public TFQuestion(){
    
    }
    
    /**
     * Getter dell'attributo answer appartenente alla classe TFQuestion
     * @return 
     */
    
    public boolean isAnswer() {
        return answer;
    }

      
}
