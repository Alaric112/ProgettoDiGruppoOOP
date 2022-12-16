/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondasimu;

import java.io.BufferedReader;
import java.io.FileReader;
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
public class CaricaCatalogoService extends Service  {
    
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
        protected Task<ObservableList<Libro>> createTask() {
            return new Task<ObservableList<Libro>>() {
                @Override
                protected ObservableList<Libro> call()
                        throws IOException, MalformedURLException {
                                
                                ObservableList<Libro> list = FXCollections.observableArrayList();
                                
                           // try(Scanner scan= new Scanner(new BufferedReader( new InputStreamReader( new URL(getUrl()).openStream())))){
          //  Scanner scan = new Scanner(BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(getUrl()).openStream()))
             try(Scanner scan = new Scanner(new BufferedReader(new FileReader("Cat_Zani_ext.csv")))){
             scan.useLocale(Locale.US);
             scan.useDelimiter(";||\\||\n");
             scan.nextLine();
             
         while(scan.hasNext()){               
             
             System.out.println("Salve salve, salve");
             
             Libro evento = new Libro();
             
             evento.setTipoVol(scan.next());
             evento.setGreed(scan.next());
             evento.setISBN(scan.next());             
             evento.setCodVol(scan.next());
             evento.setTitolo(scan.next());
             evento.setAnno(scan.nextInt());
             evento.setPrezzo(scan.nextDouble());
             evento.setPeso(scan.nextDouble());
             evento.setPagine(scan.nextInt());
             
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

