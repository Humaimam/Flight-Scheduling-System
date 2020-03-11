/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightschedulingsystem;

import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.cell.TextFieldTreeTableCell;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Rabbiya Shaikh
 */
public class ViewFlightDetailController implements Initializable {

    /**
     * Initializes the controller class.
     */
//      @FXML
//    private TableColumn<table,Integer> C1;
// 
//      @FXML
//    private TableView<table> TableView;
//   
//      @FXML
//    private TableColumn<table, String> C2;
//
//    @FXML
//    private TableColumn<table, String> C3;
//
//    @FXML
//    private TableColumn<table, String> C4;
//
//    @FXML
//    private TableColumn<table, String> C5;
//
//    @FXML
//    private TableColumn<table,Integer > C6;
//
//    @FXML
//    private TableColumn<table,Integer > C7;
//
//    @FXML
//    private TableColumn<table,Integer> C8;
//
//    @FXML
//    private TableColumn<table,Integer> C9;
    @FXML
    private JFXTreeTableView<table> treeView;
    ObservableList<table> list = FXCollections.observableArrayList();
    String flightNo;
    String source;
    String destination;
    String HaltStation;
    String Airline;
    String arrivalTime;
    String departureTime;
    String haltTime;
    String totalDuration;
    String currentLine;

//    @FXML
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
//    public void display() throws IOException {
//        FileReader fr = null;
//        try {
//            fr = new FileReader("FlightDetail.txt");
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ViewFlightDetailController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        BufferedReader br = new BufferedReader(fr);
//
//        String temp = null;
//        String[][] splitStr = new String[100][9];
//        int j = 0;
//
//        while ((currentLine = br.readLine()) != null) {
//            splitStr[j] = br.readLine().split(",");
//        }
//
//        {
//            flightNo = Integer.parseInt(splitStr[j][0]);
//            source = splitStr[j][1];
//            destination = splitStr[j][2];
//
//            Airline = splitStr[j][3];
//            HaltStation = splitStr[j][4];
//            arrivalTime = Integer.parseInt(splitStr[j][5]);
//            departureTime = Integer.parseInt(splitStr[j][6]);
//            haltTime = Integer.parseInt(splitStr[j][7]);
//            totalDuration = Integer.parseInt(splitStr[j][8]);
//
//            TableView<table> Table = new TableView<table>();
//
//            ObservableList<table> list = FXCollections.observableArrayList(new table(flightNo, source, destination, Airline, HaltStation, arrivalTime, departureTime, haltTime, totalDuration));
//            TableColumn C1 = new TableColumn("flightNo");
//            C1.setCellValueFactory(new PropertyValueFactory<>("flight No"));
//            TableColumn C2 = new TableColumn("source");
//            C2.setCellValueFactory(new PropertyValueFactory<>("source"));
//            TableColumn C3 = new TableColumn("destination");
//            C3.setCellValueFactory(new PropertyValueFactory<>("destination"));
//            TableColumn C4 = new TableColumn("Airline");
//            C4.setCellValueFactory(new PropertyValueFactory<>("Airline"));
//            TableColumn C5 = new TableColumn("HaltStation");
//            C5.setCellValueFactory(new PropertyValueFactory<>("HaltStation"));
//            TableColumn C6 = new TableColumn("arrivalTime");
//            C6.setCellValueFactory(new PropertyValueFactory<>("arrivalTime"));
//            TableColumn C7 = new TableColumn("departureTime");
//            C7.setCellValueFactory(new PropertyValueFactory<>("departureTime"));
//            TableColumn C8 = new TableColumn("haltTime");
//            C8.setCellValueFactory(new PropertyValueFactory<>("haltTime"));
//            TableColumn C9 = new TableColumn("totalDuration");
//            C9.setCellValueFactory(new PropertyValueFactory<>("totalDuration"));
//
//            // TableView.setItems(list);
//        }
//        j++;
//    }
    public void display() {
        try {
            FileReader fr = new FileReader("FlightDetail.txt");
            Scanner sc = new Scanner(fr);
            String[] linearr;
            while (sc.hasNext()) {
                linearr = sc.nextLine().split(",");
                flightNo = linearr[0];
                source = linearr[1];
                destination = linearr[2];
                Airline = linearr[3];
                HaltStation = linearr[4];
                arrivalTime = linearr[5];
                departureTime = linearr[6];
                haltTime = linearr[7];
                totalDuration = linearr[8];
                list.add(new table(flightNo, source, destination, Airline, HaltStation, arrivalTime, departureTime, haltTime, totalDuration));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewFlightDetailController.class.getName()).log(Level.SEVERE, null, ex);
        }
 

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        JFXTreeTableColumn<table, String> CflightNo = new JFXTreeTableColumn<>("flightNo");
        CflightNo.setPrefWidth(110);
        CflightNo.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<table, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<table, String> param) {
                return param.getValue().getValue().flightNo;
            }
        });
        CflightNo.setSortable(true);
        JFXTreeTableColumn<table, String> Csource = new JFXTreeTableColumn<>("source");
        Csource.setPrefWidth(110);
        Csource.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<table, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<table, String> param) {
                return param.getValue().getValue().source;
            }
        });
        JFXTreeTableColumn<table, String> Cdestination = new JFXTreeTableColumn<>("destination");
        Cdestination.setPrefWidth(110);
        Cdestination.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<table, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<table, String> param) {
                return param.getValue().getValue().destination;
            }
        });
        JFXTreeTableColumn<table, String> CAirline = new JFXTreeTableColumn<>("Airline");
        CAirline.setPrefWidth(110);
        CAirline.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<table, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<table, String> param) {
                return param.getValue().getValue().Airline;
            }
        });
        JFXTreeTableColumn<table, String> CHaltStation = new JFXTreeTableColumn<>("HaltStation");
        CHaltStation.setPrefWidth(110);
        CHaltStation.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<table, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<table, String> param) {
                return param.getValue().getValue().HaltStation;
            }
        });
        JFXTreeTableColumn<table, String> CarrivalTime = new JFXTreeTableColumn<>("arrivalTime");
        CarrivalTime.setPrefWidth(110);
        CarrivalTime.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<table, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<table, String> param) {
                return param.getValue().getValue().arrivalTime;
            }
        });
        JFXTreeTableColumn<table, String> CdepartureTime = new JFXTreeTableColumn<>("departureTime");
        CdepartureTime.setPrefWidth(110);
        CdepartureTime.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<table, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<table, String> param) {
                return param.getValue().getValue().departureTime;
            }
        });
        JFXTreeTableColumn<table, String> ChaltTime = new JFXTreeTableColumn<>("haltTime");
        ChaltTime.setPrefWidth(110);
        ChaltTime.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<table, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<table, String> param) {
                return param.getValue().getValue().haltTime;
            }
        });
        JFXTreeTableColumn<table, String> CtotalDuration = new JFXTreeTableColumn<>("totalDuration");
        CtotalDuration.setPrefWidth(110);
        CtotalDuration.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<table, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<table, String> param) {
                return param.getValue().getValue().totalDuration;
            }
        });

