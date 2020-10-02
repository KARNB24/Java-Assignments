/*
 * Karn Bhavsar
 * Student ID: 991578281
 * PROG24178 - Object Oriented Programming 2 - JAVA
 */
package assignment4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author karnb
 */
public class FXMLassignment4Controller implements Initializable {

    int x = 0;
    
    @FXML
    private TextField txtstart;
    
    @FXML
    private TextField txtend;
    
    @FXML
    private TextArea tarea;
    
    @FXML
    private Button btndisplay;
    
    @FXML
    private Button btnclear;
    
    @FXML
    private Button btnexit;
    
    @FXML
    private void display(ActionEvent event)
    {
                double start = Double.parseDouble(txtstart.getText());
                double end = Double.parseDouble(txtend.getText());
                
                tarea.appendText("Celsius\t\tFahrenheit\n");
                tarea.appendText("-----------------------------\n");
                for(;start<=end;start++)
                {
                    double f = (9.0/5.0) * (start) + 32.0;
                    String temp = start + "\t\t\t" + f + "\n";
                    tarea.appendText(temp);
                }
    }
    
    @FXML
    private void clear(ActionEvent event)
    {
        txtstart.clear();
        txtend.clear();
        tarea.clear();
    }
    
    @FXML
    private void exit(ActionEvent event)
    {
                Alert a = new Alert(Alert.AlertType.CONFIRMATION);
                a.setTitle("Exit");
                a.setHeaderText("Confirmation");
                a.setContentText("Press OK if you want to exit the program");
                a.showAndWait().ifPresent(response -> {
                    if(response == ButtonType.OK)
                    {
                        System.exit(0);
                    }
                });
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
