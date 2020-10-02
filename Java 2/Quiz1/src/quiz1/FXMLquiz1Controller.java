/*
 * Karn Bhavsar
 * Student ID: 991578281
 * PROG24178 - Object Oriented Programming 2 - JAVA
*/

package quiz1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author karnb
 */
public class FXMLquiz1Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML  Button btnwrite;
    @FXML  Button btnread;
    @FXML  TextField txtbname;
    @FXML  TextField txtuprice;
    @FXML  TextField txtdesc;
    @FXML  TextField txtncopies;
    @FXML  TextArea tarea;
    File file =new File("quiz1.txt"); 
    
    @FXML
    private void write(ActionEvent e)
    {
        try
        {
            FileWriter fw=new FileWriter(file,true); //append mode
            PrintWriter output = new PrintWriter(fw);
            String bname = txtbname.getText();
            String desc =txtdesc.getText();
            double uprice = Double.parseDouble(txtuprice.getText());
            int ncopies = Integer.parseInt(txtncopies.getText()); 
            output.println(bname+","+desc+","+uprice+","+ncopies);
            output.close();
            System.out.println("File created");
        }
        catch(IOException error)        
        {
            System.out.println("error in file write");
        }   
    }
    
    @FXML
    private void read(ActionEvent e)
    {
        tarea.appendText("Title\t\t\t\tDesc\t\t\t\t\tPrice\t\t\tCopies\tTotal"+"\n");
        try
        {
            Scanner input = new Scanner(file);
            
            while(input.hasNext())
            {
                String s = input.next();
                Scanner i = new Scanner(s);
                i.useDelimiter(",");
                String bn = i.next();
                String d = i.next();
                double up = i.nextDouble();
                int nc = i.nextInt();
                double total = up * nc;
                
                tarea.appendText(bn+"\t\t\t"+d+"\t\t"+up+"\t\t\t"+nc+"\t\t"+total+"\n");
                
            }
            input.close();
        }
        catch(IOException error)
        {
            System.out.println("error in file read ");
        }
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
