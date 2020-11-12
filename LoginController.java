package application;

import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
//import utils.ConnectionUtil;


public class LoginController {
	@FXML
    private Label lblErrors;

    @FXML
    private TextField txtUsername;

    @FXML
    private TextField txtPassword;

    @FXML
    private Button btnSignin;
 
 
    public void handleButtonAction(ActionEvent event) {
    	try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/DashboardUI.fxml"));
			Scene DashboardUI = new Scene(root);
			DashboardUI.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(DashboardUI);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
}