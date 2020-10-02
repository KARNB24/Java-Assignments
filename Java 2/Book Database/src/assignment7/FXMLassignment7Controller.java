/*
 * Karn Bhavsar
 * Student ID: 991578281
 * PROG24178 - Object Oriented Programming 2 - JAVA
*/

package assignment7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
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
public class FXMLassignment7Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    
        ArrayList<Book> list = new ArrayList<Book>();
        static int record=0;
        PrintWriter output;
        Scanner input;
        File file =  new File("book.txt");
        
        @FXML private Button btnadd;
        @FXML private Button btnsave;
        @FXML private Button btnexit;
        @FXML private Button btnwrite;
        @FXML private Button btnnext;
        @FXML private Button btnprevious;
        @FXML private Button btnedit;
        @FXML private Button btndisplay;
        @FXML private Button btnsearch;
        @FXML private TextField txtbname;
        @FXML private TextField txtaname;
        @FXML private TextField txtprice;
        @FXML private TextField txtquantity;
        @FXML private TextField txtbsearch;
        @FXML private TextArea tarea;
        
        @FXML
        private void edit(ActionEvent event)
        {
            btnsave.setDisable(false);
            btnadd.setDisable(true);
            if(record==0)
                btnprevious.setDisable(true);
            else
                btnprevious.setDisable(false);

            if(record==list.size()-1)
                    btnnext.setDisable(true);
            else
                    btnnext.setDisable(false);
        }
        
        @FXML
        private void previous(ActionEvent event)
        {
            record--;
            txtbname.setText(list.get(record).getBookname());
            txtaname.setText(list.get(record).getAuthor());
            txtprice.setText(String.valueOf(list.get(record).getPrice()));
            txtquantity.setText(String.valueOf(list.get(record).getQuantity()));
            if(record==0)
                btnprevious.setDisable(true);
            else
                btnprevious.setDisable(false);

            if(record==list.size()-1)
                    btnnext.setDisable(true);
            else
                    btnnext.setDisable(false);
        }
        
        @FXML
        private void next(ActionEvent event)
        {
            record++;
            txtbname.setText(list.get(record).getBookname());
            txtaname.setText(list.get(record).getAuthor());
            txtprice.setText(String.valueOf(list.get(record).getPrice()));
            txtquantity.setText(String.valueOf(list.get(record).getQuantity()));
            if(record==list.size()-1)
                    btnnext.setDisable(true);
            else
                    btnnext.setDisable(false);

            if(record==0)
                btnprevious.setDisable(true);
            else
                btnprevious.setDisable(false);

        }
        
        @FXML
        private void add(ActionEvent event)
        {
            record=list.size();
            System.out.println("add record="+record+"size="+list.size());
            txtbname.clear();
            txtaname.clear();
            txtprice.clear();
            txtquantity.clear();        
        }
        
        @FXML
        private void save(ActionEvent event)
        {
            Book b=new Book();
            b.setBookname(txtbname.getText());
            b.setAuthor(txtaname.getText());
            b.setQuantity(Integer.parseInt(txtquantity.getText()));
            b.setPrice(Double.parseDouble(txtprice.getText()));
            if(record==list.size())
            {
                list.add(b);
                System.out.println("save if record="+record+"size="+list.size());
            }
            else
            {
                list.set(record, b);
                System.out.println("save if record="+record+"size="+list.size());
            }
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
        
         @FXML
        private void write(ActionEvent event)
        {
            try
            {
                PrintWriter pr=new PrintWriter(file);
                System.out.println("printwiter pr empty file");
                pr.print("");
                pr.close();

                FileWriter fw=new FileWriter(file,true); //append mode
                output=new PrintWriter(fw);
                System.out.println("printwriter output append mode");
                for(int i=0;i<list.size();i++)
                {
                    output.println(list.get(i).getBookname()+","+list.get(i).getAuthor()+","+list.get(i).getPrice()+","+list.get(i).getQuantity());
                }
                output.close();
            }
            catch(Exception e)
            {
                System.out.println("error in write");
            }
        }
        
        @FXML
        private void display(ActionEvent e)
        {
            tarea.appendText("Name\t\t\t\tAuthor\t\t\t\t\tPrice\t\t\tQuantity\tTotal"+"\n");
            try
            {
                Scanner input = new Scanner(file);

                while(input.hasNext())
                {
                    String s = input.next();
                    Scanner i = new Scanner(s);
                    i.useDelimiter(",");
                    String bn = i.next();
                    String a = i.next();
                    double bp = i.nextDouble();
                    int q = i.nextInt();
                    double total = bp * q;

                    tarea.appendText(bn+"\t\t\t"+a+"\t\t"+bp+"\t\t\t"+q+"\t\t"+total+"\n");

                }
                input.close();
            }
            catch(IOException error)
            {
                System.out.println("error in file read ");
            }

        }
        
        @FXML
        private void search(ActionEvent e)
        {
            if(txtbsearch.getText() != null)
            {
                for(int i=0; i<list.size(); i++)
                {
                    if(list.get(i).getBookname().equals(txtbsearch.getText()))
                    {
                        String b = list.get(i).getBookname();
                        String a = list.get(i).getAuthor();
                        double p = list.get(i).getPrice();
                        int q = list.get(i).getQuantity();
                        double total = p * q;
                        
                        tarea.appendText(b+"\t\t"+a+"\t\t"+p+"\t\t"+q+"\t\t"+total);
                        
                        
                        
                    }
                    else
                    {
                        tarea.clear();
                        tarea.appendText("Book Data not found");
                    }
                }
            }
            
        }
        
        
        
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        try
        {
          if(file.exists())
          {

              input=new Scanner(file);
              while(input.hasNext())
              {
                  String s=input.next();
                  Scanner r=new Scanner(s);
                  
                  r.useDelimiter(",");
                  Book b=new Book();
                  b.setBookname(r.next());
                  b.setAuthor(r.next());
                  b.setQuantity(r.nextInt());
                  b.setPrice(r.nextDouble());
                  list.add(b);
                  txtbname.setText(list.get(record).getBookname());
                  txtaname.setText(list.get(record).getAuthor());
                  txtquantity.setText(String.valueOf(list.get(record).getQuantity()));
                  txtprice.setText(String.valueOf(list.get(record).getPrice()));
                  
              }
          }
          else
          {
              System.err.println("file not exists add record first");
          }
          input.close();
        }
      catch(Exception e)
      {
          System.out.println("error in initialize");
      }
        
        
    }    
    
}
