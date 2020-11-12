package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class DBController{
	
	@FXML
    private Button btnSymptomsTracker;
	@FXML
    private Button btnNews;
	@FXML
    private Button btnSymptomsCalendar;
	@FXML
	public TableView<DataEntry> symptomsTracker;
	public TableColumn<DataEntry, String> colDate;
	public TableColumn <DataEntry, String>colStatus;
	public TableColumn <DataEntry, String>colSymptoms;
	
	public void initialize(URL url, ResourceBundle resources) {
    	colDate.setCellValueFactory(new PropertyValueFactory<>("Date"));
    	colStatus.setCellValueFactory(new PropertyValueFactory<>("Status"));
    	colSymptoms.setCellValueFactory(new PropertyValueFactory<>("Symptoms"));
    	symptomsTracker.setItems(observableList);
    }
    
    ObservableList<DataEntry> observableList = FXCollections.observableArrayList(
    		new DataEntry("11/12/20", "Satisfactory", "None")
    );
	
    public void changeNewsUI(ActionEvent event) {
		 try {
				Parent root = FXMLLoader.load(getClass().getResource("newsUI.fxml"));
				Scene newsUI = new Scene(root);
				newsUI.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
				window.setScene(newsUI);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	}
    
    public void changeSymptomsCalendarUI(ActionEvent event) {
		 try {
				Parent root = FXMLLoader.load(getClass().getResource("SymptomsCalendarUI.fxml"));
				Scene symptomsCalendar = new Scene(root);
				symptomsCalendar.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
				window.setScene(symptomsCalendar);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
    
    public void changeSymptomsTrackerUI(ActionEvent event) {
		 try {
				Parent root = FXMLLoader.load(getClass().getResource("DashboardUI.fxml"));
				Scene symptomsTracker = new Scene(root);
				symptomsTracker.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
				window.setScene(symptomsTracker);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
    
}
