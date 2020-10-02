/*
 * Karn Bhavsar
 * Student ID: 991578281
 * PROG24178 - Object Oriented Programming 2 - JAVA
 */
package assignment5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author karnb
 */
public class FXMLassignment5Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TextField txtusb;
    
    @FXML
    private TextField txtmouse;
    
    @FXML
    private TextField txtcharger;
    
    @FXML
    private TextField txtdiscount;
    
    @FXML
    private Button btntotal;
    
    @FXML
    private Button btnreset;
    
    @FXML
    private Button btnexit;
    
    @FXML
    private TextArea tarea;
    
    @FXML
    private CheckBox chkusb;
    
    @FXML
    private CheckBox chkmouse;
    
    @FXML
    private CheckBox chkcharger;
    
    
    @FXML
    private void chkusb(ActionEvent event)
    {
        
        if(chkusb.isSelected() == true)
        {
            txtusb.setDisable(false);
        }
        else
        {
            txtusb.setDisable(true);
        }
                
                
    }
    
    @FXML
    private void chkmouse(ActionEvent event)
    {
        if(chkmouse.isSelected() == true)
        {
            txtmouse.setDisable(false);
        }
        else
        {
            txtmouse.setDisable(true);
        }
                
                
    }
    
    @FXML
    private void chkcharger(ActionEvent event)
    {
        if(chkcharger.isSelected() == true)
        {
            txtcharger.setDisable(false);
        }
        else
        {
            txtcharger.setDisable(true);
        }
                
                
    }
    
    @FXML
    private void total(ActionEvent event)
    {
        if(chkmouse.isSelected() == true && chkusb.isSelected() == true && chkcharger.isSelected() == true)
        {
            double m = Double.parseDouble(txtmouse.getText());
            double mtot = m * 10;
            double u = Double.parseDouble(txtusb.getText());
            double utot = u * 20;
            double c = Double.parseDouble(txtcharger.getText());
            double ctot = c * 15;
            double d = Double.parseDouble(txtdiscount.getText());
            double total = (mtot + utot + ctot) - (d);
            
            tarea.appendText("Mouse = $"+mtot+"\n");
            tarea.appendText("USB = $"+utot+"\n");
            tarea.appendText("Charger = $"+ctot+"\n");
            tarea.appendText("Discount = $"+d+"\n");
            tarea.appendText("---------------\n");
            tarea.appendText("Total = $"+total);          
            
            
        }
        else if(chkusb.isSelected() == true && chkcharger.isSelected() == true)
        {
            double u = Double.parseDouble(txtusb.getText());
            double utot = u * 20;
            double c = Double.parseDouble(txtcharger.getText());
            double ctot = c * 15;
            double d = Double.parseDouble(txtdiscount.getText());
            double total = (utot + ctot) - (d);
            
            tarea.appendText("USB = $"+utot+"\n");
            tarea.appendText("Charger = $"+ctot+"\n");
            tarea.appendText("Discount = $"+d+"\n");
            tarea.appendText("---------------\n");
            tarea.appendText("Total = $"+total);
            
            
        }
        else if(chkmouse.isSelected() == true && chkcharger.isSelected() == true)
        {
            double m = Double.parseDouble(txtmouse.getText());
            double mtot = m * 10;
            double c = Double.parseDouble(txtcharger.getText());
            double ctot = c * 15;
            double d = Double.parseDouble(txtdiscount.getText());
            double total = (mtot + ctot) - (d);
            
            tarea.appendText("Mouse = $"+mtot+"\n");
            tarea.appendText("Charger = $"+ctot+"\n");
            tarea.appendText("Discount = $"+d+"\n");
            tarea.appendText("---------------\n");
            tarea.appendText("Total = $"+total);
            
            
        }
        else if(chkmouse.isSelected() == true && chkusb.isSelected() == true)
        {
            double m = Double.parseDouble(txtmouse.getText());
            double mtot = m * 10;
            double u = Double.parseDouble(txtusb.getText());
            double utot = u * 20;
            double d = Double.parseDouble(txtdiscount.getText());
            double total = (mtot + utot) - (d);
            
            tarea.appendText("Mouse = $"+mtot+"\n");
            tarea.appendText("USB = $"+utot+"\n");
            tarea.appendText("Discount = $"+d+"\n");
            tarea.appendText("---------------\n");
            tarea.appendText("Total = $"+total);
            
        }
        else if(chkmouse.isSelected() == true)
        {
            double m = Double.parseDouble(txtmouse.getText());
            double mtot = m * 10;
            double d = Double.parseDouble(txtdiscount.getText());
            double total = mtot - d;
            
            tarea.appendText("Mouse = $"+mtot+"\n");
            tarea.appendText("Discount = $"+d+"\n");
            tarea.appendText("---------------\n");
            tarea.appendText("Total = $"+total);
        }
        else if(chkusb.isSelected() == true)
        {
            double u = Double.parseDouble(txtusb.getText());
            double utot = u * 20;
            double d = Double.parseDouble(txtdiscount.getText());
            double total = utot - d;
            
            tarea.appendText("USB = $"+utot+"\n");
            tarea.appendText("Discount = $"+d+"\n");
            tarea.appendText("---------------\n");
            tarea.appendText("Total = $"+total);
            
        }
        else if(chkcharger.isSelected() == true)
        {
            double c = Double.parseDouble(txtcharger.getText());
            double ctot = c * 15;
            double d = Double.parseDouble(txtdiscount.getText());
            double total = ctot - d;
            
            tarea.appendText("Charger = $"+ctot+"\n");
            tarea.appendText("Discount = $"+d+"\n");
            tarea.appendText("---------------\n");
            tarea.appendText("Total = $"+total);
        }
        else
        {
            tarea.appendText("Please select one of the items");
        }

        
        
    }
    
    @FXML
    private void reset(ActionEvent event)
    {
        txtusb.setDisable(true);
        txtmouse.setDisable(true);
        txtcharger.setDisable(true);
        txtusb.clear();
        txtmouse.clear();
        txtcharger.clear();
        tarea.clear();
        txtdiscount.clear();
        chkusb.setSelected(false);
        chkmouse.setSelected(false);
        chkcharger.setSelected(false);
        
    }
    
    @FXML
    private void exit(ActionEvent event)
    {
                Alert a = new Alert(Alert.AlertType.CONFIRMATION);
                a.setTitle("Exit Confiramation!!!");
                a.setHeaderText("Confirmation");
                a.setContentText("Press OK if you want to exit");
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
        txtusb.setDisable(true);
        txtmouse.setDisable(true);
        txtcharger.setDisable(true);
    }    
    
}
