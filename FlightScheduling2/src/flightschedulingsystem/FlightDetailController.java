/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightschedulingsystem;

import com.jfoenix.controls.JFXButton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 *
 */
public class FlightDetailController implements Initializable { @FXML
    private TextField flightNoField;

   

    @FXML
    private TextField destinationField;

    @FXML
    private TextField airlineField;

  

    @FXML
    private TextField SourceField;

    @FXML
    private TextField haltStationField;

    
    @FXML
    private TextField durationField;

    @FXML
    private JFXButton submitButton;
     @FXML
    private JFXButton refreshButton;
    
     @FXML
    private TextField arrivalHoursField;

     @FXML
    private TextField departureHourField;
      
     @FXML
    private TextField haltHourField;
     
       @FXML
    private TextField arrivalMinutesField;

    @FXML
    private TextField departureMinutesField;

    @FXML
    private TextField haltMinutesField;

      @FXML
    private Label FlightNoException;

    @FXML
    private Label AirlineException;

    @FXML
    private Label HaltException;

    @FXML
    private Label HaltTimeException;

    @FXML
    private Label ArrivalException;

    @FXML
    private Label DepartureException;

    @FXML
    private Label SourceException;

    @FXML
    private Label DestinationException;

    
    int flightNo;
     String source; 
     String destination; 
     String HaltStation;
     String Airline;
     
int totalDurationHour;
int totalDurationMinutes;
     Link FirstFlightLink;
     int arrivalHour; 
    int arrivalMinutes;   
    int departurehour;
    int departureMinute;
    int halthour;
    int haltMinute;
    boolean exceptionflag=false;
    String TempFile;
     
     // constructor
     
