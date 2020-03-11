/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightschedulingsystem;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.awt.Button;
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


public class SupervisorLoginController implements Initializable {  @FXML
    private JFXTextField Username;

    @FXML
    private JFXPasswordField Password;

    @FXML
    private JFXButton Login;

     @FXML
    private AnchorPane login;
     
    @FXML
    void loginButtonAction(ActionEvent event) throws IOException {
        
//            FileReader fr = null;
//            try {
//                fr = new FileReader("SupervisorLogin.txt");
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(SupervisorLoginController.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            BufferedReader br = new BufferedReader(fr);
//            
//            
//            
//            String temp = null;
//            String[][] splitStr=new String[1][1];
//                    splitStr[0]= br.readLine().split(",");
//                    
//           
//            
//                if (splitStr[0][0].equals(Username.getText()) && splitStr[0][1].equals(Password.getText())) {
                    
            
//            String[] arr ={"Karachi","Lahore","Islamabad","Chicago","Dubai"}; 
//             for (int i = 0; i < 4; i++)
//             {
              
//              if(arr[i] == Username)
                 
                String username = null;
            switch(username){
                     
            case "Karachi":
                
                      FileReader fr = null;
            try {
                fr = new FileReader("Karachi.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br = new BufferedReader(fr);
            String temp = null;
            String[][] splitStr=new String[1][1];
                    splitStr[0]= br.readLine().split(","); 
            
             if (splitStr[0][0].equals(Username.getText()) && splitStr[0][1].equals(Password.getText())) {        
                     Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Status");
            alert.setHeaderText("Successfully Login");
         
            alert.showAndWait();  
           ((Node)event.getSource()).getScene().getWindow().hide();
       
       Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/SupervisorForm.fxml"));
        
        
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
        
              Username.clear();
              Password.clear();        
                }     
              break;
                     
                     
                     
                     
            case "Lahore":
                 FileReader fr1 = null;
            try {
                fr = new FileReader("Lahore.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br1 = new BufferedReader(fr1);
            String temp1 = null;
            String[][] splitStr1=new String[1][1];
                    splitStr1[0]= br1.readLine().split(","); 
            
             if (splitStr1[0][0].equals(Username.getText()) && splitStr1[0][1].equals(Password.getText())) {        
                     Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Status");
            alert.setHeaderText("Successfully Login");
         
            alert.showAndWait();  
           ((Node)event.getSource()).getScene().getWindow().hide();
       
       Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/SupervisorForm.fxml"));
        
        
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
        
              Username.clear();
              Password.clear();        
                }
                     break;
                     
                     
       case "Islamabad":
                 FileReader fr2 = null;
            try {
                fr = new FileReader("Islamabad.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br2 = new BufferedReader(fr2);
            String temp2 = null;
            String[][] splitStr2=new String[1][1];
                    splitStr2[0]= br2.readLine().split(","); 
            
             if (splitStr2[0][0].equals(Username.getText()) && splitStr2[0][1].equals(Password.getText())) {        
                     Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Status");
            alert.setHeaderText("Successfully Login");
         
            alert.showAndWait();  
           ((Node)event.getSource()).getScene().getWindow().hide();
       
       Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/SupervisorForm.fxml"));
        
        
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
        
              Username.clear();
              Password.clear();        
                }
                     break;
                                   
                     
                     
                     
            case "Dubai":
                 FileReader fr3 = null;
            try {
                fr = new FileReader("Dubai.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br3 = new BufferedReader(fr3);
            String temp3 = null;
            String[][] splitStr3=new String[1][1];
                    splitStr3[0]= br3.readLine().split(","); 
            
             if (splitStr3[0][0].equals(Username.getText()) && splitStr3[0][1].equals(Password.getText())) {        
                     Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Status");
            alert.setHeaderText("Successfully Login");
         
            alert.showAndWait();  
           ((Node)event.getSource()).getScene().getWindow().hide();
       
       Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/SupervisorForm.fxml"));
        
        
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
        
              Username.clear();
              Password.clear();        
                }
                     break;
                     
                     
                     
             case "Chicago":
                 FileReader fr4 = null;
            try {
                fr4 = new FileReader("Chicago.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br4 = new BufferedReader(fr4);
            String temp4 = null;
            String[][] splitStr4=new String[1][1];
                    splitStr4[0]= br4.readLine().split(","); 
            
              if (splitStr4[0][0].equals(Username.getText()) && splitStr4[0][1].equals(Password.getText())) {         
                     Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Status");
            alert.setHeaderText("Successfully Login");
         
            alert.showAndWait();  
           ((Node)event.getSource()).getScene().getWindow().hide();
       
       Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/SupervisorForm.fxml"));
        
        
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
        
              Username.clear();
              Password.clear();        
                }
                     break;

                    
                 }
                     
            
                  
             }
           
                    
 
            
                            
          
                    
                   
//                 Alert alert = new Alert(Alert.AlertType.INFORMATION);
//            alert.setTitle("Status");
//            alert.setHeaderText("Successfully Login");
//         
//            alert.showAndWait();  
//           ((Node)event.getSource()).getScene().getWindow().hide();
//       
//       Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/SupervisorForm.fxml"));
//        
//        
//                Scene scene = new Scene(root);
//        Stage stage = new Stage();
//     stage.setScene(scene);
//      stage.show();
//      
//       
//                }
//                else
//                { Alert alert = new Alert(Alert.AlertType.INFORMATION);
//            alert.setTitle("Status");
//            alert.setHeaderText("Incorrect Login");
//            alert.setContentText("Try Again");
//            alert.showAndWait();
//        
//              Username.clear();
//              Password.clear();

    
            

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        
//    }  
    




}
