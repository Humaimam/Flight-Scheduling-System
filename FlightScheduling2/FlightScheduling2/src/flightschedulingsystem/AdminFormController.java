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
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Rabbiya Shaikh
 */
public class AdminFormController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Label label;

    @FXML
    private JFXButton FlightDetailButton;

    @FXML
    private JFXButton ViewFlightDetailButton;

    @FXML
    private JFXButton LogoutButton;

    @FXML
    private TabPane tabPane;

    Tab FDtab = new Tab();
    AnchorPane FlightDetails = new AnchorPane();
    Tab VFDtab = new Tab();
    AnchorPane ViewFlightDetails = new AnchorPane();

    @FXML
    void FlightDetailButtonAction(ActionEvent event) throws IOException {

        if (!tabPane.getTabs().contains(FDtab)) {
            tabPane.getTabs().add(FDtab);
            tabPane.getSelectionModel().select(FDtab);
        } else {
            tabPane.getSelectionModel().select(FDtab);
        }
        FDtab.setText("Flight Details");
        FDtab.setContent(FlightDetails);
//        ((Node) event.getSource()).getScene().getWindow().hide();
//
//        Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/FlightDetail.fxml"));
//
//        Scene scene = new Scene(root);
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.show();

    }

    @FXML
    void LogoutButtonAction(ActionEvent event) throws IOException {
        ((Node) event.getSource()).getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/HomePage.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void ViewFlightDetailButtonAction(ActionEvent event) throws IOException {

        if (!tabPane.getTabs().contains(VFDtab)) {
            tabPane.getTabs().add(VFDtab);
            tabPane.getSelectionModel().select(VFDtab);
        } else {
            tabPane.getSelectionModel().select(VFDtab);
        }
        VFDtab.setText("View Flight Details");
        VFDtab.setContent(ViewFlightDetails);

//        ((Node) event.getSource()).getScene().getWindow().hide();
//
//        Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/ViewFlightDetail.fxml"));
//
//        Scene scene = new Scene(root);
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.show();
    }

    @FXML
    void BackButtonAction(ActionEvent event) throws IOException {
        ((Node) event.getSource()).getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/AdminLogin.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            FlightDetails = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/FlightDetail.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(AdminFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
                try {
            ViewFlightDetails = FXMLLoader.load(getClass().getResource("/flightschedulingsystem/ViewFlightDetail.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(AdminFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initSessionID(AdminFormController aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