     public FlightDetailController()
     {
         FirstFlightLink=null;
     }
     
//       @FXML
//    void BackButtonAction(ActionEvent event) throws IOException {
//        
//        ((Node)event.getSource()).getScene().getWindow().hide();
//    
//      Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/AdminForm.fxml"));
//        
//                Scene scene = new Scene(root);
//        Stage stage = new Stage();
//     stage.setScene(scene);
//      stage.show();
//    }
    @FXML
    void submitButtonAction(ActionEvent event) throws IOException {
        
    ////------------------------ EXCEPTIONS HANDLING--------------------\\\\\\\\
  
         if (flightNoField.getText().isEmpty()) {

            
            FlightNoException.setVisible(true);
            exceptionflag = true;
         }
        
          try {
            Integer.parseInt(flightNoField.getText());
        } catch (NumberFormatException e) {

            FlightNoException.setText("✖ This field must contain number");
           FlightNoException.setVisible(true);
            exceptionflag = true;
        }  
            
         if (arrivalHoursField.getText().isEmpty()|| arrivalMinutesField.getText().isEmpty()) {

            
            ArrivalException.setVisible(true);
            exceptionflag = true;
         }
         
         
          try {
            Integer.parseInt(arrivalHoursField.getText());
        } catch (NumberFormatException e) {

             DepartureException.setText("✖ This field must contain number");
           DepartureException.setVisible(true);
            exceptionflag = true;
        }
          
          try {
            Integer.parseInt(arrivalMinutesField.getText());
        } catch (NumberFormatException e) {

             DepartureException.setText("✖ This field must contain number");
           DepartureException.setVisible(true);
            exceptionflag = true;
        }
         
          
     if (departureHourField.getText().isEmpty()||departureMinutesField.getText().isEmpty()) {

            
            DepartureException.setVisible(true);
            exceptionflag = true;
         }
         
         
          
          try {
            Integer.parseInt(departureHourField.getText());
        } catch (NumberFormatException e) {

             DepartureException.setText("✖ This field must contain number");
           DepartureException.setVisible(true);
            exceptionflag = true;
        }
        
          try {
            Integer.parseInt(departureMinutesField.getText());
        } catch (NumberFormatException e) {

             DepartureException.setText("✖ This field must contain number");
           DepartureException.setVisible(true);
            exceptionflag = true;
        }
           if (haltHourField.getText().isEmpty()||haltMinutesField.getText().isEmpty()) {

            
            HaltException.setVisible(true);
            exceptionflag = true;
         }
         
         
          try {
            Integer.parseInt(haltHourField.getText());
        } catch (NumberFormatException e) {

            HaltException.setText("✖ This field must contain number");
           HaltException.setVisible(true);
            exceptionflag = true;
        }
          
          try {
            Integer.parseInt(haltMinutesField.getText());
        } catch (NumberFormatException e) {

             DepartureException.setText("✖ This field must contain number");
           DepartureException.setVisible(true);
            exceptionflag = true;
        }
          
     
          
           if (SourceField.getText().isEmpty()) {

            
            SourceException.setVisible(true);
            exceptionflag = true;
         } 
           if (destinationField.getText().isEmpty()) {

            
            DestinationException.setVisible(true);
            exceptionflag = true;
         }
          if (haltStationField.getText().isEmpty()) {

            
            HaltException.setVisible(true);
            exceptionflag = true;
         } 
           if (airlineField.getText().isEmpty()) {

            
            AirlineException.setVisible(true);
            exceptionflag = true;
         }
          
    ////-----------------------------------------------------------------------------------\\\\\\
         
         
       
          
    ///// ============================ Insertion=======================================\\\\\\
    
        if(exceptionflag==false){
           flightNo=Integer.parseInt(flightNoField.getText());
         source=SourceField.getText();
         destination=destinationField.getText();
         HaltStation=haltStationField.getText();
         Airline= airlineField.getText();

         arrivalHour=Integer.parseInt(arrivalHoursField.getText());
        departurehour =Integer.parseInt(departureHourField.getText());
           halthour =Integer.parseInt(haltHourField.getText());
     
arrivalMinutes=Integer.parseInt(arrivalMinutesField.getText());
        departureMinute =Integer.parseInt(departureMinutesField.getText());
           haltMinute =Integer.parseInt(haltMinutesField.getText());
       if(departurehour>arrivalHour)
       {
      totalDurationHour=(departurehour-arrivalHour);
       }
       if(departureMinute>arrivalMinutes)
       {
       totalDurationMinutes=(departureMinute-arrivalMinutes);
       }
               
       if(departurehour<arrivalHour)
       {
      totalDurationHour=(arrivalHour-departurehour);
       }
       if(departureMinute<arrivalMinutes)
       {
       totalDurationMinutes=(arrivalMinutes-departureMinute);
       }
       
       durationField.setText(totalDurationHour+"hours :"+totalDurationMinutes+"mins");
     

Link FlightLink=new Link(flightNo,source,destination,Airline,HaltStation, arrivalHour,arrivalMinutes ,departurehour,departureMinute, halthour,haltMinute);
if(FlightLink.source.equalsIgnoreCase("Karachi")|| FlightLink.destination.equalsIgnoreCase("Karachi"))
{
try (FileWriter fw = new FileWriter("Karachi.txt",true);
      
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter writer = new PrintWriter(bw)){
    
  
    FlightLink.next = FirstFlightLink; 
   
    FirstFlightLink = FlightLink;
     writer.println();
     
     writer.append(FlightLink.flightNo+"      ,"+FlightLink.source+"      ,"+FlightLink.destination+"      ,"+FlightLink.Airline+"       "+FlightLink.HaltStation+"      ,"+FlightLink.arrivalHour+":"+FlightLink.arrivalMinutes+"       ,"+FlightLink.departurehour+":"+FlightLink.departureMinute+"          ,"+FlightLink.halthour+":"+FlightLink.haltMinute+"       ,"+durationField.getText());
 writer.close();
}
}
if(FlightLink.source.equalsIgnoreCase("Chicago")|| FlightLink.destination.equalsIgnoreCase("Chicago"))
{
try (FileWriter fw = new FileWriter("Chicago.txt",true);
      
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter writer = new PrintWriter(bw)){
    
  
    FlightLink.next = FirstFlightLink; 
   
    FirstFlightLink = FlightLink;
     writer.println();
     
     writer.append(FlightLink.flightNo+"      ,"+FlightLink.source+"      ,"+FlightLink.destination+"      ,"+FlightLink.Airline+"       "+FlightLink.HaltStation+"      ,"+FlightLink.arrivalHour+":"+FlightLink.arrivalMinutes+"       ,"+FlightLink.departurehour+":"+FlightLink.departureMinute+"          ,"+FlightLink.halthour+":"+FlightLink.haltMinute+"       ,"+durationField.getText());
 writer.close();
}
}
 if(FlightLink.source.equalsIgnoreCase("Dubai")|| FlightLink.destination.equalsIgnoreCase("Dubai"))
{
try (FileWriter fw = new FileWriter("Dubai.txt",true);
      
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter writer = new PrintWriter(bw)){
    
  
    FlightLink.next = FirstFlightLink; 
   
    FirstFlightLink = FlightLink;
     writer.println();
     
     writer.append(FlightLink.flightNo+"      ,"+FlightLink.source+"      ,"+FlightLink.destination+"      ,"+FlightLink.Airline+"       "+FlightLink.HaltStation+"      ,"+FlightLink.arrivalHour+":"+FlightLink.arrivalMinutes+"       ,"+FlightLink.departurehour+":"+FlightLink.departureMinute+"          ,"+FlightLink.halthour+":"+FlightLink.haltMinute+"       ,"+durationField.getText());
 writer.close();
}
}
 if(FlightLink.source.equalsIgnoreCase("Islamabad")|| FlightLink.destination.equalsIgnoreCase("Islamabad"))
{
try (FileWriter fw = new FileWriter("Islamabad.txt",true);
      
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter writer = new PrintWriter(bw)){
    
  
    FlightLink.next = FirstFlightLink; 
   
    FirstFlightLink = FlightLink;
     writer.println();
     
     writer.append(FlightLink.flightNo+"      ,"+FlightLink.source+"      ,"+FlightLink.destination+"      ,"+FlightLink.Airline+"       "+FlightLink.HaltStation+"      ,"+FlightLink.arrivalHour+":"+FlightLink.arrivalMinutes+"       ,"+FlightLink.departurehour+":"+FlightLink.departureMinute+"          ,"+FlightLink.halthour+":"+FlightLink.haltMinute+"       ,"+durationField.getText());
 writer.close();
}
}
 if(FlightLink.source.equalsIgnoreCase("Lahore")|| FlightLink.destination.equalsIgnoreCase("Lahore"))
{
try (FileWriter fw = new FileWriter("Lahore.txt",true);
      
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter writer = new PrintWriter(bw)){
    
  
    FlightLink.next = FirstFlightLink; 
   
    FirstFlightLink = FlightLink;
     writer.println();
     
     writer.append(FlightLink.flightNo+"      ,"+FlightLink.source+"      ,"+FlightLink.destination+"      ,"+FlightLink.Airline+"       "+FlightLink.HaltStation+"      ,"+FlightLink.arrivalHour+":"+FlightLink.arrivalMinutes+"       ,"+FlightLink.departurehour+":"+FlightLink.departureMinute+"          ,"+FlightLink.halthour+":"+FlightLink.haltMinute+"       ,"+durationField.getText());
 writer.close();
}
}
try (FileWriter fw = new FileWriter("FlightDetail",true);
      
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter writer = new PrintWriter(bw)){
    
  
    FlightLink.next = FirstFlightLink; 
   
    FirstFlightLink = FlightLink;
     writer.println();
     
     writer.append(FlightLink.flightNo+"      ,"+FlightLink.source+"      ,"+FlightLink.destination+"      ,"+FlightLink.Airline+"       "+FlightLink.HaltStation+"      ,"+FlightLink.arrivalHour+":"+FlightLink.arrivalMinutes+"       ,"+FlightLink.departurehour+":"+FlightLink.departureMinute+"          ,"+FlightLink.halthour+":"+FlightLink.haltMinute+"       ,"+durationField.getText());
 writer.close();
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Status");
                        alert.setHeaderText("Add Flight Detail Status");
                        alert.setContentText("Successfully");
                        alert.showAndWait();
                         ((Node)event.getSource()).getScene().getWindow().hide();
                        
    
      Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/AdminForm.fxml"));
        
                Scene scene = new Scene(root);
        Stage stage = new Stage();
     stage.setScene(scene);
      stage.show();

    }
    }
        
       
    }
   
       @FXML
    void refreshButtonAction(ActionEvent event) {
        exceptionflag=false;
         FlightNoException.setVisible(false);
         SourceException.setVisible(false);
       DestinationException.setVisible(false);
         ArrivalException.setVisible(false);
         DepartureException.setVisible(false);
         HaltException.setVisible(false);
         AirlineException.setVisible(false);
    
     HaltTimeException.setVisible(false);
     
     flightNoField.clear();

     arrivalHoursField.clear();
    arrivalMinutesField.clear();
   destinationField.clear();
airlineField.clear();

    departureHourField.clear();
 departureMinutesField.clear();
  SourceField.clear();

   haltStationField.clear();
    haltHourField.clear();
 haltMinutesField.clear();
   durationField.clear();

   
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
