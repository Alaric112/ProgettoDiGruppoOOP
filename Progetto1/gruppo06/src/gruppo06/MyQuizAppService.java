/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppo06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.Scanner;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

/**
 *
 * @author Gruppo06
 */
public class MyQuizAppService extends Service {
    private StringProperty url = new SimpleStringProperty();
    private ObservableList<TFQuestionUserAttempt> list;
    
        public final void setUrl(String value) {
            url.set(value);
        }

        public final String getUrl() {
            return url.get();
        }

        public final StringProperty urlProperty() {
           return url;
        }    

    public ObservableList<TFQuestionUserAttempt> getList() {
        return list;
    }

    public void setList(ObservableList<TFQuestionUserAttempt> list) {
        this.list = list;
    }

        
        
    @Override
    protected Task<ObservableList<TFQuestionUserAttempt>> createTask() {
        return new Task<ObservableList<TFQuestionUserAttempt>>() {
                @Override
                protected ObservableList<TFQuestionUserAttempt> call()
                        throws IOException, MalformedURLException {
                                                                
                          try(Scanner scan = new Scanner(new BufferedReader( new InputStreamReader( new URL(getUrl()).openStream())))){
             
                                 scan.useLocale(Locale.US);
                                 scan.useDelimiter(";|\n"); // || or \n
                                 scan.nextLine();
             
                    while(scan.hasNext()){
                        TFQuestionUserAttempt q1 = new TFQuestionUserAttempt();
                        q1.setQuestionTest(scan.next());
                        q1.setAnswer(scan.nextBoolean());
             
                        list.add(q1);
                }

            }catch(RuntimeException e){  
                  System.out.println("Errore runtime");
                    }

                    return list;
                }
            };
    }
    
}
