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
import java.time.LocalDateTime;
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
 * @author Portatile
 */
public class MyQuizAppService extends Service {
    private StringProperty url = new SimpleStringProperty();

        public final void setUrl(String value) {
            url.set(value);
        }

        public final String getUrl() {
            return url.get();
        }

        public final StringProperty urlProperty() {
           return url;
        }    

    @Override
    protected Task<ObservableList<TFQuestion>> createTask() {
        return new Task<ObservableList<TFQuestion>>() {
                @Override
                protected ObservableList<TFQuestion> call()
                        throws IOException, MalformedURLException {
                                
                                ObservableList<TFQuestion> list = FXCollections.observableArrayList();
                                
                          try(Scanner scan = new Scanner(new BufferedReader( new InputStreamReader( new URL(getUrl()).openStream())))){
             
                                 scan.useLocale(Locale.US);
                                 scan.useDelimiter("\\|\n"); // || or \n
                                 scan.nextLine();
             
                    while(scan.hasNext()){
                        TFQuestion q1 = new TFQuestion();
                        q1.setQuestionTest(scan.next());
             
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