//        list.add(new table("Bin", "123", "25 Items", "", "", "", "", "", ""));
//        list.add(new table("bashir", "123", "100 Items", "", "", "", "", "", ""));
//        list.add(new table("qasim", "234", "45 Items", "", "", "", "", "", ""));
        ViewFlightDetailController.this.display();
//        list.add(new table(flightNo, source, destination, Airline, HaltStation, arrivalTime, departureTime, haltTime, totalDuration));
        
        final TreeItem<table> root = new RecursiveTreeItem<table>(list, RecursiveTreeObject::getChildren);
        treeView.getColumns().setAll(CflightNo, Csource, Cdestination, CAirline, CHaltStation, CarrivalTime, CdepartureTime, ChaltTime, CtotalDuration);
        treeView.setRoot(root);
        treeView.setShowRoot(false);
        treeView.setEditable(true);

        CflightNo.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
        Csource.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
        Cdestination.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());

//        JFXTreeTableColumn<table, String> deptName = new JFXTreeTableColumn<>("Department");
//        deptName.setPrefWidth(150);
//        deptName.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<table, String>, ObservableValue<String>>() {
//            @Override
//            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<table, String> param) {
//                return param.getValue().getValue().flightNo;
//            }
//        });
//
//        JFXTreeTableColumn<table, String> ageCol = new JFXTreeTableColumn<>("Age");
//        ageCol.setPrefWidth(150);
//        ageCol.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<table, String>, ObservableValue<String>>() {
//            @Override
//            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<table, String> param) {
//                return param.getValue().getValue().source;
//            }
//        });
//
//        JFXTreeTableColumn<table, String> nameCol = new JFXTreeTableColumn<>("Name");
//        nameCol.setPrefWidth(150);
//        nameCol.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<table, String>, ObservableValue<String>>() {
//            @Override
//            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<table, String> param) {
//                return param.getValue().getValue().destination;
//            }
//        });
//
//        ObservableList<table> users = FXCollections.observableArrayList();
//        users.add(new table("Computer Department", "23", "CD 1"));
//        users.add(new table("Sales Department", "22", "Employee 1"));
//        users.add(new table("Sales Department", "22", "Employee 2"));
//        users.add(new table("Sales Department", "25", "Employee 4"));
//        users.add(new table("Sales Department", "25", "Employee 5"));
//        users.add(new table("IT Department", "42", "ID 2"));
//        users.add(new table("HR Department", "22", "HR 1"));
//        users.add(new table("HR Department", "22", "HR 2"));
//
//        final TreeItem<table> root = new RecursiveTreeItem<table>(users, RecursiveTreeObject::getChildren);
//        treeView.getColumns().setAll(deptName, ageCol, nameCol);
//        treeView.setRoot(root);
//        treeView.setShowRoot(false);
    }

    @FXML
    private void filter(ActionEvent event) {
    }

    class table extends RecursiveTreeObject<table> {

        StringProperty flightNo;
        StringProperty source;
        StringProperty destination;
        StringProperty Airline;
        StringProperty HaltStation;
        StringProperty arrivalTime;
        StringProperty departureTime;
        StringProperty haltTime;
        StringProperty totalDuration;

        public table(String flightNo, String source, String destination, String Airline, String HaltStation, String arrivalTime, String departureTime, String haltTime, String totalDuration) {
            this.flightNo = new SimpleStringProperty(flightNo);
            this.source = new SimpleStringProperty(source);
            this.destination = new SimpleStringProperty(destination);
            this.Airline = new SimpleStringProperty(Airline);
            this.HaltStation = new SimpleStringProperty(HaltStation);

            this.arrivalTime = new SimpleStringProperty(arrivalTime);
            this.departureTime = new SimpleStringProperty(departureTime);
            this.haltTime = new SimpleStringProperty(haltTime);
            this.totalDuration = new SimpleStringProperty(totalDuration);
        }

//        public table(String flightNo, String source, String destination) {
//            this.flightNo = new SimpleStringProperty(flightNo);
//            this.source = new SimpleStringProperty(source);
//            this.destination = new SimpleStringProperty(destination);
//        }
        public void setFlightNo(String flightNo) {
            this.flightNo = new SimpleStringProperty(flightNo);;
        }

        public void setSource(String source) {
            this.source = new SimpleStringProperty(source);
        }

        public void setDestination(String destination) {
            this.destination = new SimpleStringProperty(destination);
        }

        public void setAirline(String Airline) {
            this.Airline = new SimpleStringProperty(Airline);
        }

        public void setHaltStation(String HaltStation) {
            this.HaltStation = new SimpleStringProperty(HaltStation);
        }

        public void setArrivalTime(String arrivalTime) {
            this.arrivalTime = new SimpleStringProperty(arrivalTime);
        }

        public void setDepartureTime(String departureTime) {
            this.departureTime = new SimpleStringProperty(departureTime);
        }

        public void setHaltTime(String haltTime) {
            this.haltTime = new SimpleStringProperty(haltTime);
        }

        public void setTotalDuration(String totalDuration) {
            this.totalDuration = new SimpleStringProperty(totalDuration);
        }

        public String getFlightNo() {
            return flightNo.get();
        }

        public String getSource() {
            return source.get();
        }

        public String getDestination() {
            return destination.get();
        }

        public String getHaltStation() {
            return HaltStation.get();
        }

        public String getAirline() {
            return Airline.get();
        }

        public String getarrivalTime() {

            return arrivalTime.get();
        }

        public String getDepartureTime() {
            return departureTime.get();
        }

        public String getHaltTime() {
            return haltTime.get();
        }

        public String getTotalDuration() {
            return totalDuration.get();
        }

    }

}
