/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightschedulingsystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 *
 * @author Rabbiya Shaikh
 */
public class HomePageController implements Initializable {
    
 


    @FXML
    private Label label;

    @FXML
    private JFXButton HomeButton;

    @FXML
    private JFXButton ArrivalButton;

    @FXML
    private JFXButton DepartureButton;

    @FXML
    private JFXButton LoginButton;

    @FXML
     JFXButton AdminButton;

    @FXML
    private JFXButton SupervisorButton;
    @FXML
    private AnchorPane HomePage;
    
    

    public static AnchorPane childR;
    private Stage PrimaryStage;
  
 

    @FXML
    void AdminButtonAction(ActionEvent event) throws IOException {
     

      
     Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/AdminLogin.fxml"));

       Scene scene = new Scene(root);
        Stage stage = new Stage();
     stage.setScene(scene);

      stage.show();
    
    }
       // Parent root1=FXMLLoader.load(getClass().getResource("/flightschedulingSystem/HomePage.fxml"));
       //  Stage stage1=(Stage) root1.getScene().getWindow();
      //  stage1.close();
    
     
  





        
    @FXML
    void ArrivalButtonAction(ActionEvent event) {

    }

    @FXML
    void DepartureButtonAction(ActionEvent event) {

    }

    @FXML
    void HomeButtonAction(ActionEvent event) throws IOException {  
        
     Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/HomePage.fxml"));
        
                Scene scene = new Scene(root);
        Stage stage = new Stage();
     stage.setScene(scene);
      stage.show();
    }
      
      
    


    


    
    
    
    @FXML
    void LoginButtonAction(ActionEvent event) {

    }

    @FXML
    void SupervisorButtonAction(ActionEvent event) throws IOException {
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

    private void initSessionID(HomePageController aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
