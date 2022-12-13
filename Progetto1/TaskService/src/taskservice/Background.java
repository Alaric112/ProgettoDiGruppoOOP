/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskservice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Provider;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

/**
 *
 * @author patap
 */
public class Background extends Service  {
    
    // ATTENZIONE esistono più classi Service, se si sta lavorando con javaFX si deve implementare Service per JavaFX
    
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
        protected Task<ObservableList<Terremoto>> createTask() {
            return new Task<ObservableList<Terremoto>>() {
                @Override
                protected ObservableList<Terremoto> call()
                        throws IOException, MalformedURLException {
                                
                                ObservableList<Terremoto> list = FXCollections.observableArrayList();
                                
                            try(Scanner scan= new Scanner(new BufferedReader( new InputStreamReader( new URL(getUrl()).openStream())))){
          //  Scanner scan = new Scanner(BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(getUrl()).openStream()))
             
             scan.useLocale(Locale.US);
             scan.useDelimiter("\\||\n");
             scan.nextLine();
             
         while(scan.hasNext()){               

             System.out.println("Managgia dio");
             
             Terremoto evento = new Terremoto();
             
             evento.setEventID(scan.next());
             evento.setDate(LocalDateTime.parse(scan.next()));
             evento.setLatitude(scan.nextDouble());
             evento.setLongitude(scan.nextDouble());
             evento.setDepthKm(scan.nextDouble());
             evento.setMagAuthor(scan.next());
             evento.setCatalog(scan.next());
             evento.setContributor(scan.next());
             evento.setContributorId(scan.next());
             evento.setMagType(scan.next());
             evento.setMagnitude(scan.next());
             evento.setMagAuthor(scan.next());
             evento.setEventLocationName(scan.next());
             evento.setEventType(scan.next());
             
             System.out.println(evento);
             
             list.add(evento);
            }
                                
        }catch(RuntimeException e){//Raggiunta la fine del file    
                    
                    
                }
                            
                return list;
            }
        };
    }
    
    
    
    
}
