/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightschedulingsystem;

import javafx.scene.*;
import com.jfoenix.controls.JFXButton;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javafx.stage.Stage;



    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class SupervisorFormController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
  @FXML
    private Label FlightDetails;

    @FXML
    private JFXButton FlightDelayTimings;

    @FXML
    private JFXButton FlightTimings;

    @FXML
    private JFXButton Logout;
  
    @FXML
    void FlightDelayTimings(ActionEvent event) throws IOException { 
          ((Node)event.getSource()).getScene().getWindow().hide();
       
        Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/FlightDelayTimings.fxml"));
        
        
                Scene scene = new Scene(root);
        Stage stage = new Stage();
     stage.setScene(scene);
      stage.show();

    }

    @FXML
    void LogoutButtonAction(ActionEvent event) throws IOException {
            ((Node)event.getSource()).getScene().getWindow().hide();
       
      Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/HomePage.fxml"));
        
        
                Scene scene = new Scene(root);
        Stage stage = new Stage();
     stage.setScene(scene);
      stage.show();

     
    
    

    }
    

    @FXML
    void FlightTimings(ActionEvent event) throws IOException { 
         ((Node)event.getSource()).getScene().getWindow().hide();
          
        Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/FlightTimings.fxml"));
        
        
                Scene scene = new Scene(root);
        Stage stage = new Stage();
     stage.setScene(scene);
      stage.show();


    }
     @FXML
    void BackButtonAction(ActionEvent event) throws IOException {
         ((Node)event.getSource()).getScene().getWindow().hide();
       
    
      Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/SupervisorLogin.fxml"));
        
                Scene scene = new Scene(root);
        Stage stage = new Stage();
     stage.setScene(scene);
      stage.show();
    }





    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
                     
    private void initSessionID(AdminFormController aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   

}
