/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightschedulingsystem;

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
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javafx.scene.Node;
/**
 * FXML Controller class
 *

 */
public class AdminLoginController implements Initializable {  @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private JFXButton LoginButton;

     @FXML
    private AnchorPane login;
     
    @FXML
    void loginButtonAction(ActionEvent event) throws IOException {
        
       
        
       

            FileReader fr = null;
            try {
                fr = new FileReader("AdminLogin.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br = new BufferedReader(fr);
            String temp = null;
            String[][] splitStr=new String[1][1];
                    splitStr[0]= br.readLine().split(",");
                    
           
            
                if (splitStr[0][0].equals(usernameField.getText()) && splitStr[0][1].equals(passwordField.getText())) {
                    
                
               
                   
                 Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Status");
            alert.setHeaderText("Successfully Login");
         
            alert.showAndWait();  
           ((Node)event.getSource()).getScene().getWindow().hide();
       
       Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/AdminForm.fxml"));
        
        
                Scene scene = new Scene(root);
        Stage stage = new Stage();
     stage.setScene(scene);
      stage.show();
      
       
                }
                else
                { Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Status");
            alert.setHeaderText("Incorrect Login");
            alert.setContentText("Try Again");
            alert.showAndWait();
        
              usernameField.clear();
              passwordField.clear();
            }
    }
                  
     @FXML
    void BackButtonAction(ActionEvent event) throws IOException {
        
        ((Node)event.getSource()).getScene().getWindow().hide();
    
      Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/HomePage.fxml"));
        
                Scene scene = new Scene(root);
        Stage stage = new Stage();
     stage.setScene(scene);
      stage.show();
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    }

